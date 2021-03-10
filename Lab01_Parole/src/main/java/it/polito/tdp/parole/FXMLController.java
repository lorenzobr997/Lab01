package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextArea txtPrestazioni;

    @FXML
    private Button btnCancella;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    	elenco.getElenco().clear();
    	txtResult.setText("");
    	String p = txtParola.getText();
    	elenco.addParola(p);
    	String list = ""; 
    	
    	for (String s : elenco.getElenco())
    	{
    	    list = list + s + "\n";
    	}
    	txtResult.appendText(list);
    	String pres = "" + System.nanoTime();
    	txtPrestazioni.appendText(pres + "\n");
    	txtParola.setText("");
    	// TODO
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	String s = txtResult.getSelectedText();
    	
    	String list = ""; 
    	
    	for (String st : elenco.canc(s))
    	{
    	    list = list + st + "\n";
    	}
    	txtResult.setText("");
    	txtResult.appendText(list);

    }


    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	elenco.reset();
    	txtResult.setText("");
    	txtPrestazioni.setText("");
    	txtParola.setText("");
    	
    }

    @FXML
    void initialize() {
    	assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtPrestazioni != null : "fx:id=\"txtPrestazioni\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
