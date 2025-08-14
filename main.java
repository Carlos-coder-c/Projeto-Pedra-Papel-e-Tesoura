import java.util.Random;
import java.util.Scanner;

public class main {
 /**
 * @param args
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

        
    
    int rodadas = 3;
    
        
    
    int pontosJogador = 0;
    int pontosMaquina = 0;

        final int PEDRA = 1;
        final int PAPEL = 2;
        final int TESOURA = 3;

    System.out.println("Digite sua opção Pedra, papel ou tesoura");
    System.out.println("Pedra == 1");
        System.out.println("Papel == 2");
            System.out.println("Tesoura == 3");

            

            while (pontosJogador < 3 && pontosMaquina < 3) {
                  System.out.print("\nEscolha: 1 - PEDRA, 2 - PAPEL, 3 - TESOURA");
                  int escolhaJogador = scanner.nextInt();
                  int escolhaMaquina = random.nextInt(3) + 1;
           
                  System.out.println("Você escolheu: " + escolhaToString(escolhaJogador));
                  System.out.println("A maquina escolheu: " + escolhaToString(escolhaMaquina));
                
                  if  (escolhaJogador == escolhaMaquina) {
System.out.println("Empate!");



                  } else if (
    (escolhaJogador == 1 && escolhaMaquina == 3) ||
    (escolhaJogador == 2 && escolhaMaquina == 1) ||
    (escolhaJogador == 3 && escolhaMaquina == 2)
) {
System.out.println("Parábens,Você ganhou!");
pontosJogador++;

} else {
    System.out.println("A maquina ganhou,Você perdeu!");
    pontosMaquina++;


  }}
while (pontosJogador < 3 && pontosMaquina < 3) {
    // Aqui você deve colocar:
    // - entrada do jogador
    // - escolha da máquina
    // - comparação e atualização dos pontos
    // - impressão do placar parcial

}
  System.out.println("Placar: Jogador" + pontosJogador + "x Maquína" + pontosMaquina);

  // FINALL//

  if (pontosJogador == 3) {
    System.out.println("\nVocê ganhou o jogo!!");
    } else {
        System.out.println("\nA Você perdeu!, Tente novamente!");


 }

 scanner.close();




                 
                     
               }static String escolhaToString(int escolhaJogador) {
        switch (escolhaJogador) {
            case 1:
                return "Pedra";
            case 2:
                return "Papel";
            case 3:
                return "Tesoura";
            default:
                return "Opção inválida";
        }
        }
               
      
 @Override
 public String toString() {
   return "main []";
 }
}




            







 

