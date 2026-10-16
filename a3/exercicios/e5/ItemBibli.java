public class ItemBibli {
    // Atributos
    protected int anoPublicacao;

    // Construtor
    public ItemBibli(){}
    public ItemBibli(int anoPub){
        this.anoPublicacao = anoPub;
    }

    // Métodos
    public int getAnoPub(){
        return this.anoPublicacao;
    }
}