public class Automovil {
    private String marca;
    private int modelo;
    private String linea;
    private double precio;

    public Automovil(String marca,int modelo, String linea, double precio){
        setMarca(marca);
        setLinea(linea);
        setModelo(modelo);
        setPrecio(precio);
    }


    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public String getLinea() {
        return linea;
    }
    public void setLinea(String linea) {
        this.linea = linea;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
}
