/**
 * @author zoewoc
 * @version 1.0.0
 * @ClassName AppleFactory.java
 * @Description TODO
 * @createTime 2020年09月25日 14:20:00
 */
public class AppleFactory implements FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
