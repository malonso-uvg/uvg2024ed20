public class StackWithNodes<T> implements IStack<T>{

    private Node<T> head;
    int qty;

    public StackWithNodes(){
        head = null;
        qty = 0;
    }

    @Override
    public int count() {
        return qty;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void push(T value) {
        Node<T> newNode = new Node<T>(value);

        if (isEmpty())    {
            head = newNode;
            qty++;
        } else {
            newNode.next = head;
            head = newNode;
            qty++;
        }

    }

    @Override
    public T pop() {
        T tempValue = null;
        if (! isEmpty()){
            tempValue = head.value;
            head = head.next;
            qty--;
        }
        return tempValue;
    }

    @Override
    public T peek() {
        T tempValue = null;
        if (! isEmpty()){
            tempValue = head.value;
        }
        return tempValue;
    }
    
}
