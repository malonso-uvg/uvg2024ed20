import java.util.Comparator;

public class ComparadorCadenas<T> implements Comparator<T>{

    @Override
    public int compare(T o1, T o2) {
        String o1temp = (String)o1;
        String o2temp = (String)o2;
        return o1temp.compareTo(o2temp);
        
    }
    
}
