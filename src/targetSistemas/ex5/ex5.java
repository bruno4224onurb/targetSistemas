package targetSistemas.ex5;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write anything to be reversed:"+"\nEscreva qualquer coisa para ser inveritda:");
		String st = input.nextLine();
		char[] charArray = st.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		while (left < right) {
			char aux = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = aux;
			left++;
			right--;
		}
		String reverseSt = new String(charArray);
		System.out.println("Reversed String: " + reverseSt 
				+ "\nString Invertida: " + reverseSt);
		
		
	}
}
