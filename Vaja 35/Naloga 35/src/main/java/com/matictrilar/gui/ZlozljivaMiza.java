package com.matictrilar.gui; /**
* Ime datoteke: Mizaplus.java
* @author  Zara Ali Matic Trilar
*/

/** Deklariramo javni razred MizaPlus */
public class ZlozljivaMiza extends Miza{

	private boolean jeZlozena;

	public ZlozljivaMiza(int dolzina, int visina, String material, boolean jeZlozena){

		super(dolzina, visina, material);
		this.jeZlozena = jeZlozena;
	}

	public void zlozi(){

		this.jeZlozena = true;


	}

	public void razsiri(){

		this.jeZlozena = false;


	}

}
