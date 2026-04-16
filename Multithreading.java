class a extends Thread{
   public  void run(){
        for (int i = 0; i < 100; i++) 
        {
        System.out.println("in show");
        }
    }
}
class b extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++)
         {
        System.out.println("in show1");
        }
    }
}
public class Multithreading {
    public static void main(String[] args) {
        a obj=new a();
        b obj1=new b();
        obj.start();
        obj1.start();
    }
}
