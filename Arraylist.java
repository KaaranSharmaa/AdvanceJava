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