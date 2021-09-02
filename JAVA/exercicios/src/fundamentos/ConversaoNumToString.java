package fundamentos;

public class ConversaoNumToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = 1000;
		System.out.println(num1.toString().length());//O lenght só está disponivel para String, por isso a necessidade de converter
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
	}

}
