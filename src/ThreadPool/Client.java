package ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        // Having fixed number of threads
        ExecutorService ex = Executors.newFixedThreadPool(5);

        //new threads were created if needed
        ExecutorService ex1 = Executors.newCachedThreadPool();

        int n = 1000000;
        for (int i = 0; i <= n; i++) {
//            if(i == 430){
//                System.out.println();
//            }
            NumberPrinter x = new NumberPrinter(i);
            ex.execute(x); //Execution with Fixed number of threads
            ex1.execute(x); // Execution with automatic threads creation
        }
    }
}
