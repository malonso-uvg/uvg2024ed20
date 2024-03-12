import java.util.Comparator;

public class NumberComparator<K> implements Comparator<K>{

    @Override
    public int compare(K o1, K o2) {
        int key1 = (int)o1;
        int key2 = (int)o2;

        if (key1 == key2)
            return 0;
        else if (key1 > key2)
            return 1;
        else 
            return -1;
    }
    
}
