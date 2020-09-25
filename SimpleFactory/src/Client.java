/**
 * @author zoewoc
 * @version 1.0.0
 * @ClassName Client.java
 * @Description 简单工厂模式
 * @createTime 2020年09月23日 18:03:00
 */
public class Client {
    public static void main(String[] args) {
        Product p1=(Product) SimpleFactory.makeProduct(0);
        System.out.println(p1);
        p1.show();
        Product p2=(ConcreteProduct2)SimpleFactory.makeProduct(1);
        System.out.println(p2);
        p2.show();
        System.out.println(SimpleFactory.makeProduct(2));
    }

    //抽象产品
    public interface Product {
        void show();
    }

    //具体产品：ProductA
    static class ConcreteProduct1 implements Product {
        @Override
        public void show() {
            System.out.println("具体产品1显示...");
        }
    }

    //具体产品：ProductB
    static class ConcreteProduct2 implements Product {
        @Override
        public void show() {
            System.out.println("具体产品2显示...");
        }
    }

    final class Const {
        static final int PRODUCT_A = 0;
        static final int PRODUCT_B = 1;
        static final int PRODUCT_C = 2;
    }

    static class SimpleFactory {
        public static Product makeProduct(int kind) {
            switch (kind) {
                case Const.PRODUCT_A:
                    return new ConcreteProduct1();
                case Const.PRODUCT_B:
                    return new ConcreteProduct2();
            }
            return null;
        }
    }
}