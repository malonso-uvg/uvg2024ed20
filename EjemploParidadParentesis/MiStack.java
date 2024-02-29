import java.util.ArrayList;

public class MiStack {
    private ArrayList<String> arrayInterno;

    public MiStack(){
        arrayInterno = new ArrayList<String>();
    }

    //count
    public int count(){
        return arrayInterno.size();
    }

    //is empty
    public boolean isEmpty(){
        return arrayInterno.isEmpty();
    }

    //push
    public void push(String value){
        arrayInterno.add(0, value);
    }

    //pop
    public String pop(){
        if (arrayInterno.size() > 0)
            return arrayInterno.remove(0);
        else
            return null;
    }

    //peek
    public String peek(){
        return arrayInterno.get(0);
    }
}
