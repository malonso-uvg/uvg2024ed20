public class StackWithNodes implements IStack{

    private Node head;
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
    public void push(int value) {
        Node newNode = new Node(value);

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
    public int pop() {
        int tempValue = 0;
        if (! isEmpty()){
            tempValue = head.value;
            head = head.next;
            qty--;
        }
        return tempValue;
    }

    @Override
    public int peek() {
        int tempValue = 0;
        if (! isEmpty()){
            tempValue = head.value;
        }
        return tempValue;
    }
    
}
