
public class Main {

	public String encryption(String string, Integer value) {
		
		String encryptedString = "";
		for (int i = 0; i < string.length(); i++) {
			char c = (char) (string.charAt(i) + value % 26);
			encryptedString = encryptedString + c;
		}
		return encryptedString;
	}

	public String sumArray(Integer[] arr) {
		return null;
	}

	public boolean checkNumber(Integer[] arr, Integer n) {
		// TODO Auto-generated method stub
		return false;
	}

}
