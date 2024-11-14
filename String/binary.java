// package binary;
public class binary{
    public static void main(String[] args) {
        String num="0101001";
        int flag=0;
        for(int i=0;i<num.length();i++)
        {
            if(num.charAt(i)==0||num.charAt(i)==1)
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.println("it is a binary no");
        }
        else{
            System.out.println("not a binary no");
        }
    }
}