package hesap;

import java.util.Scanner;

public class hesapmakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);

		System.out.println("--------------------  Hesap Makinesi -------------------");

		System.out.println("Yapmak istediðiniz iþlemi seçin");

		System.out.println("Toplamak için 1'e basýn ");
		System.out.println("Çýkarmak için 2'ye basýn");
		System.out.println("Çarpmak  için 3'e basýn");
		System.out.println("Bölmek   için 4'e basýn ");
		int iþlem = k.nextInt();

		System.out.println("1.deðeri girin : ");
		double ilkdeðer = k.nextDouble();

		System.out.println("2.deðer girin  : ");
		double ikideðer = k.nextDouble();

		final double Toplama = 1;
		final double Çýkarma = 2;
		final double Çarpma = 3;
		final double Bölme = 4;

		double sonuc = 0;

		switch (iþlem) {
		case 1:
			sonuc = ilkdeðer + ikideðer;

			System.out.println(" sonuc : " + sonuc);
			
			break;

		case 2:
			sonuc = ilkdeðer - ikideðer;

			System.out.println(" sonuc : " + sonuc);
			
			break;

		case 3:
			sonuc = ilkdeðer * ikideðer;

			System.out.println(" sonuc : " + sonuc);
			
			break;

		case 4:
			sonuc = ilkdeðer / ikideðer;

			System.out.println(" sonuc : " + sonuc);
			
			break;

		}

	}

}
