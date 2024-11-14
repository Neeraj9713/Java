// // (01):-Write a Java program to get the character at the given index within the String.
// import java.util.*;
// public class string_practise {
//   public static void main(String args[]){
   
//     String sc = "Neeraj kalawat";
//     int index = sc.charAt(1);
//     // int index2 = sc.charAt(7);
    
//     index = sc.codePointBefore(1);
//     System.out.println("Character(unicode point) = " + index);

//     System.out.println((char)index);
//     System.out.println(index);        //unicode
//     //  System.out.println((char)index2);
    
//   }
// }

// // (02):-Write a Java program to count a number of Unicode code points in the specified text range of a String.
// public class Main{
//     public static void main(String args[]){
//       String sc = "raju yadav";
//       int rc = sc.codePointCount(0,sc.length());
//       System.out.print(rc);
//     }
//   }

public class string_practise {
    
    public static void main(String[] args) {

        String s1 = "NeeraJ";
        char ch;
        String str2 = "";
        for(int i=0; i<s1.length(); i++){
            ch = s1.charAt(i);
            str2 = ch + str2;
        }
        System.out.println(str2);
        if(s1.equals(str2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}


