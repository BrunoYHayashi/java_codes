// Classe Principal:
// o Substitua a chamada do método ajustarDataDeNascimento() pelo
// método ajustarData().
// Além do nome e idade exiba também a data de nascimento de Grace e
// Ada.

public class Principal{

    public static void main (String [] args) {
        Pessoa computadoras[] = new Pessoa[2];

        computadoras[0] = new Pessoa("Grace Hopper");
        computadoras[1] = new Pessoa ("Ada Lovelace");

        computadoras[0].dataNascimento.ajustarData(9, 12, 1906);
        computadoras[1].dataNascimento.ajustarData(10, 12, 1815);

        computadoras[0].calcularIdade(2, 10, 2026);
        computadoras[1].calcularIdade(2, 10, 2026);

        System.out.println(computadoras[0].retornarNome());
        System.out.println(computadoras[0].retornarIdade());
        computadoras[0].dataNascimento.imprimirData();
        
        System.out.println(computadoras[1].retornarNome());
        System.out.println(computadoras[1].retornarIdade());
        computadoras[1].dataNascimento.imprimirData();
    }
}