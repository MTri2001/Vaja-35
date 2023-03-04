package com.matictrilar.gui;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    @FXML
    private TextField miza_visina_mize;
    @FXML
    private TextField miza_sirina_mize;
    @FXML
    private TextField miza_material;

    @FXML
    private TextField pred_visina_mize;
    @FXML
    private TextField pred_sirina_mize;
    @FXML
    private TextField pred_material;

    @FXML
    private TextField pred_velikost_predala;
    @FXML
    private CheckBox pred_zaklenjena;

    @FXML
    private TextField zloz_visina_mize;
    @FXML
    private TextField zloz_sirina_mize;
    @FXML
    private TextField zloz_material;

    @FXML
    private CheckBox zloz_zlozena;


    private ArrayList<Miza> mize = new ArrayList<>();

    @FXML
    protected void ustvariMizo() {
        System.out.println("ustvariMizo");
        Miza miza = new Miza(
                Integer.parseInt(this.miza_sirina_mize.getText()),
                Integer.parseInt(this.miza_visina_mize.getText()),
                this.miza_material.getText()
        );
        this.mize.add(miza);
        this.izpis();
    }

    @FXML
    protected void ustvariPredalnoMizo() {
        System.out.println("ustvariPredalnoMizo");
        PredalnaMiza miza = new PredalnaMiza(
                Integer.parseInt(this.pred_sirina_mize.getText()),
                Integer.parseInt(this.pred_visina_mize.getText()),
                this.pred_material.getText(),
                Integer.parseInt(this.pred_velikost_predala.getText()),
                this.pred_zaklenjena.isSelected()
        );
        this.mize.add(miza);
        this.izpis();
    }

    @FXML
    protected void ustvariZlozljivoMizo() {
        System.out.println("ustvariZlozljivoMizo");
        ZlozljivaMiza miza = new ZlozljivaMiza(
                Integer.parseInt(this.zloz_sirina_mize.getText()),
                Integer.parseInt(this.zloz_visina_mize.getText()),
                this.zloz_material.getText(),
                this.zloz_zlozena.isSelected()
        );
        this.mize.add(miza);
        this.izpis();
    }

    protected void izpis(){
        for (int i = 0; i < mize.size(); i++) {
            System.out.println(mize.get(i));
        }
    }
}
