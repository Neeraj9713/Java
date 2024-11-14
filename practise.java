class n{
     public int a =10;
    protected int b = 20;
    int c = 30;
    private int d = 40;
}
public class practise extends n
{
   
    public void name(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // System.out.println(d);
    }
	public static void main(String[] args) {
        practise p = new practise();
        p.name();
        //  System.out.println(p.a);
        // System.out.println(p.b);
        // System.out.println(p.c);
        // System.out.println(p.d);    

    }
}