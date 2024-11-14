
// import java.util.*;
// public class Spiral_order{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();

//         int matrix[][] = new int[n][m];
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("The sprial order of matrix is :");
//         int rowStart = 0;
//         int rowEnd = n-1;
//         int colStart = 0;
//         int colEnd = m-1;

//         // to print spiral order matrix
//         while(rowStart <= rowEnd && colStart <= colEnd) {
//             //1
//             for(int col=colStart; col<=colEnd; col++) {
//                 System.out.print(matrix[rowStart][col] + " ");
//             }
//             rowStart++;
  
  
//             //2
//             for(int row=rowStart; row<=rowEnd; row++) {
//                 System.out.print(matrix[row][colEnd] +" ");
//             }
//             colEnd--;
  
  
//             //3
//             for(int col=colEnd; col>=colStart; col--) {
//                 System.out.print(matrix[rowEnd][col] + " ");
//             }
//             rowEnd--;
  
  
//             //4
//             for(int row=rowEnd; row>=rowStart; row--) {
//                 System.out.print(matrix[row][colStart] + " ");
//             }
//             colStart++;
  
  
//             System.out.println();
//         }
//      }
//   }
  



import java.util.*;
public class Spiral_order{
    public static void Spiral(int arr[][]){

        int row = 0;
        int col = 0;
        int endrow = arr.length-1;
        int endcol = arr[0].length-1;

        while(row <= endrow && col <= endcol){

            //top
            for(int i=row; i<=endrow; i++){
                System.out.print(arr[row][i]+" ");
            }

            //right
            for(int j=row+1; j<=endcol; j++){
                System.out.print(arr[j][endcol]+" ");
            }

            //bottom
            for(int i=endcol-1; i>=row; i--){
                System.out.print(arr[endcol][i]+" ");
            }

            //left
            for(int j=endrow-1; j>=row+1; j--){
                System.out.print(arr[j][row]+" ");
            }
            row++;
            col++;
            endrow--;
            endcol--;
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[][]= {{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};

        Spiral(arr);
    }
}
