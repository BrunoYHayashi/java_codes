public class ItemPedido {
    // Atributos
    private String nome;
    private float preco;

    // Construtor
    public ItemPedido(){}
    public ItemPedido(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos
    public String getNome(){
        return this.nome;
    }

    public float getPreco(){
        return this.preco;
    }
}