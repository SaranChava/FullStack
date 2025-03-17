import java.io.FileReader;
import java.util.Scanner;

class Counter{
    int count;

    Counter(int count){
        this.count=count;
    }
    public synchronized void increment(){
        count++;
    }
}

class RandomException extends Throwable{
    public RandomException(String s){
        super(s);
    }
        }

class A implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("In A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("In B");
            try{
                Thread.sleep(10);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class D{
    public synchronized void start(){
        for(int i =0;i<10;i++){
            if(i%2==0){
                System.out.println("I am even");
            }
            else{
                System.out.println("I am odd");
            }
        }
    }
}

class C extends D implements Runnable{
    public void run(){
        this.start();
    }
}
public class coreDay1 {
    public static void main(String[] args){

//        Counter c = new Counter(0);
//
//        Runnable obj1 = () -> {
//                for(int i =0;i<10;i++){
//                    c.increment();
//                }
//        };
//        Runnable obj2 = () -> {
//            for(int i =0;i<10;i++){
//                c.increment();
//            }
//        };
//
//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        try{
//            FileReader fr = new FileReader("text.txt");
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        System.out.println(c.count);
//        System.out.println("End");
        C obj1 = new C();
        C obj2 = new C();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
