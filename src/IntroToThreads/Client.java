package IntroToThreads;

public class Client {

    public static void doSomething() {
        System.out.println("Something is being done...  Thread : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        System.out.println("Thread : " + Thread.currentThread().getName() );
        thread.start();
        doSomething();


//    Question: Print 1 - 100, but every number should be printed in a separate thread
        int n = 1000000;
        for (int i = 1; i <= n; i++) {

//            if(i == 80) {
//                System.out.println();
//            }

            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread1 = new Thread(numberPrinter);
            thread1.start();
        }
    }

}



// Threading can be achieved using 2 methods
// 1. Using Runnable interface
// 2. Extending Thread Class itself

