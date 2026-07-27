package Capitulo03;

//Exemplo 02 - Capítulo 03
//Flavio Silvestre de Alencar - 27Jul26 - 16h26
//Descrição: Classe Account que contém uma variável de instância name e métodos
//para configurar e obter seu valor com o uso do construtor.
//------------------------------------------------------------------------------

public class Account2 
{
     //Declaração de Variável Local
    //----------------------------------------------------------------------
    private String name;
    //----------------------------------------------------------------------

    public Account2(String name)
    {
        this.name = name;
    }
    
    public void setName(String name)
    {
        this.name = name;   
    }
    
    public String getName()
    {
        return name; 
    }
    
}
