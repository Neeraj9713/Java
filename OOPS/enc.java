// public class enc {
//     private int a=10;
//      public void setdata(int data)
//      {
//         a=data;
//     }
//     public int getdata()
//     {
//         return a;
//     }
//     public static void main(String[] args) {
//         enc t=new enc();
//         t.setdata(10);
//         System.out.println(t.getdata());
//     }

    
// }

class enc {
    private int A = 10;
    public void setdata(int a){
         A= a;
     }
     public void getdata(){
         System.out.println(A);
     }
     
    public static void main(String[] args) {
        enc b = new enc();
        // System.out.println(b.getdata());
        b.getdata();
    }
} 