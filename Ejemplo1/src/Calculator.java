public class Calculator{

    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int substraction(int n1, int n2){
        return add(n1, -n2);
    }

    public int Multiplication(int n1, int n2){
        int result = 0;

        for (int i = 0; i < n2; i++){
            result = add(result, n1);
        }

        return result;
    }
}