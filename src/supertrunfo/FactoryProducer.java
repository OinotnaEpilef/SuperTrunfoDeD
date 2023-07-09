/**
 * 
 */
package supertrunfo;

/**
 * @author Felip
 *
 */
public class FactoryProducer {
	public static AbstractFactory getFactory () {
		return new CardFactory();
	}
}
