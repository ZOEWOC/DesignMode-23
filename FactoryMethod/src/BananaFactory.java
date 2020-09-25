/**
 * @author zoewoc
 * @version 1.0.0
 * @ClassName BananaFactory.java
 * @Description TODO
 * @createTime 2020年09月25日 14:21:00
 */
public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
