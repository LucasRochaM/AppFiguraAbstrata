
package appfiguracomclasseabstrata;

public abstract class Figura {
    private String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }
    
    //Métodos de acesso

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract double calculaArea();
    public abstract double calculaPerimetro();
    
    public String dadosFigura(){
        return "Figura do tipo: "+tipo+
                "\nÁrea: "+calculaArea()+
                "\nPerímetro: "+calculaPerimetro();
    }
    
}
