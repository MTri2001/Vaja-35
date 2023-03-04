package com.matictrilar.gui; /**
* Ime datoteke: Mizaplus.java
* @author  Zara Ali Matic Trilar
*/

/** Deklariramo javni razred MizaPlus */
public class Miza implements MizaInterface{

	//Deklariramo zasebne lastnosti razrede MizaPlus
	private int dolzinaMize; // v mm
	private String materialMize;
	private int visinaMize; // v mm
	static private float cenaNaDolzino = 0.5f;
	static private float cenaNaVisino = 0.5f;
	static private float tezaNaDolzina = 2;
	static private float tezaNaVisino = 2;
	/**
   * Javno konstrukor mize
   * @param dolzina int mize
   * @param visina int Mize
   * @param material string mize
   */
	public Miza(int dolzina, int visina, String material) {
		// Inicializiramo lastnosti objekta
		this.dolzinaMize = dolzina;
		this.visinaMize = visina;
		this.materialMize = material;

		System.out.println("Ustvarjam nov objekt Miza");

	}


	/**
   * Javno metoda za podaljšanje mize
   * show the usage of various javadoc Tags.
   * @param dX int za koliko se spremeni dolžina mize dx
   * @param vY int za koliko se spremeni VIŠINA mize vY
   * @return boolean Ali so se uspešne spremembe uspešno izvedle
   */
	public void spremeniD(int dX, int vY) throws NemogocaSprembaError {

		if(this.dolzinaMize + dX > 0){

			this.dolzinaMize = this.dolzinaMize + dX;

			System.out.println("Dolzine mize je spremenjena");

		}
		else {

			System.out.println("Dolzina mize ni spremenjena");
			throw new NemogocaSprembaError();

		}
		if(this.visinaMize + vY > 0) {

			this.visinaMize = this.visinaMize + vY;

			System.out.println("Višina mize je spremenjena");

		}
		else {

			System.out.println("Višina mize ni spremenjena");
			throw new NemogocaSprembaError();
		}
	}
	/**
   * Javno metoda za ceno
   * @return float vrednost mize na podlagi materiala
   */
	public float cena(){

		float cena = 0;

		cena += cenaNaDolzino * this.dolzinaMize;

		cena += cenaNaVisino * this.visinaMize;

		if(this.materialMize.equals("Les")){

			cena*= 1.2;

		}
		else if(this.materialMize.equals("Kovina")){

			cena *= 3.5;
		}
		else {

			cena *= 2;

		}
		return cena;
	}
	/**
   * Javno metoda za tezo
   * @return float vrednost tezo mize na podlagi materiala
   */
	public float teza(){

		float teza = 0;

		teza += tezaNaDolzina * this.dolzinaMize;

		teza += tezaNaVisino * this.visinaMize;

		if(this.materialMize.equals("Les")){

			teza*= 1.2;

		}
		else if(this.materialMize.equals("Kovina")){

			teza *= 3.5;
		}
		else {

			teza *= 2;

		}
		return teza;
	}
	  @Override
	  public String toString() {
		  return "Miza(visina=" + this.visinaMize + ", dolzina=" + this.dolzinaMize + ", materijal=" + this.materialMize + ")";
		}
}
