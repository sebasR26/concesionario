public class obj{
    String modelo;
    Double cc;
    String Marca;
    
    public obj(String modelo, Double cc, String marca) {
        this.modelo = modelo;
        this.cc = cc;
        Marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCc() {
        return cc;
    }

    public void setCc(Double cc) {
        this.cc = cc;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    
}