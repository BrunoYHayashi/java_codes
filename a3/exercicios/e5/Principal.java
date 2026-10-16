public class Principal{
    public static void main(String args[]){
        Livro amarelo = new Livro("Livro Amarelo", "MISSAO", 2025);
        LivroDida sapiens = new LivroDida("História", "Sapiens: Uma Breve História da Humanidade", "byhudini", 2011);
        MidiaDigi parado = new MidiaDigi("mp3", 2026);
        Tese psico = new Tese("Arthur Paul Nickel", 2040);

        ItemBibli[] itens = {amarelo, sapiens, parado, psico};
        ItemBibli maisVelho = itens[0];
        for (int i = 1; i < 4; i++){
            if (itens[i].anoPublicacao < maisVelho.anoPublicacao)
                maisVelho = itens[i];
        }

        System.out.println(maisVelho.getAnoPub());    
    }
}