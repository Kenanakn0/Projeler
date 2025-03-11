package sayýlar;

import java.util.Scanner;

public class tekmiçiftmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----------Tek mi Çift mi ----------------");
		Scanner k = new Scanner(System.in);
		
		System.out.println("Eleman sayýsýný girin : ");
		int elemansayýsý = k.nextInt();
		k.nextLine();
		
		int[] sayýlar = new int[elemansayýsý];
		for(int i=0 ; i<sayýlar.length ; i++ )
		{
			System.out.println("Dzinin " + i + " .index deðerini girin : ");
			sayýlar[i] = k.nextInt();
			k.nextLine();
		}
		for (int deðer : sayýlar)
			tekMÝçiftMi(deðer);
	}
	
	public static void tekMÝçiftMi(int sayý)
	{
		if (sayý % 2 == 0)
		{
			System.out.println("girdiðiniz sayý " + sayý + " olup çift ve");
			
		}else {
			System.out.println("girdiðiniz sayý " + sayý + " olup tek ve ");
			
		}
		if(sayý > 0 )
		{
			System.out.println("pozitifdir");
		}else {
			System.out.println("negatiftir");
		}
		
		
	}

}
