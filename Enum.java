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