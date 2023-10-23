/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package proyectofx2;

import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class listaController implements Initializable {
    
    public metodos pila=new metodos();
    Calendar calendario = new GregorianCalendar();
    int dia = calendario.get(Calendar.DATE);
    int mes = calendario.get(Calendar.MONTH);
    int año = calendario.get(Calendar.YEAR);
    String fecha;
    @FXML
    private TableView<Producto>tabla;
    @FXML
    private TableColumn<Producto, String>idprodu;
    @FXML
    private TableColumn<Producto, String>nomprodu;
    @FXML
    private TableColumn<Producto, String>felote;
    @FXML
    private TableColumn<Producto, String>fevenci;
    @FXML
    private TableColumn<Producto, Float>precio;
    public static ObservableList<Producto> productos=FXCollections.observableArrayList();
    @FXML
    private MenuItem btnpromedio,btnmayorpromedio,btnmenorpromedio,btnmayorprecio,btnmenorprecio,btnid,btnnombre,btnlote,btnvenci,btnprecio;
    @FXML
    private Button btnmenor10, btnmenoe1, btnm1, btnm10, btncerrar, btnregistrar;
    @FXML
    private TextField txtid,txtnombre,txtprecio,txtlote,txtvenci;
    @FXML
    private void actionevent(ActionEvent e){
        Object evt=e.getSource();
        if(evt.equals(btnregistrar)){
            String id = txtid.getText();
            String nom = txtnombre.getText();
            String lote = txtlote.getText();
            String venci = txtvenci.getText();
            float pre = Float.parseFloat(txtprecio.getText());
            Producto v = new Producto(id, nom, lote, venci, pre);
            pila.pushprodu(v);
            txtid.setText("");
            txtnombre.setText("");
            txtprecio.setText("");
        }
    }
    @Override       
    public void initialize(URL url, ResourceBundle rb) {
        calendario.add(Calendar.DATE, 31);
        dia = calendario.get(Calendar.DATE);
        mes = calendario.get(Calendar.MONTH);
        año = calendario.get(Calendar.YEAR);
        txtvenci.setText(String.valueOf(dia)+ "/" + String.valueOf(mes+1)+ "/" + String.valueOf(año));
        calendario.add(Calendar.DATE, -31);
        dia = calendario.get(Calendar.DATE);
        mes = calendario.get(Calendar.MONTH);
        año = calendario.get(Calendar.YEAR);
        txtlote.setText(String.valueOf(dia)+ "/" + String.valueOf(mes+1)+ "/" + String.valueOf(año));
        idprodu.setCellValueFactory(new PropertyValueFactory<Producto, String>("idprodu"));
        nomprodu.setCellValueFactory(new PropertyValueFactory<Producto, String>("nomprodu"));
        felote.setCellValueFactory(new PropertyValueFactory<Producto, String>("felote"));
        fevenci.setCellValueFactory(new PropertyValueFactory<Producto, String>("fevenci"));
        precio.setCellValueFactory(new PropertyValueFactory<Producto, Float>("precio"));
        tabla.setItems(productos);
        
        // TODO
    }    
    
}
