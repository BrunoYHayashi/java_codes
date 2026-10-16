// Livro, com os atributos título, ano de publicação e autor

public class Livro {
    // Atributos
    private String titulo;
    private int anoPublicacao;
    private Autor autor;
    
    // Construtores
    public Livro(){}
    public Livro(String titulo){
        this.titulo = titulo;
    }
    public Livro(String titulo, int anoPublicacao, Autor autor){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    //Métodos
    public String getTitulo(){
        return this.titulo;
    }

    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }

    public Autor getAutor(){
        return this.autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }
}