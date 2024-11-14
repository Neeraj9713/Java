// import java.util.*;
// public class stringbuilder {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Tony");

//         //char at index 0
//         // System.out.println(sb.charAt(0));

//         //set char at index 0
//         sb.setCharAt(0, 'P');
//         System.out.println(sb);

//         //insert 
//         sb.insert(2,'n');
//         System.out.println(sb);

//         //delete the extra
//         sb.delete(2,3);
//         System.out.println(sb);
        
//         //append
//         sb.append("e");
//         System.out.println(sb);
        
        
//     }
// }

// // How to reverse a string..?
// import java.util.*;
// public class stringbuilder {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         StringBuilder sb = new StringBuilder(name);

//         for(int i=0; i<sb.length()/2; i++){
//             int front = i;
//             int back = sb.length()-1-i;

//             char frontchar = sb.charAt(front);
//             char backchar = sb.charAt(back);

//             sb.setCharAt(front,backchar);
//             sb.setCharAt(back,frontchar);
//         }
        
//         System.out.println(sb);
        
//     }
// }

import java.util.*;
public class stringbuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch+" ");
        }
        System.out.print(sb);
    }
}