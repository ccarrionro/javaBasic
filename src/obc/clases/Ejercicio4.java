/*
  Ejercicio 4
  <p>En este ejercicio tendr&eacute;is que crear una clase <strong>SmartDevice</strong>. Dentro crear&eacute;is las clases hijas: <strong>SmartPhone</strong> y <strong>SmartWatch</strong>.</p>
  <p>Agregar&eacute;is atributos tal cual tendr&iacute;an esos objetos en la realidad.</p>
  <p>Crear constructor vac&iacute;o y con todos los par&aacute;metros para cada clase.</p>
  <p>Desde una clase <strong>Main</strong>: crear&eacute;is objetos de cada una y los utilizar&eacute;is para imprimir sus valores por consola.</p>

 */


package obc.clases;

public class Ejercicio4 {

    public static void main(String[] args) {

        // creación de un nuevo objeto SmartPhone
        SmartPhone iphone8 = new SmartPhone();

        // llamada a los métodos para asignación de valores. Encapsulación
        iphone8.setFabricante("Apple");
        iphone8.setMarca("Iphone");
        iphone8.setModelo("8 Plus");

        // actualizar método de esta clase hija.
        iphone8.setDualSim(true);

        // creación nuevo objeto SmartWatch
        SmartWatch iWatch3 = new SmartWatch();

        // llamada a los métodos para asignación de valores. Encapsulación
        iWatch3.setFabricante("Apple");
        iWatch3.setModelo("iWatch Serie 3");

        // actualizar método de esta clase hija.
        iWatch3.setPhone(true);

        System.out.println("Fabricante:" + iphone8.getFabricante());
        System.out.println("Marca:" + iphone8.getMarca());
        System.out.println("Modelo:" + iphone8.getModelo());
        System.out.println("¿Es dual Sim?:" + iphone8.isDualSim());

        System.out.println("Fabricante:" + iWatch3.getFabricante());
        System.out.println("Modelo:" + iWatch3.getModelo());
        System.out.println("¿Es teléfono?:" + iWatch3.isPhone());


    }


}
