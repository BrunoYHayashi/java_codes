public class MidiaDigi extends ItemBibli{
    // Atributos
    protected String formato;

    // Construtores
    public MidiaDigi(){}
    public MidiaDigi(String formato, int anoPub){
        this.formato = formato;
        this.anoPublicacao = anoPub;
    }

    // Métodos
    public String getFormat(){
        return this.formato;
    }
}