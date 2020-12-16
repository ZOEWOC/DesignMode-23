/**
 * @author zoewoc
 * @version 1.0.0
 * @ClassName AbstractFactoryTest.java
 * @Description 抽象工厂测试类
 * @createTime 2020年12月16日 17:01:00
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        Farm f;
        Plant p;
        Animal a;
        f=new GuangZhouFarm();
        p=f.newPlant();
        p.show();
        a=f.newAnimal();
        a.show();
    }
}
