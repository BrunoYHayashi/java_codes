public class Livro extends ItemBibli{
    // Atributos
    protected String titulo;
    protected String editora;

    // Construtores
    public Livro(){}
    public Livro(String titulo, String editora, int anoPub){
        this.titulo = titulo;
        this.editora = editora;
        this.anoPublicacao = anoPub;
    }

    // Metodos
    public String getTitulo(){
        return this.titulo;
    }

    public String getEdit(){
        return this.editora;
    }
}