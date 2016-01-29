
public class Assignment2 {

	public static void main(String[] args) {
		String Input = "100100111011011";
		int decimalVal = 0;
		int length = Input.length();
		
		for (int i = 0; i < length; i++){
			int tempVal = Character.getNumericValue(Input.charAt((length - 1) - i));
			if (tempVal == 1){
				decimalVal += Math.pow(2, i);
			}
		}
		System.out.println(decimalVal);
	}
}
