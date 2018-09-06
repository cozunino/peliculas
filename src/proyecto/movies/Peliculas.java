/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.movies;

import javax.swing.JOptionPane;

/**
 *
 * @author conizunino
 */
public class Peliculas {
    
    int id;
    String titulo;
    String genero;
    String creador;
    int duracion;
    int año;
    boolean visto;
    int tiempovisto;
    
    public void mostrardatos(){
        
        if (this.tiempovisto == 0){
       
        JOptionPane.showMessageDialog(null, "Pelicula: " +
        "\nID: " + this.id +
        "\nTitulo: " + this.titulo +
        "\nGenero: " + this.genero +
        "\nCreador: " + this.creador +
        "\nDuracion: " + this.duracion +
        "\nAño: " + this.año +
        "\nVisto: " + this.visto + 
        "\n" + this.tiempovisto);
        }
        else{
        System.exit(0);
       }  
    }
    
    public void mostrarduracion(){
    }
    
    
 }
    

