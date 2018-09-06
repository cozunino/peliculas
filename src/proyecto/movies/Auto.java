/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.movies;

/**
 *
 * @author conizunino
 */
public class Auto {
    
    int id;
    String matricula;
    String marca;
    int año;
    float precio;
    boolean vendido;
    
    public void mostrarauto(){
        
        System.out.println(this.id);
        System.out.println(this.marca);
        System.out.println(this.año);
        System.out.println(this.precio);
        System.out.println(this.vendido);
    }
    
    public void mostaraventa(){
    }
    
    
}
