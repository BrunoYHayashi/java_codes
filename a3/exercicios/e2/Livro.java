// Altere o exercício anterior adicionando o método exibir() na classe Livro. Esse
// método deve imprimir as informações do livro e do autor no seguinte
// formato:
// a. Título: As Cinco Linguagens do amor
// b. Ano: 2013
// c. Autor: Gary Chapman
// d. Edição: 3
// Em seguida, crie dois objetos da classe Livro e chame o método exibir

public class Livro {
    // Atributos
    private String titulo;
    private int anoPublicacao;
    private Autor autor;
    private int edicao;
    
    // Construtores
    public Livro(){}
    public Livro(String titulo){
        this.titulo = titulo;
    }
    public Livro(String titulo, int anoPublicacao, Autor autor, int edicao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.edicao = edicao;
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

    public void exibir(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Ano: " + this.anoPublicacao);     
        System.out.println("Autor: " + this.autor.getNome());
        System.out.println("Edição: " + this.edicao);            
    }
}