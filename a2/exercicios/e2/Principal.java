// Altere a classe Principal do Exercício 1 para que os dois objetos sejam armazenados em
// um vetor da classe Pessoa. Em seguida, faça as alterações no código para continuar
// mostrando as idades de Grace e Ada caso estivessem vivas

public class Principal{

    public static void main (String [] args) {
        Pessoa computadoras[] = new Pessoa[2];

        computadoras[0] = new Pessoa("Grace Hopper");
        computadoras[1] = new Pessoa ("Ada Lovelace");

        computadoras[0].ajustarDataDeNascimento(9, 12, 1906);
        computadoras[1].ajustarDataDeNascimento(10, 12, 1815);

        computadoras[0].calcularIdade(2, 10, 2026);
        computadoras[1].calcularIdade(2, 10, 2026);

        System.out.println(computadoras[0].retornarNome());
        System.out.println(computadoras[0].retornarIdade());
        System.out.println(computadoras[1].retornarNome());
        System.out.println(computadoras[1].retornarIdade());
    }
}