public class Autor {
    // Atributos
    private String nome;
    private String nacionalidade;

    // Construtor
    public Autor(){}
    public Autor(String nome){
        this.nome = nome;
    }
    public Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    // Métodos
    public String getNome(){
        return this.nome;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }


}