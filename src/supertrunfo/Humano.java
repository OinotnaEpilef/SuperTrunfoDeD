/**
 * 
 */
package supertrunfo;

import java.util.Random;

/**
 * @author Felip
 *
 */
public class Humano implements Card {
	private int forca;
	private int destreza;
	private int carisma;
	private StringBuffer nome = new StringBuffer();
	
	@Override
	public void criar(String nomeJogador) {
		Random gerador = new Random();
		int ordemHabilidades = gerador.nextInt(3);
		int atributo1 = gerador.nextInt(2) + 15;
		int atributo2 = gerador.nextInt(2) + 13;
		int atributo3 = gerador.nextInt(3) + 9;
		switch (ordemHabilidades){
			case 0:
				this.forca = atributo1;
				this.destreza = atributo2;
				this.carisma = atributo3;
				break;
			case 1:
				this.forca = atributo3;
				this.destreza = atributo1;
				this.carisma = atributo2;
				break;
			case 2:
				this.forca = atributo2;
				this.destreza = atributo3;
				this.carisma = atributo1;
				break;
		}
		StringBuffer nomeTemp = new StringBuffer();
		nomeTemp.append(nomeJogador);
		nomeTemp.append(" ");
		nomeTemp.append("Anão");
		this.nome = nomeTemp;
	}
	
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

	@Override
	public void mostrar() {
		System.out.println("Nome da raça da carta: "+this.nome+"\n"+"Carisma: "+this.carisma
				+"\nDestreza: "+this.destreza+"\nForça: "+this.forca);
	}
}
