package obc.interfaces;

import obc.clases.Coche;

/**
 * Ejercicio 2
 *
 * Crear una interfaz CocheCRUD.
 *
 * Crear una implementación obc.interfaces.CocheCRUDImpl que implemente la interfaz CocheCRUD.
 *
 * Como métodos de CocheCRUD podemos poner:
 *
 * save()
 * findAll()
 * delete() que simplemente impriman por consola el nombre del propio método.
 *
 *
 * Desde una clase Main, Crear un objeto de tipo obc.interfaces.CocheCRUDImpl y llamar a cada uno de los métodos.
 *
 * Ejemplo: CocheCRUD cocheCrud = new obc.interfaces.CocheCRUDImpl()
 */

public class Ejercicio5 {

    // podemos cambiar la implementación de la interface sin cambiar código.
    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {


        //CocheCRUD cocheImpl = new CocheCRUDImpl();

        // añadir coches

        Coche coche1 = new Coche("BMW","320","3283JDT",2000);
        Coche coche2 = new Coche("Mercedes","Clase A","3223JGT",2300);
        Coche coche3 = new Coche("AUDI","Q5","332JAX",2800);

        //Agregando coches desde la clase CocheImpl

        cocheCRUD.save(coche1);

        cocheCRUD.findAll();

        cocheCRUD.delete(coche1);


    }
}
