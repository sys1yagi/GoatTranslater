/**
 * 
 */
package jp.dip.sys1.java.tlanslator;

/**
 * @author yagi
 *
 */
public class GoatTranslatorException extends Exception {

	/**
	 * 
	 */
	public GoatTranslatorException() {
	}

	/**
	 * @param message
	 */
	public GoatTranslatorException(String message) {
		super(message);

	}

	/**
	 * @param cause
	 */
	public GoatTranslatorException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public GoatTranslatorException(String message, Throwable cause) {
		super(message, cause);
	}

}
