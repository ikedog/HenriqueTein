package henrique;
import java.time.LocalDate;
public class Pessoa {
    int idade;
    String signo;
    LocalDate dataNascimento;
    
    public void setIdade(int i)
    {
        this.idade = i;
    }
    public void setSigno(String s)
    {
        this.signo = s;
    }
    public void setDataNascimento(int year, int month, int day)
    {
        this.dataNascimento = LocalDate.of(year, month, day);
    }
    public int getIdade()
    {
        return this.idade;
    }
    public String getSigno()
    {
        return this.signo;
    }
    public LocalDate getDataNascimento()
    {
        return this.dataNascimento;
    }
}
