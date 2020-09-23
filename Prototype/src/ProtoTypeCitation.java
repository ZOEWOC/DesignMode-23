/**
 * @author admin
 * @version 1.0.0
 * @ClassName ProtoTypeCitation.java
 * @Description 原型模式-复制相似的奖状
 * @createTime 2020年09月22日 11:59:00
 */
public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException{
        Citation citation = new Citation("张三", "同学：在2020学年第一学期中表现优秀，被评为法外狂徒。", "社会大学");
        citation.display();
        Citation citation2=(Citation)citation.clone();
        citation2.setName("李四");
        citation2.setInfo("同学：在2020学年第一学期中表现优秀，被评为法外狂魔。");
        citation2.display();
    }
}

class Citation implements Cloneable {
    String name;
    String info;
    String college;


    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功");
    }

    void display() {
        System.out.println(name + info + college);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        System.out.println("奖状拷贝成功");
        return (Citation) super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String getCollege() {
        return college;
    }
}