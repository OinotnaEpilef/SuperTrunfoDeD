/**
 * 
 */
package supertrunfo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Felip
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner entradaInt = new Scanner(System.in);
		Scanner entradaStr = new Scanner(System.in);
		int opcao;
		String nomePlayerHighScore = "";
		do {
			int scorePlayer1 = 0;
			int scorePlayer2 = 0;
			int highScore = 0;
			System.out.println("1. Começar novo jogo\n2. Informaçoes do jogo\n3. Sair do jogo\nDigite sua opção:");
			opcao = entradaInt.nextInt();
			if (opcao == 1) {
				boolean player1Comeca;
				System.out.println("Digite o nome do player one:");
				String nomePlayer1 = entradaStr.nextLine();
				System.out.println("Digite o nome do player two:");
				String nomePlayer2 = entradaStr.nextLine();
				System.out.println("Digite o número de rodadas(Caso digitado um número menor que 3,\n"
						+ "automaticamente serão feitas 3 rodadas, pois esse é o número minimo de rodadas):");
				int numRodadas = entradaInt.nextInt();
				if (numRodadas < 3) {
					numRodadas = 3;
				}
				int sortearQuemJoga = gerador.nextInt(2);
				if (sortearQuemJoga == 0) {
					player1Comeca = true;
				} else {
					player1Comeca = false;
				}
				AbstractFactory cardFactory = FactoryProducer.getFactory();
				Jogador player1 = new Jogador(nomePlayer1);
				Jogador player2 = new Jogador(nomePlayer2);
				int valorAtributoEscolhidoPlayer1 = 0;
				int valorAtributoEscolhidoPlayer2 = 0;
				for (int i = 1; i < numRodadas + 1; i++) {
					ArrayList<Card> listaDeCartasPlayer1 = new ArrayList<Card>();
					ArrayList<Card> listaDeCartasPlayer2 = new ArrayList<Card>();
					for (int j = 1; j < 4; j++) {
						Card card = cardFactory.getCard(gerador.nextInt(9));
						card.criar(nomePlayer1);
						listaDeCartasPlayer1.add(card);
					}
					player1.setListaDeCartas(listaDeCartasPlayer1);
					for (int j = 1; j < 4; j++) {
						Card card = cardFactory.getCard(gerador.nextInt(9));
						card.criar(nomePlayer2);
						listaDeCartasPlayer2.add(card);
					}
					player2.setListaDeCartas(listaDeCartasPlayer2);
					if (player1Comeca) {
						if (i % 2 != 0) {
							valorAtributoEscolhidoPlayer1 = Jogador.jogar(player1);
						} else {
							valorAtributoEscolhidoPlayer2 = Jogador.jogar(player2);
						}
					} else {
						if (i % 2 != 0) {
							valorAtributoEscolhidoPlayer2 = Jogador.jogar(player2);
						} else {
							valorAtributoEscolhidoPlayer1 = Jogador.jogar(player1);
						}
					}
					
					if (player1Comeca) {
						if (i % 2 != 0) {
							valorAtributoEscolhidoPlayer2 = Jogador.jogar(player2);
						} else {
							valorAtributoEscolhidoPlayer1 = Jogador.jogar(player1);
						}
					} else {
						if (i % 2 != 0) {
							valorAtributoEscolhidoPlayer1 = Jogador.jogar(player1);
						} else {
							valorAtributoEscolhidoPlayer2 = Jogador.jogar(player2);
						}
					}
					
					int pontuacao;
					if (valorAtributoEscolhidoPlayer1> valorAtributoEscolhidoPlayer2) {
						 System.out.println(player1.getNome()+" Venceu a rodada");
						 pontuacao = gerador.nextInt(3);
						 switch (pontuacao) {
						 case 1:
							 scorePlayer1+=75;
						 case 2:
							 scorePlayer1+=50;
						 case 3: 
							 scorePlayer1+=25;
						 }
					} else if (valorAtributoEscolhidoPlayer1< valorAtributoEscolhidoPlayer2){
						 System.out.println(player2.getNome()+" Venceu a rodada");
						 pontuacao = gerador.nextInt(3);
						 switch (pontuacao) {
						 case 1:
							 scorePlayer2+=75;
						 case 2:
							 scorePlayer2+=50;
						 case 3: 
							 scorePlayer2+=25;
						 }
					} else {
						System.out.println("Empate");
						scorePlayer1 += 10;
						scorePlayer2 += 10;
					}
				}
				if (scorePlayer1 > scorePlayer2) {
					System.out.println("Parabéns, "+player1.getNome()+", você venceu o jogo");
					if (scorePlayer1>highScore) {
						System.out.println("Parabéns, o novo recorde é o seu:");
						highScore = scorePlayer1;
						nomePlayerHighScore = player1.getNome();
					}
				} else if (scorePlayer1 < scorePlayer2) {
					System.out.println("Parabéns, "+player2.getNome()+", você venceu o jogo");
					if (scorePlayer2>highScore) {
						System.out.println("Parabéns, o novo recorde é o seu:");
						highScore = scorePlayer2;
						nomePlayerHighScore = player2.getNome();
					}
				} else {
					System.out.println("Empate!");
				}
				System.out.println("O recorde atual pertence a: "+ nomePlayerHighScore+"\nPontuação: "+highScore);
			} else {
				System.out.println("");
			}
		} while (opcao == 1 || opcao == 2);
		entradaInt.close();
		entradaStr.close();
	}

}
