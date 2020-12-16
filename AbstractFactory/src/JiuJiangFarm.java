/**
 * @author zoewoc
 * @version 1.0.0
 * @ClassName JiuJiangFarm.java
 * @Description 九江农场
 * @createTime 2020年12月16日 16:51:00
 */
public class JiuJiangFarm implements Farm {
    @Override
    public Animal newAnimal() {
        System.out.println("小马出生");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("长出水果");
        return new Fruit();
    }
}
