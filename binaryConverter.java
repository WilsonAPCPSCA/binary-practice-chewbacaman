package binaryConverter;
import java.util.Scanner;
public class binaryConverter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What's your binary number? (1-8 digits) ");
		String num = in.next();
		System.out.print(convertBinary(num));

	}
	public static double convertBinary (String input){
		double sum = 0;
		for (int i=0; i<8 ; i++){
			if(input.substring(i,i+1).equals("1")){
				sum = sum + Math.pow(2, 7-i);
			}
		}
		return sum;
	}
}
