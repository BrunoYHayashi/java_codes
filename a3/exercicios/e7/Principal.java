// Implemente um programa Java com as seguintes classes:
//  Classe ingresso que contenha o atributo valor ingresso e um método
// para imprimir esse valor.
//  Classe ingresso Vip que herde da classe ingresso e possua um atributo
// valor adicional incluído e um método que retorne o valor do ingresso
// Vip (com o adicional incluído).
//  Classe ingresso Normal que herde da classe ingresso e contenha um
// método que imprime: “Ingresso Normal”
//  Classe ingresso Camarote que herde da classe ingresso Vip e é mais
// cara (possui valor adicional, além do adicional vip) e um método que
// retorne o valor do ingresso camarote (com o adicional incluído).
//  Classe principal que instancie um objeto para as classes ingresso Vip,
// ingresso Normal e ingresso Camarote e chame os métodos para
// imprimir o valor dos ingressos.
//  Altere o programa principal anterior (item e) para que seja criado um
// vetor de objetos de tamanho 25 para cada uma das classes: ingresso
// Vip, ingresso Normal e ingresso Camarote. Em seguida, imprima para
// cada objeto o valor do ingresso.
// * Importante: implemente o construtor completo para todas as classes
// ingresso.

public class Principal {
    public static void main (String args[]){
        Ingresso[] ingressos = new Ingresso[3];

        ingressos[0] = new Vip(50.0, 20.0);
        ingressos[1] = new Normal(50.0);
        ingressos[2] = new Camarote(50.0, 20.0, 20.0);

        System.out.println(((Vip)ingressos[0]).getValorVip());        
        System.out.println(((Normal)ingressos[1]).getValorNormal());
        System.out.println(((Camarote)ingressos[2]).getValorCamarote());

        Vip[] vips = new Vip[25];
        Normal[] normais = new Normal[25];
        Camarote[] camarotes = new Camarote[25];

        for (int i = 0; i < 25; i++){
            vips[i] = new Vip(50.0, 20.0);
            normais[i] = new Normal(50.0);
            camarotes[i] = new Camarote(50.0, 20.0, 20.0);
        }

        System.out.println(vips[0].getValorVip());
        System.out.println(normais[0].getValor());
        System.out.println(camarotes[0].getValorCamarote());        
    }
}