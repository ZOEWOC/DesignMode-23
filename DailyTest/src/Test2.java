/**
 * @author zoewoc
 * @version 1.0.0
 * @ClassName Test2.java
 * @Description static 关键字测试2
 * @createTime 2020年09月23日 17:46:00
 */
public class Test2 {
    Person person = new Person("Test");
    static{
        System.out.println("test static");
    }

    public Test2() {
        System.out.println("test constructor");
    }

    public static void main(String[] args) {
        new MyClass();
    }
}

class Person{
    static{
        System.out.println("person static");
    }
    public Person(String str) {
        System.out.println("person "+str);
    }
}


class MyClass extends Test2 {
    Person person = new Person("MyClass");
    static{
        System.out.println("myclass static");
    }

    public MyClass() {
        System.out.println("myclass constructor");
    }
}
