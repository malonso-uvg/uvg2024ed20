public class Calculador1 implements ICalculator{
	public int add(int n1, int n2){
		return n1 + n2;
	}

    public int mult(int n1, int n2){
		int resultado = 0;

        boolean n2IsNegative = n2 < 0;
        boolean n1IsNegative = n1 < 0;


        if (n2IsNegative){
            n2 = -n2;
        }

        // Utilizar un bucle para sumar 'n2' a 'resultado' 'n1' veces
        for (int i = 0; i < n2; i++) {
            resultado += n1;
        }

        if (n2IsNegative == n1IsNegative){
            if (n2IsNegative){
                resultado = -resultado;
            }
        }

        return resultado;
	}
}