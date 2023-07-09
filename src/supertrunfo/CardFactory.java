/**
 * 
 */
package supertrunfo;

/**
 * @author Felip
 *
 */
public class CardFactory extends AbstractFactory {

	@Override
	Card getCard(int numero) {
		switch (numero) {
		case 0:
			return new Anao();
		case 1:
			return new Draconato();
		case 2:
			return new Elfo();
		case 3:
			return new Gnomo();
		case 4:
			return new Halfling();
		case 5:
			return new Humano();
		case 6:
			return new MeioElfo();
		case 7:
			return new MeioOrc();
		case 8:
			return new Tiefling();
		}
		return null;
	}
}
