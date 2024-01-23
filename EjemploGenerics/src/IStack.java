public interface IStack{

    /**
     * Devuelve la cantidad de elementos
     * @return un entero que devuelve la cantidad de elementos
     */
    int count();

    boolean isEmpty();

    void push(int value);

    int pop();

    int peek();

}