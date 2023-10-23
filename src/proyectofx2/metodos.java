/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofx2;

import java.util.Stack;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class metodos {
  
    private Stack<Producto> pila;

    public metodos(){
        this.pila=new Stack<>();
    }
    
    public void pushprodu(Producto v){
        if(buscaridprodu(v.idprodu) != null){
            JOptionPane.showMessageDialog(null, "El id del producto ya se encuentra registrado" );
            
        }else if(buscarnomprodu(v.nomprodu) != null){
            JOptionPane.showMessageDialog(null, "El nombre del producto ya se encuentra registrado");
        }else{
            pila.push(v);
            JOptionPane.showMessageDialog(null, "El producto esta registrado");
        }
        
    }
    
    public Producto buscaridprodu(String id){
        Producto aux=new Producto();
        int i=0;
        while(i<pila.size()){
            aux=(Producto) pila.get(i);
            if(aux.idprodu.equals(id))
                return aux;
            i++;
                       
        }
        aux=null;
        return aux;
        
    }
    
    public Producto buscarnomprodu(String nomprodu){
        Producto aux=new Producto();
        int i=0;
        while(i<pila.size()){
            aux=(Producto) pila.get(i);
            if(aux.nomprodu.equals(nomprodu))
                return aux;
            i++;
                
        }
        aux=null;
        return aux;
    }
    
    public Producto buscarfechalote(String fechalote){
         Producto aux=new Producto();
        int i=0;
        while(i<pila.size()){
            aux=(Producto) pila.get(i);
            if(aux.felote.equals(fechalote))
                return aux;
            i++;
                
        }
        aux=null;
        return aux;
        
    }
    public Producto buscarfechavenci(String fecvenci){
         Producto aux=new Producto();
        int i=0;
         while(i<pila.size()){
            aux=(Producto) pila.get(i);
            if(aux.fevenci.equals(fecvenci))
                return aux;
            i++;
                
        }
         aux=null;
        return aux;
    }
    
    public Producto buscarprecio(float precio){
        Producto aux=new Producto();
        int i=0;
        while(i<pila.size()){
            aux=(Producto) pila.get(i);
            if(aux.precio == precio)
                return aux;
            i++;
                
        }
        aux=null;
        return aux;
        
    }
    
}


