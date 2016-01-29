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
				throw new BinaryNumberFormatException(tempVal);
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
	}
}
