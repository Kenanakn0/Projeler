package hesap;

import java.util.Scanner;

public class hesapmakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);

		System.out.println("--------------------  Hesap Makinesi -------------------");

		System.out.println("Yapmak istedi�iniz i�lemi se�in");

		System.out.println("Toplamak i�in 1'e bas�n ");
		System.out.println("��karmak i�in 2'ye bas�n");
		System.out.println("�arpmak  i�in 3'e bas�n");
		System.out.println("B�lmek   i�in 4'e bas�n ");
		int i�lem = k.nextInt();

		System.out.println("1.de�eri girin : ");
		double ilkde�er = k.nextDouble();

		System.out.println("2.de�er girin  : ");
		double ikide�er = k.nextDouble();

		final double Toplama = 1;
		final double ��karma = 2;
		final double �arpma = 3;
		final double B�lme = 4;

		double sonuc = 0;

		switch (i�lem) {
		case 1:
			sonuc = ilkde�er + ikide�er;

			System.out.println(" sonuc : " + sonuc);
			
			break;

		case 2:
			sonuc = ilkde�er - ikide�er;

			System.out.println(" sonuc : " + sonuc);
			
			break;

		case 3:
			sonuc = ilkde�er * ikide�er;

			System.out.println(" sonuc : " + sonuc);
			
			break;

		case 4:
			sonuc = ilkde�er / ikide�er;

			System.out.println(" sonuc : " + sonuc);
			
			break;

		}

	}

}
