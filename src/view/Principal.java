package view;
import controller.ThreadSapo;

public class Principal {
	public static void main(String[] args) {
			int distanciamaxima = 1000;
			int sapo1 = 1,sapo2 = 2,sapo3 = 3,sapo4 = 4,sapo5 = 5;
			Thread Sapo1 = new ThreadSapo(distanciamaxima,sapo1);
			Thread Sapo2 = new ThreadSapo(distanciamaxima,sapo2);
			Thread Sapo3 = new ThreadSapo(distanciamaxima,sapo3);
			Thread Sapo4 = new ThreadSapo(distanciamaxima,sapo4);
			Thread Sapo5 = new ThreadSapo(distanciamaxima,sapo5);
			Sapo1.start();
			Sapo2.start();
			Sapo3.start();
			Sapo4.start();
			Sapo5.start();
		}
}
