package AdderSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value value;

    Adder(Value value){
        this.value = value;
    }
    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 1000; i ++){
            this.value.x += i;
        }
        return null;
    }
}
