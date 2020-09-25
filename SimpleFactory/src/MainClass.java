/**
 * @author zoewoc
 * @version 1.0.0
 * @ClassName MainClass.java
 * @Description TODO
 * @createTime 2020年09月25日 10:53:00
 */
public class MainClass {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Fruit apple = FruitFactory.getApple();
        apple.get();
        Fruit banana = FruitFactory.getBanana();
        banana.get();

        Fruit apple1=FruitFactory.getFruit("apple");
        apple1.get();
        Fruit banana1=FruitFactory.getFruit("banana");
        banana1.get();

        Fruit apple2=FruitFactory.getFruit1("Apple");
        apple1.get();
        Fruit banana2=FruitFactory.getFruit1("Banana");
        banana1.get();
    }
}
