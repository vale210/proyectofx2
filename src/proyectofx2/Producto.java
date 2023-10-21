/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofx2;

/**
 *
 * @author LENOVO
 */
public class Producto {

   String idprodu;
   String nomprodu;
   String felote;
   String fevenci;
   float precio;
   
   public Producto (){
       
       idprodu= "";
       nomprodu= "";
       felote= "";
       fevenci= "";
       precio = -1;
       
       
   }
       
   
   public Producto (String idprodu, String nomprodu, String felote, String fevenci, float precio){
       this.idprodu=idprodu;
       this.nomprodu=nomprodu;
       this.felote=felote;
       this.fevenci=fevenci;
       this.precio=precio;
       
   }

    public String getIdprodu() {
        return idprodu;
    }

    public void setIdprodu(String idprodu) {
        this.idprodu = idprodu;
    }

    public String getNomprodu() {
        return nomprodu;
    }

    public void setNomprodu(String nomprodu) {
        this.nomprodu = nomprodu;
    }

    public String getFelote() {
        return felote;
    }

    public void setFelote(String felote) {
        this.felote = felote;
    }

    public String getFevenci() {
        return fevenci;
    }

    public void setFevenci(String fevenci) {
        this.fevenci = fevenci;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
}
