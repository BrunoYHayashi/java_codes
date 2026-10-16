public class Principal{
    public static void main(String args[]){
        Pedido pedidoGabs = new Pedido(1, null); 

        pedidoGabs.adicionaLista(new ItemPedido("Mentos", 10));
        pedidoGabs.adicionaLista(new ItemPedido("Gin de 10", 13));
        pedidoGabs.adicionaLista(new ItemPedido("Cadeira de praia", 50));
        
        pedidoGabs.precoTotal();
    }
}