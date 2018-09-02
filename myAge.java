package mainpackagedemo;

import java.util.Scanner;

public class myAge {

		static Scanner reader=new Scanner(System.in);
		static Scanner reader1= new Scanner(System.in);
		public static void main(String[] args)
		{
			System.out.print("Si quheni?");
			String emri = reader.nextLine();
			System.out.print("Mbiemri Juaj?");
			String mbiemri = reader1.nextLine();
			System.out.print("Viti i lindjes?");
			int viti = reader.nextInt();
			int mosha = 2018 - viti ;
			System.out.println("Emri : " + emri + " " + mbiemri + " Ju jeni " + mosha + " vjec");
			
			
		}
}
