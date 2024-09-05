//Exemplo 01 - Capítulo 03
//Métodos Set e Get
//Autor: Deitel
//Data de Edição do Exemplo: 02/SET24 - 01h45
//Flávio Alencar

public class Account 
{
    //Declaração de Variáveis
    //--------------------------------------------------
    
    private String name;  //Variável de Instância;
    
    
    //--------------------------------------------------
    
    // o construtor inicializa name com nome do parâmetro
    public Account (String name)     // o nome do construtor é nome da classe
    {
        this.name = name;
    }
    
    //Método para Definir o Nome do Objeto.
    public void setName(String name)
    {
        this.name = name;     //Armazena o Nome.
    }
    
    //Método para Recuperar o Nome do Objeto
    public String getName()
    {
        return name;         //Retorna o valor do nome do Chamador.
    }
    
}

//Fim da Classe Account.
