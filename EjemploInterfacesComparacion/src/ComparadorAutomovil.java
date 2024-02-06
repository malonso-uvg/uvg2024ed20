import java.util.Comparator;

public class ComparadorAutomovil<T>  implements Comparator<T>{

    @Override
    public int compare(T o1, T o2) {

        Automovil auto1 = (Automovil)o1;
        Automovil auto2 = (Automovil)o2;

        // TODO Auto-generated method stub
        if (auto1.getPrecio() < auto2.getPrecio()){
            return -1;
        } else if (auto1.getPrecio() > auto2.getPrecio()){
            return 1;
        } else {
            if (auto1.getModelo() < auto2.getModelo()){
                return -1;
            } else if (auto1.getModelo() > auto2.getModelo()){
                return 1;
            } else {
                return 0;
            }   
        }
    }

    
}