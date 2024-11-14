// public class ArrayQuestion {
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,4};
        
//         int min = 10;
//         double sum = 0.0;
//         double place = 1.0;
        
        
//         for(int i=0; i<3; i++){
//             min = 10;
//             for(int j=0; j<arr.length; j++){
//                 int rem = arr[j]%10;
//                 if(rem < min){
//                     min= rem;
//                 }
//                 arr[j] = arr[j]/10;
//             }
//             sum = min + (sum/place);
//             sum = sum * place;
//             place = place*10;
//             // System.out.println(sum);
//             // System.out.println(place);
//         }

//         System.out.println((int)((max*1000)+sum));


//     }
// }


//                                             Q...FREQUENCY OF EACH DIGIT
// input - int[] = {1903,7624,2046,1002}
// output - int =  0

// 0--4 times
// 1--2 times
// 2--3 times
// 3--1 times
// 4--2 times
// 5--0 times
// 6--2 times
// 7--1 times
// 8--0 times
// 9--1 times


// input - int[] = {1203,7624,2046,1002}
// output - int =  2

// 0--4 times
// 1--2 times
// 2--4 times
// 3--1 times
// 4--2 times
// 5--0 times
// 6--2 times
// 7--1 times
// 8--0 times
// 9--0 times

public class ArrayQuestion {
    public static void main(String[] args) {

        int[] arr = {1203,7624,2046,1002} ;
        int[] temp = new int[10];

        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            while(num!=0)
            {
                int rem = num%10;
                temp[rem]++;
                num = num/10;
            }
        }




    }
}