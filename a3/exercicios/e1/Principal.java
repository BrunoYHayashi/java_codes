// Implemente as classes abaixo com três construtores em cada. Na classe Livro,
// um dos construtores deve receber um objeto da classe autor como
// parâmetro. Crie um exemplo instanciando um autor e um livro, depois exiba
// as informações na tela.

public class Principal {
    public static void main(String args[]){
        Autor Luiz = new Autor("Luiz Mo", "Chinegro");
        Livro Kama = new Livro("Kama Sutra", 2067, Luiz);

        System.out.println(Luiz.getNome());
        System.out.println(Luiz.getNacionalidade());
        System.out.println(Kama.getTitulo());
        System.out.println(Kama.getAnoPublicacao());
        System.out.println(Kama.getAutor());
    }
}