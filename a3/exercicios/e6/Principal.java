// Implemente um programa Java com as seguintes classes:
//  Classe lâmpada que contenha o atributo estado (ligado ou desligado) e
// um método para ligar e desligar a lâmpada.
//  Classe lâmpada fluorescente que herde da classe lâmpada e contenha o
// atributo comprimento da lâmpada em centímetros.
//  Classe lâmpada led que herde da classe lâmpada e não contenha
// nenhum atributo adicional.
//  Classe principal que instancie um objeto para as classes lâmpada
// fluorescente e lâmpada led. Em seguida, peça ao usuário para escolher
// uma lâmpada e, se estiver acesa, desliga-la; caso contrário, liga-la.
// Lembre-se de exibir o estado da lâmpada ao usuário.
// * Importante: implemente o construtor completo para todas as classes
// lâmpada

import java.util.Scanner;

public class Principal {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        LampadaFluo fluorescente = new LampadaFluo(1, true);
        LampadaLed led = new LampadaLed(false);

        System.out.println("Escolha entre as lâmpadas: fluorescente OU led");
        String chosenLamp = scanner.nextLine();

        if (chosenLamp.equals("fluorescente")){
            if (fluorescente.estadoLigado == true)
                fluorescente.desliga();
            else
                fluorescente.liga();
            System.out.println(fluorescente.getEstado());
        }
        else if (chosenLamp.equals("led")){
            if (led.estadoLigado == true)
                led.desliga();
            else
                led.liga();
            System.out.println(led.getEstado());
        }
        else
            System.out.println("Entrada inválida, escreva o nome da lâmpada (fluorescente OU led)");
 
    }
}