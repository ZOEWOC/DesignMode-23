/**
 * @author zoewoc
 * @version 1.0.0
 * @ClassName FruitFactory.java
 * @Description TODO
 * @createTime 2020年09月25日 10:57:00
 */
public class FruitFactory {

    //实现方式1
    /**
     * 获取苹果实例
     * @return
     */
    public static Fruit getApple() {
        return new Apple();
    }

    /**
     * 获取香蕉实例
     * @return
     */
    public static Fruit getBanana() {
        return new Banana();
    }

    //实现方式2
    public static Fruit getFruit(String type) throws InstantiationException, IllegalAccessException {
        if ("apple".equalsIgnoreCase(type)) {
            return Apple.class.newInstance();
        } else if ("banana".equalsIgnoreCase(type)) {
            return Banana.class.newInstance();
        } else {
            return null;
        }
    }

    //实现方式3
    public static Fruit getFruit1(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
            Class fruit=Class.forName(type);
            return (Fruit)fruit.newInstance();
    }
}
