public class Node<T> {
    public T value;
    public Node<T> next;

    public Node(T _value){
        value = _value;
        next = null;
    }
}
