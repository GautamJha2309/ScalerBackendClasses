package IntroToThreads;

public class HelloWorldPrinter implements Runnable {

    public void doSomething() {
        System.out.println("Something done...  Thread : " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Hello World!  Thread: " + Thread.currentThread().getName() );
        doSomething();
    }
}
