// import java.util.*;
// public class switch_case {
//     public static void main(String[] args){
//         Scanner button = new Scanner(System.in);
//         int a = button.nextInt();
//         switch(a)
//         {
//             case 1 : System.out.println("Hello");
//             break;
//             case 2 : System.out.println("Namaste");
//             break;
//             case 3 : System.out.println("Banjor");
//             break;
//             default: System.out.println("Invalid button");
//         }
//     }
// }


import java.util.*;
public class switch_case{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     
        int a,b;
        System.out.println("ENter two value: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter 1 for add");
        System.out.println("Enter 2 for subtract");
        System.out.println("Enter 3 for multiple");
        System.out.println("Enter 4 for divide");
        System.out.println("Enter 5 for module");
        int button = sc.nextInt();
        switch(button){
            case 1 : 
            System.out.println(a+b);
            break;
            case 2 :
             System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;
            case 5: System.out.println(a%b);
            break;
            default: System.out.println("Invalid input");
        }
    }
}