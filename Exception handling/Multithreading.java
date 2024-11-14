class MythreadRunnable1 implements Runnable{
    public void run(){
        for(int i=0; i<50; i++){
            System.out.println("I am a thread not a threat");
        }
    }
}

class MythreadRunnable2 implements Runnable{
    public void run(){
        for(int i=0; i<50; i++){

            System.out.println("I am a Don");
        } 
    }
}


public class Multithreading {
    public static void main(String[] args) {
    MythreadRunnable1 bullet1 = new MythreadRunnable1();
    Thread gun1 = new Thread(bullet1);
    
    MythreadRunnable2 bullet2 = new MythreadRunnable2();
    Thread gun2 = new Thread(bullet2);

    gun1.start();
    gun2.start();
    }
}
