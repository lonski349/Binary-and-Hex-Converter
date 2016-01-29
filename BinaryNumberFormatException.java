
public class BinaryNumberFormatException extends Exception {
	
	private int value;
	
	public BinaryNumberFormatException(int binaryVal){
		super("Invalid Number" + binaryVal);
		value = binaryVal;
	}
	
	public double getVal(){
		return value;
	}

}
