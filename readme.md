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