// public class Question {
//     public static int occurance(int arr[], int index, int key, int count){
        
//         if(index == arr.length){
//             System.out.println(count);
//             return -1;
//         }
//         if(arr[index] == key){
//             count++;
//             System.out.println(index);
//         }

//         return occurance(arr, index+1, key, count);
//     }
//     public static void main(String[] args) {
//         int arr[] = {3,2,4,5,6,2,7,2,2};
//         int key = 2;
//         int count=0;
//         occurance(arr, 0, key, count);
//     }
// }

// import java.util.*;
// public class Question {
//    static String digit[] = {"zero","one","two","three","four","five","six","seven","eigth","nine"};
//     public static void convert(int number){
//         if(number==0){
//             return;
//         }

//         int lastNumber = number%10;
//         convert(number/10);
//         System.out.println(digit[lastNumber]+" ");
        
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
     
//         convert(n);
//     }
// }


// public class Question {

//     public static void length(String st, int i){
//         if(i==st.length()){
//             System.out.println(st.length());
//             return;
//         }
        
//         length(st, i+1);
    
//     }

//     public static void main(String[] args) {
//         String st = "abcdsgvdghavdghvghd";
//         length(st,0);
//     }
// }



// public class Question{
//     public static void subString(String s, int i){
//         int length = s.length();
//         if(s.length()==1){
//             return;
//         }
//         char ch = s.charAt(i);

//         int a = substring(s , i+1);
//         int b = 

//     }
//     public static void main(String[] args) {
//         String s = "abcab";
//         subString(s,0);
//     }
// }



public class Question{

    static int countSubString(String s){

        int result = 0;
        int n = s.length();

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(s.charAt(i) == s.charAt(j)){
                    result++;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String s = "abcab";
        System.out.println(countSubString(s));
    }
}