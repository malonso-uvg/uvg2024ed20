import java.util.ArrayList;

public class StackWithArray<T> implements IStack<T> {

    private int index;
    ArrayList<T> internalArray;

    public StackWithArray(int qty){
        index = 0;
        internalArray = new ArrayList<T>(qty);
    }

    @Override
    public int count() {
        return internalArray.size();
    }

    @Override
    public boolean isEmpty() {
        return internalArray.isEmpty();
    }

    @Override
    public void push(T value) {
        
            internalArray.add(value);
        
    }

    @Override
    public T pop() {
        T tempValue = null;
        if (internalArray.size() > 0){
            tempValue = internalArray.remove(internalArray.size() - 1);
        }
        
        return tempValue;
    }

    @Override
    public T peek() {
        T tempValue = null;
        if (internalArray.size() > 0){
            tempValue = internalArray.get(internalArray.size() - 1);
        }
        return tempValue;
    }
    
}
