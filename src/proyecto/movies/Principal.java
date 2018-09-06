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
public class Principal {
    
    public static void main (String [] args){
        
        
        System.out.println("Auto 1 tiene las caracteristicas:");
        Auto auto1=new Auto ();
        
        auto1.id = 101;
        auto1.matricula = "jkr10125";
        auto1.marca = "BMW";
        auto1.año = 2010;
        auto1.vendido = true;
        
        auto1.mostrarauto();
        
        System.out.println("---------------------");
         
        System.out.println("Auto 2 tiene las caracteristicas:");
        Auto auto2=new Auto ();
        
        auto2.id = 102;
        auto2.matricula = "irl64646";
        auto2.marca = "Fiat";
        auto2.año = 2012;
        auto2.vendido = false;
        
        auto2.mostrarauto();
        
        System.out.println("---------------------");
         
        //System.out.println("Pelicula 1");
        Peliculas peli1 = new Peliculas(); 
      
        
        peli1.id = 1001;
        peli1.titulo = "Back to the Future";
        peli1.genero = "Ciencia ficcion";
        peli1.creador = "Robert Zemeckis";
        peli1.duracion = 116;
        peli1.año = 1985;
        peli1.visto = true;
        
        peli1.mostrardatos();
        
        
        //System.out.println("Pelicula 2");
        Peliculas peli2 = new Peliculas();
      
        peli2.id = 1002;
        peli2.titulo = "Back to the Future - Part II";
        peli2.genero = "Ciencia ficcion";
        peli2.creador = "Robert Zemeckis";
        peli2.duracion = 108;
        peli2.año = 1989;
        peli2.visto = true;
        
        peli2.mostrardatos();
        
        Peliculas peli3 = new Peliculas();
      
        peli3.id = 1003;
        peli3.titulo = "Back to the Future - Part III";
        peli3.genero = "Ciencia ficcion";
        peli3.creador = "Robert Zemeckis";
        peli3.duracion = 116;
        peli3.año = 1990;
        peli3.visto = true;
        
        peli3.mostrardatos();
    }
    
}
