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

