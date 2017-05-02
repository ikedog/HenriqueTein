package henrique;
public class Temperatura {
    int temperatura;
    public float fromCtoF(float t)
    {
        return ((t*1.8f)+32);
    }
    public float fromFtoC(float t)
    {
        return ((t-32)/1.8f);
    }
}
