
package appfiguracomclasseabstrata;

public class Retangulo extends Figura {
    private float base;
    private float altura;
    
    public Retangulo(float base, float altura){
        super("Retângulo");
        this.base=base;
        this.altura=altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return base * altura;
    }

    @Override
    public double calculaPerimetro() {
        return  base * 2 + altura * 2;
    }

    @Override
    public String dadosFigura() {
        return super.dadosFigura()+"\nBase: "+base+"\nAltura: "+altura;
    }
    
    
}
