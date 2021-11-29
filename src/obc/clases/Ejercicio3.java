package obc.clases;

public class Ejercicio3 {

        public static void main(String[] args) {

            String[] letras = {"A", "L", "E", "L", "U","Y", "A"};

            String letrasConcatenadas = "";

            for (int i = 0; i < letras.length; i++){
                letrasConcatenadas = letrasConcatenadas + " " + letras[i];
            }

            System.out.println(letrasConcatenadas);
        }
}
