

package com.mycompany.guia13.jpa1;

import Entities.Autor;
import Services.AutorService;
import Services.EditorialService;
import Services.LibroService;

public class Ejer01 {

    public static void main(String[] args) {
        AutorService as = new AutorService();
        EditorialService es = new EditorialService();
        LibroService ls = new LibroService();
        
        //Autor autor = new Autor (1, "Federico", true);
        //as.altaAutor(autor);
        
        //as.bajaAutor(2);
        
    }
}
