public class Principal{
    public static void main (String args[]){
        Pessoa p1 = new Pessoa();

        p1.setNome("Bergolussi");
        p1.setOcup("Heroi");
        
        // nasc.setDia(31);
        // nasc.setMes(12);
        // nasc.setAno(2007);
        // p1.setDataNasc(dataNasc)
        p1.setDataNasc(new Data(31, 12, 2007));
        
        // end.setNomeRua("Rua do Luiz Cocô");
        // end.setNumero(67);
        // p1.setEnd(end);
        p1.setEnd(new Endereco("Rua do Luiz Cocô", 67));
    
        p1.imprimir();
    }
}