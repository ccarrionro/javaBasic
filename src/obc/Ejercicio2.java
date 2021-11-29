// Programa Java curso OBC - Java Básico - Ejercicio 2

/*
  <h1>Ejercicio Sesión 2/h1>
  Crear una función que reciba un precio y devuela el precio con el iva incluido.
  nota: añado el envío del tipo de iva en la función, aunque se podría usar como constante o directamente.
   *
  @author  Carlos Carrión
 * @version 1.0
 * @since   29/11/2021
 */



package obc;

public class Ejercicio2 {

        public static void main(String[] args) {

            float baseImponible = 1230.33f;
            float importeIva;
            int iva = 21;

            importeIva = calcularIva(baseImponible,iva);

            System.out.println("Base imponible: " + baseImponible + "\nIVA " + iva + "%: "+ importeIva );
            System.out.println("Importe Total:" + (baseImponible+importeIva));

        }

        static float calcularIva(float baseImponible, int iva) {
            /* calculamos el IVA dado que en méxico el iva es el 15% multiplicamos el precio por 0.15
             *  Sumamos el precio del producto mas el iva para optener el resultado final
             */

            return baseImponible * iva / 100;

        }
}