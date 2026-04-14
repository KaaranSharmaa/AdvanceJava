import  java.util.Scanner;
public class scanner{
    public static void main(String[] args) {
        System.out.println("Enter the number beolow and we will add it by 2 and display it to you");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       System.out.println(num+2);
    }
}