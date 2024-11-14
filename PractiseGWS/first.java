
import java.util.Scanner;

public class first {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter you value:");
    int val = sc.nextInt();

    if(val % 2 == 0){
        System.out.println("Even");
    }else{
        System.out.println("Odd");
    }

    }
}
