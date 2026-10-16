public class LivroDida extends Livro{
    // Atributos
    protected String disciplina;

    // Construtores
    public LivroDida(){}
    public LivroDida(String disciplina, String titulo, String editora, int anoPub){
        this.disciplina = disciplina;
        this.titulo = titulo;
        this.editora = editora;
        this.anoPublicacao = anoPub;
    }

    // Métodos
    public String getDisci(){
        return this.disciplina;
    }
}