public class Camarote extends Vip{
    // Atributos
    private double adicionalCamarote;

    // Construtores
    public Camarote(double ingresso, double vip, double camarote){
        this.setValor(ingresso);
        this.setValorVip(vip);
        this.adicionalCamarote = camarote;
    };

    // Métodos 
    public double getValorCamarote(){
        double valorTotal = 0;
        valorTotal = getValorVip();
        valorTotal += this.adicionalCamarote;
        return valorTotal;
    }
}