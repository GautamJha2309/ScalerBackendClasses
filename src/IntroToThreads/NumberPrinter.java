package IntroToThreads;

public class NumberPrinter implements Runnable {

    private int numberToPrint;

    NumberPrinter(int number) {
        this.numberToPrint = number;
    }

    @Override
    public void run() {
        System.out.println("Printing number: " + numberToPrint + " Thread: " + Thread.currentThread().getName());
    }
}
