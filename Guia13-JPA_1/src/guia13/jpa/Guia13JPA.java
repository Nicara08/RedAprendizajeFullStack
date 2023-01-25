
package guia13.jpa;

import guia13.jpa.IGU.Principal;
import guia13.jpa.Services.MenuService;

public class Guia13JPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        MenuService ms = new MenuService();
        //ms.menu();
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }
    
}
