// public class oops3_constructor {
//     public static void main(String[] args) {
//         Student s1 = new Student("Neeraj");
//         System.out.println(s1.name);
//     }
// }

// class Student{
//     String name;
//     int no;

//     Student(String name){
//         // System.out.println("Constructor is called..");
//         this.name = name;
//     }
// }

public class oops3_constructor {
    
    public static void main(String[] args) {
        // Student s1 = new Student();
        // Student s2 = new Student("Neeraj");
        // System.out.println(s2.name);
        // Student s3 = new Student(123);
        // System.out.println(s3.roll);

        Student s1 = new Student();
        s1.name = "Neeraj";
        s1.roll = 123;
        s1.password = "abcd";
        
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[0] = 70;
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
        
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    //                                                      Non parameterized constructor
    Student(){
        marks = new int[3];

        System.out.println("Constructor called...");
    }
    
    //                                                      parameterized constructor
    Student(String name){
        marks = new int[3];

        this.name = name;
    }
    
    Student(int roll){
        marks = new int[3];

        this.roll = roll;
    }

    //                                                      copy constructor

    // //                      shallow constructor      reference    
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.password = s1.password;
    //     this.marks = s1.marks;
    // }

    //                         Deep constructor         new marks array     
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
        this.marks[i] = s1.marks[i];
        }
    }
} 
