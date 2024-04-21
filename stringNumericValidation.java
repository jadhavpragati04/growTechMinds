import java.util.Scanner;

public class stringNumericValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String str = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		str = sc.next();
		for(int i = 0; i < str.length(); i++)
		{
			char ch[] = str.toCharArray();
			boolean result = Character.isAlphabetic(ch[i]);
			if(result == true)
			{
				count++;
			}

		}
		if(count > 0)
		{
			System.out.println("Entered string does not consist only numeric values");
		}
		else {
			System.out.println("Entered string consist only numeric values");
		}
	}

}
