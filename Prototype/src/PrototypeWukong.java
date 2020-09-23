/**
 * @author admin
 * @version 1.0.0
 * @ClassName PrototypeWukong.java
 * @Description 原型模式--复制相同的猴子
 * @createTime 2020年09月21日 16:41:00
 */
class SunWukong  implements Cloneable{
    String name;
    public SunWukong(){
        name="monkey";
        System.out.println("活捉一只猴子");
    }
    @Override
    public Object clone(){
        SunWukong w=null;
        try{
            w=(SunWukong)super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("活捉猴子失败");
        }
        return w;
    }
}

public class PrototypeWukong {
    public static void main(String[] args) {
        SunWukong s1=new SunWukong();
        System.out.println(s1.name);
        SunWukong s2=(SunWukong)s1.clone();
        System.out.println(s2.name);
        System.out.println("s1.equal(s2):"+s1.equals(s2));
        System.out.println("s1==s2:"+(s1==s2));
        System.out.println("s1.name==s2.name:"+(s1.name==s2.name));
    }
}
