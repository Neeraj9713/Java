

//     // Online Java Compiler
// // Use this editor to write, compile and run your Java code online
// import java.util.*;
// class Arrayfind{
// public static void arrayFind(int arr[]){
//     ArrayList<Integer>even = new ArrayList<>();
//     ArrayList<Integer>odd = new ArrayList<>();
    
//     for(int i=0; i<arr.length; i++){
//         if(i%2 == 0){
//             even.add(arr[i]); 
//         }
//         else {
//             odd.add(arr[i]);
//         }
//     }
//     Collections.sort(even);
//     Collections.sort(odd);
//     int size = even.size();
//     int secLarg = even.get(size-2);
//     int small = odd.get(1);
//     int sum = secLarg + small;
//     System.out.print(sum);
// }
//     public static void main(String[] args) {
//       int arr[] = {3 ,2 ,1 ,7 ,5 ,4};
//       arrayFind(arr);
//     }
// }



// import java.util.*;
// class Arrayfind{
// public static int arrayFind(int m , int n){
//     int sum = 0;
//     int sum1 = 0;
//     for(int i=1; i<=n; i++){
//         if(i%m!=0){
//             sum+=i;
//         }
//         else{
//             sum1+=i;
//         }
//     }
// int min = sum -sum1;
// return min;

// }
//     public static void main(String[] args) {
//       int m = 3;
//       int n = 10;
//       System.out.println(arrayFind(m,n));
//     }
// }




// import java.util.*;
// class Arrayfind{
// public static boolean stringP(String i, String i2){
  
//     i=i.toLowerCase();
//     i2 = i2.toLowerCase();
//     char arr[] = i.toCharArray();
//     char arr1[] = i2.toCharArray();

//     Arrays.sort(arr);
//     Arrays.sort(arr1);

//     i = new String(arr);
//     i2 = new String(arr1);

// return i.equals(i2);
// }
//     public static void main(String[] args) {
//       String i = "Listen";
//       String i2 = "Silent";
//       System.out.println(stringP(i,i2));
//     }
// }






// import java.util.*;
// class Arrayfind{
// public static int sumOf(int sum, int arr[]){
  
//     Arrays.sort(arr);
    
//         if(sum <=arr[0]+arr[0]){
//         return 0;
//         }
        
        
//         int product = arr[0]*arr[1];

// return product;
// }
//     public static void main(String[] args) {
//       int sum = 9;
//       int arr[] = {9,8,-7,3,9,3};
//       System.out.println(sumOf(sum, arr));
//     }
// }





// import java.util.*;
// class Arrayfind{
// public static String sumOf(int n, int m){
  
//     StringBuilder sb = new StringBuilder();
//     while(m>0){
//         int module = m % n;
//         char digit;
//         if(module<10){
//             digit = (char)('0'+ module);
//         }
//         else{
//             digit = (char)('A'+(module-10));
//         }
//         sb.insert(0,digit);      //insert index 0 and slid value in 1 
//         m = m/n;
//     }
//     return sb.toString();
// }
//     public static void main(String[] args) {
//       int n = 21;
//       int m= 5678;
//       System.out.println(sumOf(n,m));
//     }
// }






// // import java.util.*;
// class Arrayfind{
// public static int sumOf(int n, int m){
    
//     int count=0;
//     int carry = 0;
//     int j=0; 
//     while(n>0 || m>0){
//         int remainder = n%10;
//         int remainder1 = m%10;
//         j = j + remainder + remainder1;
//         if(j>=10){
//             count++;
//         }
//         j = j/10;
//         n = n/10;
//         m = m/10;
//     }

//     return count;
// }
//     public static void main(String[] args) {
//       int n = 23;
//       int m= 563;
//       System.out.println(sumOf(n,m));
//     }
// }



// import java.util.*;
// class Arrayfind{
// public static String Replace(String str, char c1 , char c2){
//     String str2 = "";

//     for(int i=0; i<str.length(); i++){
//         char c = str.charAt(i);
//         if(c == c1){
//             c = c2;
//             str2 = str2 + c;
            
//         }
//         else if(c == c2){
//             c = c1;
//             str2 = str2 + c;
//         }
//         else{
//             str2 = str2 + c;
//         }
//             // str2 +=str.charAt(c);
//     }
//     return str2;
   
// }
//     public static void main(String[] args) {
//     String str = "apples";
//     char c1 = 'a';
//     char c2 = 'p';
//     System.out.println(Replace(str, c1, c2));
//     }
// }





// import java.util.*;
// class Arrayfind{
// public static int switch1(int a, int b , int c){
//     int m = 0;
//         switch (c) {
//                 case 1 :
//                     m= a+b;
//                     break;
//                 case 2 :
//                     m= a-b;
//                     break;
//                 case 3 :
//                     m= a*b;
//                     break;
//                 case 4 :
//                     m= a/b;
//                     break;
//                 default :
//                     m = -1;
//         }
//     return m;
// }
//     public static void main(String[] args) {
//    int a = 12;
//    int b = 16;
//    int c = 1;
//     System.out.println(switch1(a, b, c));
//     }
// }


// 9. Perform the function Int calculate(int m, int n). This function needs two positive integers. Calculate the sum of numbers between these two numbers that are divisible by 3 and 5.
// Assumption
// m > n > = 0

// Example

// Input:
// m: 12
// n: 50

// Output:
// 90

// Explanation
// The numbers between 12 and 50 that are divisible by 3 and 5 are 15, 30, and 45. The sum of these numbers is 90.

// Sample input:
// m: 100
// n: 160

// Sample output:
// 405
 
// import java.util.*;
// class Arrayfind{
// public static int output(int a, int b ){
//    int sum =0;
//     for(int i = a; i<=b; i++){
//         if( i % 3 == 0 && i % 5==0){
//                 sum +=i;
//                 int s = sum;
//                 int val =0;

//         }
//     }
//     return sum;
// }
//     public static void main(String[] args) {
//    int a = 12;
//    int b = 50;
//     System.out.println(output(a, b));
//     }
// }






// import java.util.*;
// class Arrayfind{
// public static int output(int arr[]){
//     int n = arr.length;
//     int even[] = new int[arr.length/2 + arr.length%2];
//     int odd[] = new int[arr.length/2];

//     int evenIndex=0;
//     int oddIndex=0;
//     for(int i=0; i<arr.length; i++){
//         if(i % 2 ==0){
//             even[evenIndex++] = arr[i];
//         }
//         else{
//             odd[oddIndex++] = arr[i];
//         }
//     }
//     Arrays.sort(even);
//     Arrays.sort(odd);
//     int last = (even.length>=2)?even[even.length-2]:0;
//     int last1 =(odd.length>=2)?odd[odd.length-2]:0;
//     return last+last1;
// }
//     public static void main(String[] args) {
//    int arr[] = {5,7,9,5};
//     System.out.println(output(arr));
//     }
// }



// import java.util.*;
// class Arrayfind{
// public static int xor(String s){
//     int result =1;
//     for(int i=0; i<s.length(); i++){
//         char ch = s.charAt(i);
//         if(ch == '0'){
//             result = result & 0;
//         }
//         else if(ch == '1'){
//             result = result | 1;
//         }
//         else if(ch == 'A'){
//             result = result & 0;
//         }
//         else if(ch == 'B'){
//             result = result | 1;
//         }
//         else if(ch == 'C'){
//             result = result ^ 1;
//         }
//     }
// return result;
// }
//     public static void main(String[] args) {
//     String s = "1C0C1C1A0B1";
//     System.out.println(xor(s));
//     }
// }

// 12. Perform the function Checkpassword (char str[], int n)
// Execute the function which happens to be 1 if the str is a valid password or it remains 0.

// Conditions for a valid password: 

// The password should have at least 4 characters.
// It should have at least 1 digit.
// It should have one capital letter.
// It should not have any spaces or obliques (/).
// The first character should not be a number.
 
// Assumption
// The input is not empty.

// Example

// Input:
// aA1_67

// Output:
// 1

// import java.util.*;
// class Arrayfind{
// public static int password(String s){
//     if(s.length()<4){
//         return 0;
//     }

//     boolean sDigit = false;
//     boolean sCapital = false;

//     for(char c : s.toCharArray()){
//         if(c >='0' && c<='9'){
//             sDigit =  true;
//         }
//         if(c >='A' && c<='Z'){
//             sCapital = true;
//         }
//         if(c ==' ' || c == '/'){
//             return 0;
//         }
//     }

//         if(s.charAt(0) >='0' && s.charAt(0)<='9'){
//             return 0;
//         }

//         if(sDigit && sCapital){
//             return 1;
//         }
//         else{
//             return 0;
//         }
// }
//     public static void main(String[] args) {
//     String s = "aA1_67";
//     System.out.println(password(s));
//     }
// }

// 14. Change frequent character
// The function to execute is
// ChatFrequentcharacter(Char str, char x)

// This function has a string and a character. This function requires replacing the most used character in the str with the ‘x’ character.

// Note: If two characters have the same frequency, then we will have to consider the frequency which has the lower ASCII value.

// Example

// Input:
// str: bbadbbababb
// char x: t

// Output:
// ttadttatatt

// Explanation
// The maximum character repeated is ‘b’ that is replaced with ‘t’.
// import java.util.Scanner;
// import java.util.HashMap;
// class Arrayfind {
//     public static String replaceValue(String str,char x){
    
//         HashMap<Character,Integer> map = new HashMap<>();
//         int high = Integer.MIN_VALUE;
//         char index= '#';
//         for(int i=0; i<str.length(); i++){
//             map.put(str.charAt(i) , map.getOrDefault(str.charAt(i) , 0)+1);
//             if(map.get(str.charAt(i))>high){
//                 high = map.get(str.charAt(i));
//                 index = str.charAt(i);
//             }
//         }
//         str = str.replace(index, x);
//         return str;
//     }
//     public static void main(String[] args) {
//        String str ="bbadbbababb";
//        char x = 't';
//         System.out.println(replaceValue(str,x));

        
//     }
// }

// import java.util.HashMap;
// class Arrayfind {
//     public static String replaceValue(String str,char x){
    
//         HashMap<Character,Integer> map = new HashMap<>();
//         int high = Integer.MIN_VALUE;
//         char index= '#';
//         for(char c : str.toCharArray()){
//             map.put(c , map.getOrDefault(c ,0)+1);
//             high = map.get(c);
//             index = c;
//         }
//         str = str.replace(index ,x);
//         return str;
//     }
//     public static void main(String[] args) {
//        String str ="bbadbbababb";
//        char x = 't';
//         System.out.println(replaceValue(str,x));

        
//     }
// }


// 15. Execute the function Def Autocount(n).
// The function accepts the string n. It checks whether the number is an autobiographical number or not. If an integer returns, then it is an autobiographical number. If 0 returns, then it is not an autobiographical number.

// Assumption

// The input value should not be more than 10 characters.
// The input string will have numeric characters.
 
// Example

// Input:
// N: “1210”

// Output:
// 3
// class Arrayfind {
//     public static int autobiographical(String str){
//      int a = Integer.parseInt(str);
//      int size = str.length();
//      int sum = 0;
//      while(a>0){
//          int rem = a%10;
//          sum = sum+rem;
//          a=a/10;
//      }
//      if(sum == size){
//          return size-1;
//      }
//          return 0;
//      }
//     public static void main(String[] args) {
//        String str ="01310";
//         System.out.println(autobiographical(str));

        
//     }
// }


// 16. In a given list of integers, find the number that has the highest frequency. If there are one or more such numbers, give the smaller one as output.
// Input:
// 3
// 7
// 2 4 5 2 3 2 4
// 6
// 1 2 1 1 2 1
// 10
// 1 1 1 1 1 1 1 1 1 1

// Output:
// 2
// 1
// 1

// import java.util.*;

// public class Arrayfind {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int testCases = scanner.nextInt();
        
//         for (int i = 0; i < testCases; i++) {
//             int n = scanner.nextInt();
//             int[] nums = new int[n];
            
//             for (int j = 0; j < n; j++) {
//                 nums[j] = scanner.nextInt();
//             }
//             //  findHighestFrequency(nums);
//             int result = findHighestFrequency(nums);
//             System.out.println(result);
//         }
//    }
//    public static int findHighestFrequency(int nums[]){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int highfq = Integer.MIN_VALUE;
//        for(int num :nums){
//            map.put(num, map.getOrDefault(num,0)+1);
//            highfq = Math.max(highfq , map.get(num));
//         }

//         int small = Integer.MAX_VALUE;
//         for(Map.Entry<Integer, Integer> s : map.entrySet()){
//             if(s.getValue() == highfq && s.getKey() < small)
//             {
//                 small = s.getKey(); 
//             }
//         }
//         return small;
//     }
    
// }


// 17. Execute the function for the given purpose.
// Write a function mergeArrays which merges two sorted arrays to create one single sorted array. Complete the function int* mergeArrays(int a[], int b[], int asize, int bsize) below which takes the pointers to the first element of the two sorted arrays and the size of the arrays, and returns the base address of the final sorted array.

// Input:
// 4 // Size of 1st array
// 1 2 3 6 // Elements of 1st array
// 3 // Size of 2nd array
// 4 5 7 // Elements of 2nd array

// Output:
// 1
// 2
// 3
// 4
// 5
// 6
// 7
 

// import java.util.*;

// public class Arrayfind {

//     public static void merge(int s1, int arr1[], int s2, int arr2[]){
//         int narr[] = new int[s1+s2];
//         int i=0;
//         int j = 0;
//         int k = 0;
//         while(i<s1 && j<s2){
//             if(arr1[i]<=arr2[j]){
//                 narr[k++]=arr1[i++];
//             }
//             else if(arr1[i]>arr2[j]){
//                 narr[k++] = arr2[j++];
//             }
//         }
//         while(i<s1){
//             narr[k++] = arr1[i++];
//         }
//         while(j<s2){
//             narr[k++] = arr2[j++];
//         }

//         for(int l=0; l<narr.length; l++){
//             System.out.print(narr[l]+" ");
//         }   
//     }

// public static void main(String[] args) {
//     int s1 = 4;
//     int arr1[] = {1,2,3,6};
//     int s2 = 3;
//     int arr2[] = {4,5,7};
//     merge(s1, arr1, s2, arr2);
// }

// }


// 18. Create web access management to the kth largest number. It will accept an integer k and an array arr as its conditions and has to return the greatest element based on the value of k. That is, if k = 0, return the greatest element. If k = 1, return the second greatest element, and so on.
// Example

// Suppose the array contains values like {74, 85, 102, 99, 101, 56, 84} and the integer k is 2. The method will return 99, the third greatest element, as there are only two (according to the value of k) values greater than 99 (101 and 102).
// import java.util.*;

// public class Arrayfind {

//     public static void klargest(int key, int arr[]){
//       Arrays.sort(arr);
//       int n = arr.length-1;
//         System.out.print(arr[n-key]+" ");
//     }

//     public static void main(String[] args) {
//         int key = 2;
//         int arr[] = {74, 85, 102, 99, 101, 56, 84};
//         klargest(key, arr);
//     }

// }


// 19. We have mentioned a list of integers that have no duplicates. Find how many swaps it will take to sort the list in ascending order using Bubble sort.
// Input:
// 3
// 5
// 2 1 4 6 3
// 10
// 123 21 34 45 25 675 23 44 55 900
// 1
// 23

// Output:
// 3
// 16
// 0

// import java.util.*;

// public class Arrayfind {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int testCases = scanner.nextInt();
        
//         for (int i = 0; i < testCases; i++) {
//             int n = scanner.nextInt();
//             int[] arr = new int[n];
            
//             for (int j = 0; j < n; j++) {
//                 arr[j] = scanner.nextInt();
//             }
//             //  findHighestFrequency(nums);
//             int result = klargest(arr);
//             System.out.println(result);
//         }
//     }
    
//     public static int klargest(int arr[]){
//         int n = arr.length;
//         int count=0;
//         for(int i=0; i<n-1; i++){
//             for(int j=i+1; j<n; j++){
//                 if(arr[i]>arr[j]){
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

// 22. Adam decides to do some charity work. From day 1 till day n, he will give i^2 coins to charity. On day ‘i’ (1 < = i < = n), find the number of coins he gives to charity.
// Example 1
// Input:
// 2
// Output:
// 5
// Explanation:
// There are 2 days.
// Example 2

// Input:
// 3

// Output:
// 14

// import java.util.*;

// public class Arrayfind {
//     public static void main(String[] args) {
//         int n=3;
//         int sum = 0;
//         for(int i=1; i<=n; i++){
//             sum += i*i;
//         }
//         System.out.println(sum);
//     }
// }


// 23. Perform a function to reverse a string word-wise. The input here will be the string. In the output, the last word mentioned should come as the first word and vice versa.
// Example
// Input:
// Welcome to code
// Output:
// code to Welcome

// Explanation
// The Reversed string word wise function is applied.
// Example
// Input:
// Code to Crack Puzzle
// Output:
// Puzzle Crack to Code
 

// import java.util.*;
// public class Arrayfind {

//     public static void reverseWord(String str){
//         String newStr = "";
//         int i=str.length()-1; 
    
//         while(i>=0){
//             while(i>=0 && str.charAt(i)==' ')i--;
            
//             int j = i;
//             if(i<0){
//                 break;
//             }
//             while(i>=0 && str.charAt(i) !=' ')i--;

//             if(newStr.isEmpty()){
//                 newStr = newStr.concat(str.substring(i+1 , j+1)); 
//             }else{
//                 newStr = newStr.concat(" "+str.substring(i+1 , j+1));
//             }
//         }
//         System.out.println(newStr);
//     } 
//     public static void main(String[] args) {
        
//        String str = "Welcome to code";
//        reverseWord(str);
        
//     }
// }



// r: 7
// unit: 2
// n: 8
// arr: 2 8 3 5 7 4 1 2


// import java.util.*;
// public class Arrayfind {
//     public static int mouse(int r, int unit, int n, int arr[]){

//         int ab = r*unit;
//         int index = 0;
//         int sum = 0;
//         for(int i=0; i<n-1; i++){
//             if(sum<=ab){
//                 sum +=arr[i];
//                 index++;
//             }
//         }
//         return index;
//     }

//     public static void main(String[] args) {
        
//        int r = 7;
//        int unit = 2;
//        int n = 8;
//        int arr[] = {2,8,3,5,7,4,1,2};
//        System.out.println(mouse(r,unit,n,arr));
        
//     }
// }



import java.util.*;
public class Arrayfind {

    public static void main(String[] args) {
        
       int n = 'B'-'A';
       System.out.println(n);
        
    }
}









