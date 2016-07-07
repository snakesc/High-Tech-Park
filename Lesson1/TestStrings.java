package HomeTask2_1;

public class TestStrings {

	public static void main(String[] args) {
		String str = "Это мое домашнее задание!";/** This variable is a string type*/
		int length = str.length();/** The operator considers string lenght*/
		System.out.println(str);/** This operator is out message*/
		System.out.println("Символов в строке :" +length );/** This operator is out message about quantity symbols*/
		int div = length/2;
		String strParts = str.substring(0,div);/** divide in half line */
		String strParts2 = str.substring(div,length);
		System.out.println(strParts);/** out result */
		System.out.println(strParts2);
	}

}
