package Capitulo03;

//Exemplo 03 - Capítulo 03
//Flavio Silvestre de Alencar - 27Jul26 - 16h26
//Descrição: Classe Account3 com uma variável de instância balance do tipo double
//e um construtor e método deposit que executa a validação.
//------------------------------------------------------------------------------

public class Account3 
{
    //Declaração de Variável Local
    //----------------------------------------------------------------------
    private String name;
    private double balance;
    //----------------------------------------------------------------------
    
    public Account3(String name, double balance)
    {
        this.name = name;
        
        if (balance >= 0)
        {
        this.balance = balance; 
        }
    }
    
    public void deposit(double depositAmmount)
    {
        if (depositAmmount >= 0)
        {
            balance = balance + depositAmmount;
        }
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    
    
}
