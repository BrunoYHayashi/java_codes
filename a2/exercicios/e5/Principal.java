// Crie uma classe Principal com as seguintes características:
//  Crie um vetor para armazenar os dados de cinco estudantes (os dados devem
// ser fornecidos pelo usuário).
//  Ao final da inserção dos cinco estudantes, calcule e exiba:
// o A média da turma,
// o A quantidade de estudantes que foram para o exame final (40 <=
// média <= 69)
// o A quantidade de estudantes que foram reprovados (média < 40),
// o Os dados dos estudantes aprovados (média >= 70).

import java.utils.Scanner;

public class Principal {
    public void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        Estudantes[] Alunos = new Estudantes[5];

        for (i=0; i<5; i++){
            alunos[i].nome = scanner.nextLine();
            alunos[i].notaFinal = scanner.nextInt();
        }
        int soma=0, finais=0, reprovados=0, aprovados=0;

        for (int i=0; i<5; i++){
            soma += alunos[i].notaFinal;
            if (alunos[i].notaFinal >= 40 && alunos[i].notaFinal <=69)
                finais++;
            else if(alunos[i].notaFinal < 40)
                reprovados++;
            else
                aprovados++;
        }

        media = soma/5;

        system.out.println(media + finais + reprovados + aprovados);

    }
}