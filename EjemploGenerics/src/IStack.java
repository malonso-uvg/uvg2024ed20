public interface IStack<T>{

    /**
     * Devuelve la cantidad de elementos
     * @return un entero que devuelve la cantidad de elementos
     */
    int count();

    /**
     * Este metodo nos indica si la ED stack esta vacia o no
     * @return verdadero si esta vacia, falso de lo contrario
     */
    boolean isEmpty();

    void push(T value);

    T pop();

    T peek();

}