//Exemplo 02 - Capítulo 03
//Métodos Set e Get
//Classe Account com uma variável de instância balance do tipo double e um construtor
// e método deposit que executa a validação.
//Autor: Deitel
//Data de Edição do Exemplo: 02/SET24 - 15h32

public class Account 
{
    private String name;         //Variável de Instância.
    private double balance;      //Variável de Instância.
    
    //Construtor de Account
    public Account (String name, double balance)
    {
        this.name = name;         // atribui name à variável de instância name.
        
        // valida que o balance é maior que 0.0; se não for
        // a variável de instância balance mantém seu valor inicial padrão de 0.0
        if (balance > 0)
        {
            this.balance = balance;
        }
    }
    
    // método que deposita (adiciona) apenas uma quantia válida no saldo
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0)                      // se depositAmount for válido
        {
            balance = balance + depositAmount;     // o adiciona ao saldo
        }
        
    }
        
     // método retorna o saldo da conta
     public double getBalance()
        {
            return balance;
        }
     
     // método que define o nome
     public void setName(String name)
     {
         this.name = name;
     }
     
     // método que retorna o nome
     public String getName()          // retorna o valor de name ao chamador
     {
         return name;
     }
        
    }
    

