public class Principal{

    public static void main (String [] args) {
        Pessoa Grace_Hopper = new Pessoa("Grace Hopper");
        Pessoa Ada_Lovelace = new Pessoa("Ada Lovelace");

        Grace_Hopper.ajustarDataDeNascimento(9, 12, 1906);
        Ada_Lovelace.ajustarDataDeNascimento(10, 12, 1815);

        Grace_Hopper.calcularIdade(2, 10, 2026);
        Ada_Lovelace.calcularIdade(2, 10, 2026);

        System.out.println(Grace_Hopper.retornarNome());
        System.out.println(Grace_Hopper.retornarIdade());
        System.out.println(Ada_Lovelace.retornarNome());
        System.out.println(Ada_Lovelace.retornarIdade());
    }
}