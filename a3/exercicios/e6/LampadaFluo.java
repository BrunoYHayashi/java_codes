public class LampadaFluo extends Lampada{
    // Atributos
    protected float comprimento;

    // Construtor
    public LampadaFluo(float comprimento, boolean estaLigado){
        this.comprimento = comprimento;
        this.estadoLigado = estaLigado;
    }

    // Métodos
    public float getComprimento(){
        return this.comprimento;
    } 

    public void setComprimento(float newComprimento){
        this.comprimento = newComprimento;
    }
}