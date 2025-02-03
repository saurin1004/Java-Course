
// We can trasform normal classes to threads using extends Thread after class name

// For calling a thread we use a object.start() method

// Every thread class must have a run method

// class A extends Thread{
//     public void run() {
//         for(int i=0; i<100; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }

// class B extends Thread{
//     public void run() {
//         for(int i=0; i<100; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }





// Instead of extends Thread class we can call implements Runnable since the Thread class itself implements Runnable
// This can help use multiple inheritance if needed

// class A implements Runnable {
//     public void run() {
//         for(int i=0; i<10; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for(int i=0; i<10; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }

public class ThreadConcept {
    public static void main(String[] args) {

        // Approach #1: Multi-threading with extends Thread class

        // In threading we can only optimize the scheduler, there is no way to control it
        // A obj1 = new A();
        // B obj2 = new B();

        // System.out.println(obj1.getPriority()); // Priority is between 1 to 10, where 1 is least and 10 is highest priority, and 5 is default priority

        // obj2.setPriority(Thread.MAX_PRIORITY);

        // When we call object.start, it will call run method
        // obj1.start();
        // try {
        //     Thread.sleep(2);
        // } catch (InterruptedException e) {e.printStackTrace();}
        // obj2.start();




        // Approach #2: Multi-threading with implements Runnable interface

        // Runnable obj1 = new A();
        // Runnable obj2 = new B();
        // // Great, with implementes Runnable we can achieve multiple inheritance when needed BUT start() is a method of Thread class
        // // So in-order to implement it, we do it as follows:

        // Thread t1 = new Thread(obj1);// Thread has a constrauctor that takes Runnable as input
        // Thread t2 = new Thread(obj2);

        // t1.start();
        // t2.start();



        // Approach #3: Multi-threading with Runnable interface and lambda expression
        Runnable obj1 = () -> {
                        for(int i=0; i<10; i++) {
                            System.out.println("hi");
                            try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
                        }
        };

        Runnable obj2 = () -> {
            for(int i=0; i<10; i++) {
                System.out.println("hello");
                try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
            }
        };

        Thread t1 = new Thread(obj1);// Thread has a constrauctor that takes Runnable as input
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
