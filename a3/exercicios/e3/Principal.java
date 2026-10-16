public class Principal {
    public static void main (String args[]){
        Aluno[] alunos = new Aluno[3];
        alunos[0] = new Aluno("Bruno", 67);
        alunos[1] = new Aluno("Luiz", 69);
        alunos[2] = new Aluno("Gabizao", 24);

        Turma turma = new Turma(67, "Renato Caiado", alunos);
    
        turma.exibir();
    }
}