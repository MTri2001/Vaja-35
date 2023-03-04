package com.matictrilar.gui; /**
* Ime datoteke: Mizaplus.java
* @author  Zara Ali Matic Trilar
*/

/** Deklariramo javni razred MizaPlus */
public interface MizaInterface{
	public void spremeniD(int dX, int vY) throws NemogocaSprembaError;
	public float cena();
	public float teza();
}
