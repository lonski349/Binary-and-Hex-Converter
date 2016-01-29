
public class HexNumberFormatException extends Exception{

	private int value;
	
	public HexNumberFormatException(char hexVal){
		super("Invalid Number: " + hexVal);
		value = hexVal;
	}
	
	public double getVal(){
		return value;
	}
	
}
