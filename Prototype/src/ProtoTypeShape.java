import java.util.HashMap;
import java.util.Scanner;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ProtoTypeShape.java
 * @Description 原型模式-原型管理
 * @createTime 2020年09月23日 14:46:00
 */

interface Shape extends Cloneable {
    public Object clone();

    /**
     * @throws
     * @title 计算面积
     * @description
     * @author zoewoc
     * @updateTime 2020/9/23 2:51 下午
     */
    public void calcArea();
}

class Circle implements Shape {
    @Override
    public Object clone() {
        Circle circle = null;
        try {
            circle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝圆形失败");
        }
        return circle;
    }

    @Override
    public void calcArea() {
        int r = 0;
        System.out.println("这是一个圆，请输入圆的半径：");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.println("该园的面积为：" + 3.14 * r * r);
    }
}

class Square implements Shape {
    @Override
    public Object clone() {
        Square square = null;
        try {
            square = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝正方形失败");
        }
        return square;
    }

    @Override
    public void calcArea() {
        int a = 0;
        System.out.println("这是一个正方形，请输入它的边长：");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("该正方形的面积为：" + a * a);
    }
}

class ProtoTypeManager {
    private HashMap<String, Shape> ht = new HashMap<>();

    public ProtoTypeManager() {
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }

    public void addShape(String shapeName, Shape shape) {
        ht.put(shapeName, shape);
    }

    public Shape getShape(String shapaName) {
        Shape shape = ht.get(shapaName);
        return (Shape) shape.clone();
    }
}


public class ProtoTypeShape {
    public static void main(String[] args) {
        ProtoTypeManager ptM=new ProtoTypeManager();
        Shape shape1=ptM.getShape("Circle");
        shape1.calcArea();
        Shape shape2=ptM.getShape("Square");
        shape2.calcArea();
    }
}
