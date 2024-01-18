public interface IRadio{
    
    public boolean getState(); //Retornamos el valor de si esta encendido o no

    public void tooglePowerOffOn(); //Apagar y encender

    public void toogleAMFM(); //FM o AM

    public boolean getStateAMFM(); //Obtener si esta en FM o AM

    public void nextFrequency(); //Siguiente frecuencia

    public void previousFrequency();//frecuencia previa

    public float getCurrentFrequency();//Obtener la frecuencia actual

    public void setFavFrequency(int button); //Guarda frecuencia

    public float getFavFrequency(int button); //Llama frecuencia
}