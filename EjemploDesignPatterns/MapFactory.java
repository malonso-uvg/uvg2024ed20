import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapFactory<K, V> {
    public static final int HASHMAP = 1;
    public static final int TREEMAP = 2;
    public static final int LINKEDHASHMAP = 3;

    public AbstractMap<K, V> getMapInstance(int mapType){

        switch (mapType) {
            case HASHMAP:
                return new HashMap<K, V>();
            case TREEMAP:
                return new TreeMap<K, V>();
            case LINKEDHASHMAP:
                return new LinkedHashMap<K, V>();
            default:
                return new HashMap<K,V>();
        }

    }
}
