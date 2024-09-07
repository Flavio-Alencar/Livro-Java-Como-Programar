//Exemplo 01 - Capítulo 04
//Figura 4.4
//Métodos if - else
//Classe Account com uma variável de instância balance do tipo double e um construtor
// e método deposit que executa a validação.
//Autor: Deitel
//Data de Edição do Exemplo: 02/SET24 - 15h32


public class Student 
{
    //Declaração de Variáveis de Instância
    //-------------------------------------------------------------------------
    
    private String name;          //Variável de Instância que Armazena Nome.
    private double average;       //Variável de Instância que Armazena a Média.
    
    //Construtor Inicia as Variáveis de Instância
    public Student (String name, double average)
    {
        this.name = name;
        
        // valida que a média é > 0.0 e <= 100.0; caso contrário,
        // armazena o valor padrão da média da variável de instância (0.0)
        if (average >= 0.0 && average <= 100.00)
        {
            this.average = average;
        }
    }
        
        // Define o nome de Student
        public void setName(String name)
        {
            this.name = name;
        }
        
        public String getName()
        {
            return name;
        }
        
        // define a média de Student
        public void setAverage(double average)
        {
            if (average >= 0.00 && average <= 100.00)
            {
                this.average = average;
            }
        }
        
        //Recupera a média de Student
        public double getAverage()
        {
            return average;
        }
        
        //Determina e Retorna a Letra da Nota de Student
        public String getLetterGrade()
        {
            String letterGrade = "";
            
            if (average >= 90.00)
            {
                letterGrade = "A";
            }
            else if (average >= 80.00)
            {
                letterGrade = "B";
            }
            else if (average >= 70.00)
            {
                letterGrade = "C";
            }
            else if (average >= 60.00)
            {
                letterGrade = "D";                
            }
            else
            {
                letterGrade = "E";
            }
            
            return letterGrade;
            
        }
}
