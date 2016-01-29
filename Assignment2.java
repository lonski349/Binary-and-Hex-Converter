import java.io.*;

public class Assignment2 {

	public static int BinaryStrtoInt (String Input) throws BinaryNumberFormatException{
		int decimalVal = 0;
		int length = Input.length();
		
		for (int i = 0; i < length; i++){
			int tempVal = Character.getNumericValue(Input.charAt((length - 1) - i));
			if (tempVal == 1){
				decimalVal += Math.pow(2, i);
			}
			else if (tempVal == 0){
				/**
				 * Do not add any values if there is a zero.
				 */
			}
			else{
				/**
				 * If there is a number other than one and zero throw
				 * a binary number format
				 */
				throw new BinaryNumberFormatException(Input.charAt((length - 1) - i));
			}
		}
		
		return decimalVal;
	}
	
	public static int HexStrtoInt (String Input) throws HexNumberFormatException{
		int decimalVal = 0; 
		int length = Input.length();
		
		for (int i = 0; i < length; i++){
			char tempVal = Input.charAt((length - 1) - i);
			
			if (Character.isDigit(tempVal)){
				int intVal = Character.getNumericValue(tempVal);
				decimalVal += intVal * (int)Math.pow(16, i);
			}
			
			if (!Character.isDigit(tempVal)){
				switch (tempVal){
				case 'a': decimalVal += 10 * (int)Math.pow(16, i);
						break;
				case 'b': decimalVal += 11 * (int)Math.pow(16, i);
						break;
				case 'c': decimalVal += 12 * (int)Math.pow(16, i);
						break;
				case 'd': decimalVal += 13 * (int)Math.pow(16, i);
						break;
				case 'e': decimalVal += 14 * (int)Math.pow(16, i);
						break;
				case 'f': decimalVal += 15 * (int)Math.pow(16, i);
						break;
				default: throw new HexNumberFormatException(tempVal);
				}				
			}
		}
		
		return decimalVal;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader stdin = 
				new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println("Please input a binary number");
		String UsrInput = stdin.readLine();
		int finalDecimalVal = 0;
		
		try {
			finalDecimalVal = BinaryStrtoInt(UsrInput);
		}
		catch(BinaryNumberFormatException ex){
			System.out.println(ex);
		}
		
		System.out.println(finalDecimalVal);
		
		finalDecimalVal = 0;
		System.out.println("Please input a hex number");
		UsrInput = stdin.readLine();
		
		try {
			finalDecimalVal = HexStrtoInt(UsrInput);
		}
		catch(HexNumberFormatException ex){
			System.out.println(ex);
		}
		
		System.out.println(finalDecimalVal);
	}
}
