package com.matictrilar.gui; /**
* Ime datoteke: Mizaplus.java
* @author  Zara Ali Matic Trilar
*/

/** Deklariramo javni razred MizaPlus */
public class PredalnaMiza extends Miza{

	private String[] predal;
	private int stObjektov;
	private boolean jeZakljenena;
	private int velikostPredala;

	public PredalnaMiza(int dolzina, int visina, String material, int velikostPredala, boolean jeZakljenena){

		super(dolzina, visina, material);
		this.velikostPredala = velikostPredala;
		this.predal = new String[velikostPredala];
		this.jeZakljenena = jeZakljenena;
		this.stObjektov = 0;
	}

	public void odkleni(){

		this.jeZakljenena= false;


	}

	public void zakleni(){

		this.jeZakljenena = true;


	}

	public void shrani(String objekt) throws PolnPredalError {
		if(this.stObjektov ==this.velikostPredala) throw new PolnPredalError();

		this.predal[this.stObjektov] = objekt;
		this.stObjektov ++;


	}

}
