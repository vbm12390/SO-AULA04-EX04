package controller;

public class ThreadSapo extends Thread  {
	private int sapo;
	private int distanciamaxima;
	private int distanciapulo=0;
	private int distanciapercorrida = 0;
	int ganhadores[] = new int[5];
	public  ThreadSapo(int distanciamaxima, int sapo){
	this.distanciamaxima = distanciamaxima;
	this.sapo = sapo;
	}
	
	public void run() {
		pulo();
		resultado();
	}

	private void resultado() {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("O sapo "+ganhadores[0] +" Chegou");
	}	

	private void pulo() {
		int i = 0;
			while (distanciapercorrida<distanciamaxima) {
				try{
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				distanciapulo = (int)(Math.random()*150);
				distanciapercorrida = distanciapulo + distanciapercorrida;
				System.out.println("Sapo ==>" + sapo + " Pulo ==> "+ distanciapulo 
						+ "cm Distancia percorrida ==> " + distanciapercorrida+ "cm");
				if (distanciapercorrida>=1000) {
					ganhadores[i] = sapo;
					i = i +1;
					break;
				}
			}
	}
}