public class Lampada {
    // Atributos 
    protected boolean estadoLigado;

    // Construtor
    public Lampada(){};

    // Métodos
    public void liga(){
        this.estadoLigado = true;
    }

    public void desliga(){
        this.estadoLigado = false;
    }

    public boolean getEstado(){
        return this.estadoLigado;
    }
}