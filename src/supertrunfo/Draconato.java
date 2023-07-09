/**
 * 
 */
package supertrunfo;

import java.util.Random;

/**
 * @author Felip
 *
 */
public class Draconato implements Card {
	private int forca;
	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getCarisma() {
		return carisma;
	}

	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}

	public StringBuffer getNome() {
		return nome;
	}

	public void setNome(StringBuffer nome) {
		this.nome = nome;
	}

	private int destreza;
	private int carisma;
	private StringBuffer nome = new StringBuffer();
	
	@Override
	public void criar(String nomeJogador) {
		Random gerador = new Random();
		int numForca = gerador.nextInt(2) + 16;
		int numCarisma = gerador.nextInt(2) + 13;
		int numDestreza = gerador.nextInt(3) + 8;
		this.forca = numForca;
		this.destreza = numDestreza;
		this.carisma = numCarisma;
		StringBuffer nomeTemp = new StringBuffer();
		nomeTemp.append(nomeJogador);
		nomeTemp.append(" ");
		nomeTemp.append("Draconato");
		this.nome = nomeTemp;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Nome da raça da carta: "+this.nome+"\n"+"Carisma: "+this.carisma
				+"\nDestreza: "+this.destreza+"\nForça: "+this.forca);
	}
}
