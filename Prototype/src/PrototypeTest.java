/**
 * @author admin
 * @version 1.0.0
 * @ClassName Prototype.java
 * @Description 原型模式基础 例子
 * @createTime 2020年09月21日 16:28:00
 */

class Realizetype implements Cloneable {
    Realizetype(){
        System.out.println("具体原型创建成功");
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        System.out.println("具体原型复制成功");
        return (Realizetype)super.clone();
    }
}

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype rel1=new Realizetype();
        Realizetype rel2=(Realizetype)rel1.clone();
        System.out.println("rel1==rel2? "+(rel1==rel2));
    }
}
