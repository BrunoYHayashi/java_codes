// Implemente uma classe Data com os atributos dia, mês e ano e os métodos:
//  ajustarData(): recebe dia, mês e ano de nascimento como parâmetros e preenche
// os atributos da classe correspondentes.
//  imprimirData(): exibe a data de nascimento no formato dia/mês/ano

public class Data{

    // Atributos
    private int dia;
    private int mes;
    private int ano;

    // Construtor
    public Data(){    
    }

    // Métodos
    public void ajustarData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void imprimirData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}