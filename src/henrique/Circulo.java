package henrique;
public class Circulo {
    final float PI = 3.14f;
    float raio;
    float diametro;
    
    public float calculaArea()
    {
       return (this.getPI()*(this.getRaio()*this.getRaio()));
    }
    public float calculaCircunferencia()
    {
        return (this.getPI()*this.getDiametro());
    }
    public void setRaio(float r)
    {
        this.raio = r;
    }
    public float getRaio()
    {
        return this.raio;
    }
    public void setDiametro(float d)
    {
        this.diametro = d;
    }
    public float getDiametro()
    {
        return this.diametro;
    }
    public float getPI()
    {
        return this.PI;
    }
}
