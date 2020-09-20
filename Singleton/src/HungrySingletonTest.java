public class HungrySingletonTest
{
    public static void main(String[] args)
    {
        System.out.println("饿汉单例模式测试");
        Bajie obj1=Bajie.getInstance();
        Bajie obj2=Bajie.getInstance();
        if(obj1==obj2)
        {
            System.out.println("他们是同一人！");
        }
        else
        {
            System.out.println("他们不是同一人！");
        }
    }
}
class Bajie
{
    private static Bajie instance=new Bajie();
    private Bajie()
    {
        System.out.println("产生一个八戒");
    }
    public static Bajie getInstance()
    {
        return instance;
    }
}