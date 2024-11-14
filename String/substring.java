
public class substring {
    public static String subString(String str, int st, int ed){
        String subStr="";
        for(int i=st; i<ed; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(0, 5));
        // System.out.println(subString(str , 0, 5));
    }
}
