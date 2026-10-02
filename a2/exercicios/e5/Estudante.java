// Crie uma classe Estudante com as seguintes características:
//  Atributos: nome, nota final
//  Métodos get e set para cada atributo
//  Métodos para armazenar e exibir os atributos

public class Estudante {
    
    //Atributos
    private String nome;
    private int notaFinal;

    // Construtor
    public Estudante(){}

    //Métoodos
    public String getNome(){
        return this.nome;
    }

    public int getNotaFinal(){
        return this.notaFinal;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNotaFinal(int notaFinal){
        this.notaFinal = notaFinal;
    }

    public void armazenaAtributos(String nome, int notaFinal){
        setNome(nome);
        setNotaFinal(notaFinal);
    }

    public void imprimeAtributos(){
        System.out.println(this.nome + " " + this.notaFinal);
    }
}