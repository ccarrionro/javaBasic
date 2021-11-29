package obc.interfaces;

import obc.clases.Coche;

import java.util.List;

/**
 * Interface cocheCRUD
 * Se declaran los métodos pero no se implementan
 * Actuará como un contrato, diciendo que se debe hacer, pero no .. cómo se debe hacer
 */

public interface CocheCRUD {

        void save(Coche coche);

        List<Coche> findAll();

        void delete(Coche coche);
}
