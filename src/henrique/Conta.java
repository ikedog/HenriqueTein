package henrique;
public class Conta {
    int numeroConta;
    Cliente clienteConta;
    float saldo;
    
    public void setNumeroConta(int n)
    {
        this.numeroConta = n;
    }
    public int getNumeroConta()
    {
        return this.numeroConta;
    }
    public void setClienteConta(Cliente c)
    {
        this.clienteConta = c;
    }
    public Cliente getClienteConta()
    {
        return this.clienteConta;
    }
    public void realizaSaque(float S)
    {
        if((saldo - S)>0)
        {
            saldo = saldo - S;
        }
        else
        {
            System.out.println("Saldo insuficiente");
        }
    }
    public void realizaDeposito(float D)
    {
        if(D>0)
        {
            saldo = saldo + D;
        }
        else
        {
            System.out.println();
        }
    }
}
