import javax.swing.*;
import java.awt.*;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName PrototypeWukong.java
 * @Description TODO
 * @createTime 2020年09月21日 16:41:00
 */
class SunWukong extends JPanel implements Cloneable{
    private static final long serialVersionUID=5543049531872119328L;
    public SunWukong(){
        JLabel l1=new JLabel(new ImageIcon("resources/Wukong.jpg"));
        this.add(l1);
    }
    @Override
    public Object clone(){
        SunWukong w=null;
        try{
            w=(SunWukong)super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("复制悟空失败");
        }
        return w;
    }
}

public class PrototypeWukong {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("原型模式测试");
        jFrame.setLayout(new GridLayout(1,2));
        Container container=jFrame.getContentPane();
        SunWukong s1=new SunWukong();
        container.add(s1);
        SunWukong s2=(SunWukong)s1.clone();
        container.add(s2);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
