/**
 * 
 */
package supertrunfo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Felip
 *
 */
public class Jogador {
	private String nome;
	private ArrayList<Card> listaDeCartas = new ArrayList<Card>();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Card> getListaDeCartas() {
		return listaDeCartas;
	}

	public void setListaDeCartas(ArrayList<Card> listaDeCartas) {
		this.listaDeCartas = listaDeCartas;
	}
	
	public Jogador(String nome) {
		this.nome = nome;

	}
	
	public static int jogar(Jogador player) {
		Scanner entradaIntCarta = new Scanner(System.in);
		Scanner entradaIntAtributo = new Scanner(System.in);
		System.out.println(player.nome + " joga");
		for (int j = 0; j < player.listaDeCartas.size(); j++) {
			Card cartaAMostrar = (Card) player.listaDeCartas.get(j);
			cartaAMostrar.mostrar();
		}
		System.out.println("Digite o número da carta escolhida(1 para a carta de cima, 2 para a carta do meio, e 3 para a carta de baixo):");
		int cartaEscolhidaPlayer = entradaIntCarta.nextInt();
		System.out.println("Digite o número do atributo da carta escolhida");
		int atributoEscolhidoPlayer = entradaIntAtributo.nextInt();
		Card cartaAJogarPlayer = (Card) player.listaDeCartas.get(cartaEscolhidaPlayer-1);
		int valorAtributoEscolhidoPlayer = 0;
		String nomeClasse = cartaAJogarPlayer.getClass().getCanonicalName();
		switch (nomeClasse) {
		case "supertrunfo.Anao":
			Anao cartaAnao = (Anao)player.listaDeCartas.get(cartaEscolhidaPlayer-1);
			switch (atributoEscolhidoPlayer) {
			case 1:
				valorAtributoEscolhidoPlayer = cartaAnao.getCarisma();
			case 2:
				valorAtributoEscolhidoPlayer = cartaAnao.getDestreza();
			case 3:
				valorAtributoEscolhidoPlayer = cartaAnao.getForca();
			}
			break;
		case "supertrunfo.Draconato":
			Draconato cartaDraconato = (Draconato)player.listaDeCartas.get(cartaEscolhidaPlayer-1);
			switch (atributoEscolhidoPlayer) {
			case 1:
				valorAtributoEscolhidoPlayer = cartaDraconato.getCarisma();
			case 2:
				valorAtributoEscolhidoPlayer = cartaDraconato.getDestreza();
			case 3:
				valorAtributoEscolhidoPlayer = cartaDraconato.getForca();
			}
			break;
		case "supertrunfo.Elfo":
			Elfo cartaElfo = (Elfo)player.listaDeCartas.get(cartaEscolhidaPlayer-1);
			switch (atributoEscolhidoPlayer) {
			case 1:
				valorAtributoEscolhidoPlayer = cartaElfo.getCarisma();
			case 2:
				valorAtributoEscolhidoPlayer = cartaElfo.getDestreza();
			case 3:
				valorAtributoEscolhidoPlayer = cartaElfo.getForca();
			}
			break;
		case "supertrunfo.Gnomo":
			Gnomo cartaGnomo = (Gnomo)player.listaDeCartas.get(cartaEscolhidaPlayer-1);
			switch (atributoEscolhidoPlayer) {
			case 1:
				valorAtributoEscolhidoPlayer = cartaGnomo.getCarisma();
			case 2:
				valorAtributoEscolhidoPlayer = cartaGnomo.getDestreza();
			case 3:
				valorAtributoEscolhidoPlayer = cartaGnomo.getForca();
			}
			break;
		case "supertrunfo.Halfling":
			Halfling cartaHalfling = (Halfling)player.listaDeCartas.get(cartaEscolhidaPlayer-1);
			switch (atributoEscolhidoPlayer) {
			case 1:
				valorAtributoEscolhidoPlayer = cartaHalfling.getCarisma();
			case 2:
				valorAtributoEscolhidoPlayer = cartaHalfling.getDestreza();
			case 3:
				valorAtributoEscolhidoPlayer = cartaHalfling.getForca();
			}
			break;
		case "supertrunfo.Humano":
			Humano cartaHumano = (Humano)player.listaDeCartas.get(cartaEscolhidaPlayer-1);
			switch (atributoEscolhidoPlayer) {
			case 1:
				valorAtributoEscolhidoPlayer = cartaHumano.getCarisma();
			case 2:
				valorAtributoEscolhidoPlayer = cartaHumano.getDestreza();
			case 3:
				valorAtributoEscolhidoPlayer = cartaHumano.getForca();
			}
			break;
		case "supertrunfo.MeioElfo":
			MeioElfo cartaMeioElfo = (MeioElfo)player.listaDeCartas.get(cartaEscolhidaPlayer-1);
			switch (atributoEscolhidoPlayer) {
			case 1:
				valorAtributoEscolhidoPlayer = cartaMeioElfo.getCarisma();
			case 2:
				valorAtributoEscolhidoPlayer = cartaMeioElfo.getDestreza();
			case 3:
				valorAtributoEscolhidoPlayer = cartaMeioElfo.getForca();
			}
			break;
		case "supertrunfo.MeioOrc":
			MeioOrc cartaMeioOrc = (MeioOrc)player.listaDeCartas.get(cartaEscolhidaPlayer-1);
			switch (atributoEscolhidoPlayer) {
			case 1:
				valorAtributoEscolhidoPlayer = cartaMeioOrc.getCarisma();
			case 2:
				valorAtributoEscolhidoPlayer = cartaMeioOrc.getDestreza();
			case 3:
				valorAtributoEscolhidoPlayer = cartaMeioOrc.getForca();
			}
			break;
		}

		return valorAtributoEscolhidoPlayer;
	}
}
