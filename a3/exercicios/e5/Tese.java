public class Tese extends ItemBibli{
    // Atributos
    protected String orientador;

    // Construtores
    public Tese(){}
    public Tese(String orientador, int anoPub){
        this.orientador = orientador;
        this.anoPublicacao = anoPub;
    }

    // Métodos
    public String getOrientador(){
        return this.orientador;
    }
}