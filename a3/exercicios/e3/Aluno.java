public class Aluno {
    // Atributos
    private String nome;
    private int cr;

    // Construtores
    public Aluno(){}
    public Aluno(String nome, int cr){
        this.nome = nome;
        this.cr = cr;
    }

    //Métodos
    public String getNome(){
        return this.nome;
    }

    public int getCr(){
        return this.cr;
    }

}