// Checked Exception

public class WrongValueException extends Exception {

	// ������
	public WrongValueException() {};

	public WrongValueException(String msg) {
		super(msg);
	}
}