/**
 * @author zoewoc
 * @version 1.0.0
 * @ClassName PearFactory.java
 * @Description TODO
 * @createTime 2020年09月25日 14:26:00
 */
public class PearFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}
