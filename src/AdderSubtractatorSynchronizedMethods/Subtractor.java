package AdderSubtractatorSynchronizedMethods;

import java.util.Vector;
import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value value;

    Subtractor(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 1 ; i <= 1400 ; i++) {
            this.value.decrementBy(i);
        }
//        Vector
        return null;
    }
}
