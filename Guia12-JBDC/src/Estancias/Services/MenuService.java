
package Estancias.Services;

import Estancias.Entities.Comentarios;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuService {
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    private CasasService casasS = new CasasService();
    private ClientesService clientesS = new ClientesService();
    private EstanciasService estanciasS = new EstanciasService();
    private FamiliasService familiasS = new FamiliasService();
    private ComentariosService comentariosS = new ComentariosService();
    
    public void menu () throws Exception{
        int opc=0;
        
        do {
            System.out.println("");
            System.out.println("SELECCIONE LA OPCION DESEADA");
            System.out.println("1 - Familias que tienen al menos 3 hijos con edad maxima inferior a 10 años");
            System.out.println("2 - Buscar y listar casas disponibles entre 1 de agosto de 2020 y 31 de agosto de 2020 en reino unido");
            System.out.println("3 - Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail");
            System.out.println("4 - Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada y un número de días específico");
            System.out.println("5 - Listar los datos de todos los clientes que en algún momento realizaron una estancia y la descripción de la casa donde la realizaron");
            System.out.println("6 - Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a la anterior");
            System.out.println("7 - Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios actualizados");
            System.out.println("8 - Obtener el número de casas que existen para cada uno de los países diferentes");
            System.out.println("9 - Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios) que están ‘limpias’");
            System.out.println("10 - Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas");
            System.out.println("11 - SALIR");
            opc = leer.nextInt();
            
            try {
                switch (opc) {
                    case 1:
                        familiasS.listarFamilias("select * from familias where num_hijos >= 3 and edad_maxima < 10;");
                        break;
                    case 2:
                        casasS.listarCasasCondicion("select * from casas where fecha_desde >= '2020-08-01' and fecha_hasta <= '2020-08-31' and pais = 'reino unido';");
                        break;
                    case 3:
                        familiasS.listarFamilias("select * from familias where email like '%hotmail%';");
                        break;
                    case 4:
                        System.out.println("Ingrese la fecha de inicio, año, mes y dias");
                        Date fecha = new Date (leer.nextInt(), leer.nextInt(), leer.nextInt());
                        System.out.println("Ingrese la cantidad de dias");
                        int dias = leer.nextInt();
                        casasS.listarCasasCondicion("select *, (tiempo_maximo - tiempo_minimo) as 'dias' from casas where fecha_desde > '"+fecha+"' and (tiempo_maximo - tiempo_minimo) >='"+dias+"';");
                        break;
                    case 5:
                        comentariosS.listarComentarios("select c.id_comentario, c.id_casa, c.comentario from estancias e inner join comentarios c on (e.id_casa = c.id_casa) where c.id_casa in (select distinct e.id_casa from clientes c inner join estancias e on (c.id_cliente = e.id_cliente) group by c.id_casa;");
                        break;
                    case 6:
                        System.out.println("Ingrese el ID del cliente");
                        clientesS.buscarClienteID(leer.nextInt());
                        break;
                    case 7:
                        casasS.modificarPrecioXcondicionPais("update casas set precio_habitacion = (precio_habitacion*1.05) where pais = 'reino unido';");
                        break;
                    case 8:
                        casasS.consultarCasas("select pais, count(*) from casas group by pais;");
                        break;
                    case 9:
                        casasS.consultarCasas("select * from casas where id_casa = (select distinct id_casa from comentarios where comentario like '%limp%');");
                        break;
                    case 10:
                        
                        break;
                }
            } catch (Exception e) {
                throw e;
            }
        } while (opc != 11);
    }
    
}
