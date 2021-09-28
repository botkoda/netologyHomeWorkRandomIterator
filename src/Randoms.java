import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int r;

    public Randoms(int min, int max) {
        random = new Random();
        r  =  min +  random.nextInt(max - min + 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {

               if( r<=100) return true;
                return false;
            }

            @Override
            public Integer next() {
                return  r++;
            }
        };
    }
}
