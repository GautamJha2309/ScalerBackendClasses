package AdderSubtractatorSynchronizedMethods;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value value;

    Adder(Value value){
        this.value = value;
    }
    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 1400; i ++){
            this.value.incrementBy(i);
        }
        return null;
    }
}
