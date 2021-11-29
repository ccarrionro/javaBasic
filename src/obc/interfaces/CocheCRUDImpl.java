package obc.interfaces;

import obc.clases.Coche;

import java.util.ArrayList;
import java.util.List;


public class CocheCRUDImpl implements CocheCRUD {

    private List<Coche> coches = new ArrayList<>();

    @Override
    public void save(Coche coche) {

        coches.add(coche);

        System.out.println("Método save");
    }

    @Override
    public List<Coche> findAll() {

        System.out.println("Método findAll");

        return coches;
    }

    @Override
    public void delete(Coche coche) {

        coches.remove(coche);
        System.out.println("Método remove");


    }

}
