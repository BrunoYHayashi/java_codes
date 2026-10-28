public class Vip extends Ingresso {
    // Atributos 
    private double adicionalVip;

    // Construtor
    public Vip(){};
    public Vip(double ingresso, double adicional){
        this.setValor(ingresso);
        this.adicionalVip = adicional;
    };

    // Métodos
    public double getValorVip(){
        double valorTotal = 0;
        valorTotal = this.getValor();
        valorTotal += this.adicionalVip;
        return valorTotal;
    }

    public void setValorVip(double adicionalVip){
        this.adicionalVip = adicionalVip;
    }
}