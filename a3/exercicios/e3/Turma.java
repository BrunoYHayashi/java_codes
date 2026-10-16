public class Turma {
    // Atributos
    private int codigo;
    private String professor;
    private Aluno[] alunos;

    // Construtores
    public Turma(){}
    public Turma(int codigo, String professor, Aluno[] alunos){
        this.codigo = codigo;
        this.professor = professor;
        this.alunos = alunos;
    }

    // Métodos 
    public void exibir(){
        for (int i = 0; i < 3 ; i++){
            System.out.println(this.alunos[i].getNome());
        }
    }
}