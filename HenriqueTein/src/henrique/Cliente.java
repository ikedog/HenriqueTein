package henrique;
public class Cliente {
    String nome;
    Conta contaCorrente;
    int CPF;
    
    public void setNome(String n)
    {
        this.nome = n;
    }
    public String getNome()
    {
        return this.nome;
    }
    public void setContaCorrente(Conta c)
    {
        this.contaCorrente = c;
    }
    public Conta getContaCorrente()
    {
        return this.contaCorrente;
    }
    public void setCPF(int c)
    {
        this.CPF = c;
    }
    public int getCPF()
    {
        return this.CPF;
    }
}
