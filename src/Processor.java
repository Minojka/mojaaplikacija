import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Processor {
    public void process(int i,int e){
        System.out.println("Process 2 intigera " + i + e);
    }

    public void process(int [] ints){
        System.out.println("Dodaj intiger listu" + Arrays.toString(ints));
    }

    public void process(Objects[] obj){
        System.out.println("Dodaj intiger listu" + Arrays.toString(obj));

}
