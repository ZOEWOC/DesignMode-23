/**
 * @author zoewoc
 * @version 1.0.0
 * @ClassName MainClass.java
 * @Description TODO
 * @createTime 2020年09月25日 10:53:00
 */
public class MainClass {
    public static void main(String[] args) {
        FruitFactory ff = new AppleFactory();
        Fruit apple = ff.getFruit();
        apple.get();

        FruitFactory ff1 = new BananaFactory();
        Fruit banana = ff1.getFruit();
        banana.get();

        FruitFactory ff2 = new PearFactory();
        Fruit pear = ff2.getFruit();
        pear.get();

    }
}
