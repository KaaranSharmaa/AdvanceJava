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
public class Jointhread {
    public static void main(String[] args) throws InterruptedException {
        
        a obj=new a();
        b obj1=new b();
        obj.setPriority(1);
        obj1.setPriority(10);
        obj.start();
        obj.join();
        obj1.start();
        System.err.println(obj.getPriority());
    }
}