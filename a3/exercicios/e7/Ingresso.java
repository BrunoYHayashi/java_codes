public class Ingresso {
    // Atributos
    private double valorIng;

    // Construtor
    public Ingresso(){};
    public Ingresso(double valor){
        this.valorIng = valor;
    };

    // Métodos
    public double getValor(){
        return this.valorIng;
    }

    public void setValor(double valor){
        this.valorIng = valor;
    }

}