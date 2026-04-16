abstraction-:We use it when when we dont know what the method woill do so we just mention it and leave it there 
for future and  it has to be define in the object when the class is called for sure
and we canot create the object of asbract class
abstract class car {
    public abstract void drive();

    public void music() {
        System.out.println("Play Music");
    }
}

class ac extends car {

    public void drive() {
        System.out.println("Driving car");
    }

    public void ac() {
        System.out.println("turn on ac");
    }
}

class abstraction {
    public static void main(String[] args) {

        ac obj = new ac();
        obj.music();
        obj.drive();
    }
}

**********************************************************************************************************
Inner Class-: class inside the class

class A{
    public void a(){
        System.out.println("In A");
    }
    class B{
        public void b(){
        System.out.println("In B");
    }
    class innerclass
    {
        public static void main(String a[]){
         A obj=new A();

        }
    }

    }
}
**********************************************************************************************************
Enumm class if like the arry strt with key word enum 
enum alphabet{
    a,b,c,d;
}
public class Enum{
    public static void main(String[] args) {
        alphabet alpha = alphabet.c;
        switch(alpha) {
            case a:{
                System.out.println(alphabet.a +" A");
            }
            break;
            case b:{
                System.out.println(alphabet.b +" B");
            }
            break;
            case c:{
                System.out.println(alphabet.c +" C");
            }
            break;
            case d:{
                System.out.println(alphabet.d +" D");
            }
                
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
**********************************************************************************************************
interface -: we use it when want to the design only we use it 
it cant be used further like abstract, bydefault all the variable are final and static 
**********************************************************************************************************
Type of interface -: there are three type opf 
1. Normal Interface
2. Functional Interface (SAM – Single Abstract Method Interface)
3. Marker Interface

Normal Interface-: A normal interface is an interface that contains two or more abstract
methods
Functional Interface (SAM – Single Abstract Method Interface)-:is an interface that contains only one abstract method.
Marker Interface-:not contain any methods, fields,or constants
**********************************************************************************************************
Anonymous Inner Class
Aclass wgich is define intside the public static void main
interface a{
    void show();
}

class AnonymousInnerClass{
    public static void main(String[] args) {
        a obj = new a(){
        public void show(){
            System.out.println("in show");
            // obj.show();
        }
        } ;   
  obj.show();  }   
        
}
**********************************************************************************************************
Error in javaError in java 
there are thre type of error in java 
1. Compile-time errors-:Compile-time errors are errors that are detected by the compiler when a
program is being compiled. These errors occur due to incorrect syntax, missing
files, or other issues that prevent the program from being compiled.
2. Logical errors-:Logical errors are errors that occur when the program runs successfully, but the
output is not what was expected. These errors do not cause compilation or
runtime issues, but they cause incorrect results.
3. Runtime errors (exceptions)-:Runtime errors occur while the program is running. These errors typically
happen when something unexpected occurs, such as trying to divide by zero,
accessing an invalid index in an array, or working with unavailable resources
(like files). These errors are also called exceptions.
**********************************************************************************************************
Try and catch is used in Runtime errors intry we type tthe logic will in whichwe can see that it can have error  so we enter the logic there and in catch we type the response we want in return if error ocurs
**********************************************************************************************************
taking input from users using scaaner method earlier we use to have buffer methods

Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
System.out.println(num);
Scanner = Java ka class jo input lene ke liye use hota hai
System.in = keyboard input (user jo type karega)
nextInt() = user se integer (number) leta hai


Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
**********************************************************************************************************
threading means that we divid the task into small parts 
The smallest and lightest unit of execution within a process is called a Thread.
and then there is a schudiler that decide ki which prooces will run we can suggest only.
 They allow processes to perform multiple
tasks in parallel by breaking them into smaller, independent units.
**********************************************************************************************************
Multithreads 
Multithreading in Java is a powerful feature that allows developers to create
responsive and efficient applications. While creating and managing threads
manually is useful for understanding the basics, advanced applications often
rely on frameworks and tools that handle thread management automatically. By
leveraging multithreading, we can ensure our programs make the most out of
modern multi-core systems.


Also very important method name should be run() to run it it should start from start()
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
**********************************************************************************************************
thread priorty (its is just suggestion)
so basically there is a option of also to priortize the thread like which one you want you can suggest
by using method to set the priorty .setPriority to get prioty getPriority 10 is the maximun and 0 is the mimimun
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
public class threadpriority {
    public static void main(String[] args) {
        
        a obj=new a();
        b obj1=new b();
        obj.setPriority(1);
        obj1.setPriority(10);
        obj.start();
        obj1.start();
        System.err.println(obj.getPriority());
    }
}


**********************************************************************************************************
The join method basically makes the current thread wait until the thread you call join on finishes. In other words, if you say threadA.join(), it means the code will pause at that point until threadA is completely done running. Once threadA is finished, only then will the next line of code execute. It’s a way to ensure one thread finishes before the next steps happen.
obj.start();   // Start thread A first
        obj.join();    // Wait for thread A to finish completely

        obj1.start();  // Only now start thread B


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

**********************************************************************************************************
Sleep it use to pause the thread for while the time is given in milisecound syntax is 

try{
        Thread.sleep(1900);}
        catch(InterruptedException e){
            System.err.println("error");
        }

Always given in try and catch so that to catch the errors     InterruptedException is the type of error
**********************************************************************************************************
Arraylist  in java
Iterable
  ↓
Collection
  ├── List
  │     ├── ArrayList
  │     ├── LinkedList
  │     └── Vector
  │            └── Stack
  │
  ├── Queue
  │     ├── PriorityQueue
  │     └── Deque
  │            └── ArrayDeque
  │
  └── Set
        ├── HashSet
        │     └── LinkedHashSet
        └── SortedSet
              └── TreeSet

              import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Arraylist{
    public static void main(String[] args) {
        List <Integer> num =new LinkedList <Integer>( );
        Collection <Integer> number =new LinkedList <Integer>( );
            num.add(10);
            num.add(10);
            num.add(20);
            num.add(30);
            num.add(50);
            num.add(60);
            num.add(70);
            num.add(80);
            num.remove(3);//it removes the value not the indexs in collection
            System.out.println(num);
            number.add(10);
            number.add(10);
            number.add(20);
            number.add(30);
            number.add(50);
            number.add(60);
            number.add(70);
            number.add(80);
            number.remove(10);
            System.out.println(number);
    }
}
**********************************************************************************************************
Sets
Feature	List	Set
Index	✅ Yes	❌ No
Duplicates	✅ Allowed	❌ Not allowed
Order	✅ Maintained	❌ Not guaranteed (HashSet)

import java.util.HashSet;
import java.util.Set;

public class sets{
    public static void main(String[] args) {
        Set <Integer> num =new HashSet <Integer>();
        num.add(30) ;
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40) ;
        System.out.println(num);
    }
}

//out put
// [20, 40, 10, 30]



