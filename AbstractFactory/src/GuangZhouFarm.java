/**
 * @author zoewoc
 * @version 1.0.0
 * @ClassName GuangZhouFarm.java
 * @Description 广州农场
 * @createTime 2020年12月16日 16:52:00
 */
public class GuangZhouFarm implements Farm {
    @Override
    public Animal newAnimal() {
        System.out.println("小牛出生");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("长出蔬菜");
        return new Vegetable();
    }
}
