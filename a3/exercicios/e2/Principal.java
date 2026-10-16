public class Principal {
    public static void main(String args[]){
        Autor Luiz = new Autor("Luiz Mo", "Chinegro");
        Livro Kama = new Livro("Kama Sutra", 2067, Luiz, 67);
        Livro Amarelo = new Livro("Livro Amarelo", 2026, Luiz, 1);

        Kama.exibir();
        Amarelo.exibir();
    }
}