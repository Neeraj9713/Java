public class R8_lastOccurance {
    public static int lastFind(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastFind(arr, key, i+1);
        
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        // if(isFound != -1){
        //     return isFound;
        // }
        // if(arr[i]==key){
        //     return i;
        // }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5,8};
        int key = 5;
        System.out.println(lastFind(arr, key , 1));

    }
    
}
