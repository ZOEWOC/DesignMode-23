/**
 * @author zoewoc
 * @version 1.0.0
 * @ClassName Test1.java
 * @Description static 关键字测试1
 * @createTime 2020年09月23日 17:45:00
 */
public class Test1 extends Base{

    static{
        System.out.println("test static");
    }

    public Test1(){
        System.out.println("test constructor");
    }

    public static void main(String[] args) {
        new Test1();
    }
}

class Base{

    static{
        System.out.println("base static");
    }

    public Base(){
        System.out.println("base constructor");
    }
}