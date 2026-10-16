public class Pedido {
    // Atributos
    private int numeroPedido;
    private ItemPedido[] listaItens;

    // Construtores
    public Pedido(){}
    public Pedido(int numeroPedido, ItemPedido[] listaItens){
        this.numeroPedido = numeroPedido;
        this.listaItens = new ItemPedido[0];
    }

    // Métodos
    public void adicionaLista(ItemPedido item){
        ItemPedido[] novaLista = new ItemPedido[this.listaItens.length +1];

        for (int i = 0; i < this.listaItens.length; i++){
            novaLista[i] = this.listaItens[i];
        }

        novaLista[this.listaItens.length] = item;

        this.listaItens = novaLista; 
    } 

    public float calculaTotal(){
        float soma = 0;

        for(int i = 0; i < this.listaItens.length; i++){
            soma += this.listaItens[i].getPreco();
        }

        return soma;
    }

    public void precoTotal(){
        float soma = calculaTotal();
        System.out.println("Pedido #" + this.numeroPedido);

        for(int i = 1; i <= this.listaItens.length; i++){
            System.out.println(i + " - " + this.listaItens[i-1].getNome() + " (" + this.listaItens[i-1].getPreco() + ")");
        }

        System.out.println("Total: $" + soma);
    }
}