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
            listaController.productos.add(v);
            JOptionPane.showMessageDialog(null, "El producto esta registrado");
        }
        
    }
    public void eliminarproducto(){
        String fecha = listaController.fecha;
        Producto eliminar = new Producto();
        for(Producto lista : pila){
            eliminar = buscarfechavenci(fecha);
            while (eliminar != null){
                pila.remove(eliminar);
                listaController.productos.remove(eliminar);
                eliminar = buscarfechavenci(fecha);
            }
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
    
    public void listarprecio(float precio){
        for(Producto lista : pila){
            if(lista.precio == precio){
                JOptionPane.showMessageDialog(null, "El producto con el precio buscado es:\n"
                                                                        + "id: " + lista.idprodu+"\n"
                                                                        + "nombre: " + lista.nomprodu+"\n"
                                                                        + "fecha lote: "  + lista.felote+"\n"
                                                                        + "fecha vencimiento: " + lista.fevenci+"\n"
                                                                        + "precio: " + lista.precio);
            }
        }   
    }
    public void listarid(String id){
        for(Producto lista : pila){
            if(lista.idprodu.equals(id)){
                JOptionPane.showMessageDialog(null, "El producto con el id buscado es:\n"
                                                                        + "id: " + lista.idprodu+"\n"
                                                                        + "nombre: " + lista.nomprodu+"\n"
                                                                        + "fecha lote: "  + lista.felote+"\n"
                                                                        + "fecha vencimiento: " + lista.fevenci+"\n"
                                                                        + "precio: " + lista.precio);
            }
        }
        
    }
     public void listarnom(String nom){
        for(Producto lista : pila){
            if(lista.nomprodu.equals(nom)){
                JOptionPane.showMessageDialog(null, "El producto con el nombre buscado es:\n"
                                                                        + "id: " + lista.idprodu+"\n"
                                                                        + "nombre: " + lista.nomprodu+"\n"
                                                                        + "fecha lote: "  + lista.felote+"\n"
                                                                        + "fecha vencimiento: " + lista.fevenci+"\n"
                                                                        + "precio: " + lista.precio);
            }
        }
        
    }
      public void listarfechalote(String lote){
        for(Producto lista : pila){
            if(lista.felote.equals(lote)){
                JOptionPane.showMessageDialog(null, "El producto con la fecha lote buscada es:\n"
                                                                        + "id: " + lista.idprodu+"\n"
                                                                        + "nombre: " + lista.nomprodu+"\n"
                                                                        + "fecha lote: "  + lista.felote+"\n"
                                                                        + "fecha vencimiento: " + lista.fevenci+"\n"
                                                                        + "precio: " + lista.precio);
            }
        }
        
    }
       public void listarfechavenci(String venci){
        for(Producto lista : pila){
            if(lista.fevenci.equals(venci)){
                JOptionPane.showMessageDialog(null, "El producto con la fecha de vencimiento buscada es:\n"
                                                                        + "id: " + lista.idprodu+"\n"
                                                                        + "nombre: " + lista.nomprodu+"\n"
                                                                        + "fecha lote: "  + lista.felote+"\n"
                                                                        + "fecha vencimiento: " + lista.fevenci+"\n"
                                                                        + "precio: " + lista.precio);
            }
        }
        
    }
       
        
}


