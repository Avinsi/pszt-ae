/**
 * 
 */
package exceptions;

/**
 * Wyjatek wyst�pujcy w przypadku z�ej struktury pliku z danymi
 * @author Nexon
 *
 */
public class ExceptionBadDataStructure extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ExceptionBadDataStructure() { super(); }
	public ExceptionBadDataStructure(String message) { super(message); }
	public ExceptionBadDataStructure(String message, Throwable cause) { super(message, cause); }
	public ExceptionBadDataStructure(Throwable cause) { super(cause); }
	
	
}
