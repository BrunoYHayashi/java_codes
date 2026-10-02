public class Data{

    // Atributos
    protected int dia;
    protected int mes;
    protected int ano;

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