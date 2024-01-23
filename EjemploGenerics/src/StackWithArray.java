public class StackWithArray implements IStack {

    private int index;
    private int[] internalArray;

    public StackWithArray(int qty){
        index = 0;
        internalArray = new int[qty];
    }

    @Override
    public int count() {
        return index;    
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public void push(int value) {
        if (index < internalArray.length){
            internalArray[index] = value;
            index++;
        }
    }

    @Override
    public int pop() {
        int tempValue = 0;
        if (index > 0){
            tempValue = internalArray[index - 1];
            internalArray[index - 1] = 0;
            index--;
        }
        return tempValue;
    }

    @Override
    public int peek() {
        int tempValue = 0;
        if (index > 0){
            tempValue = internalArray[index - 1];
        }
        return tempValue;
    }
    
}
