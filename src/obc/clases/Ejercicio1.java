package obc.clases;

/**
 * Tipos de datos en Java
 */

public class Ejercicio1 {

    public static void main(String[] args) {

        // Tipo de datos primitivos
        // ======================================

        /*

        Tipos numéricos enteros

        byte: como su propio nombre denota, emplea un solo byte (8 bits) de almacenamiento. Esto permite almacenar valores en el rango [-128, 127].
        short: usa el doble de almacenamiento que el anterior, lo cual hace posible representar cualquier valor en el rango [-32.768, 32.767].
        int: emplea 4 bytes de almacenamiento y es el tipo de dato entero más empleado. El rango de valores que puede representar va de -231 a 231-1.
        long: es el tipo entero de mayor tamaño, 8 bytes (64 bits), con un rango de valores desde -263 a 263-1.

        */

        byte var1 = 126;
        short var2 = 30254;
        int var3 = 230;
        long var4 = -250;

        /*
        Tipos numéricos en punto flotante

        Los tipos numéricos en punto flotante permiten representar números tanto muy grandes como muy pequeños además de números decimales.

        float: conocido como tipo de precisión simple, emplea un total de 32 bits. Con este tipo de datos es posible representar números en el rango de 1.4x10-45 a 3.4028235x1038.
        double: sigue un esquema de almacenamiento similar al anterior, pero usando 64 bits en lugar de 32. Esto le permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308.

        */

        float var5 = 12.33f;
        double var6 = -322.982d;

        /*
        Booleanos y caracteres

        boolean: tiene la finalidad de facilitar el trabajo con valores "verdadero/falso" (booleanos), resultantes por regla general de evaluar expresiones. Los dos valores posibles de este tipo son true y false.
        char: se utiliza para almacenar caracteres individuales (letras, para entendernos). En realidad está considerado también un tipo numérico, si bien su representación habitual es la del carácter cuyo código almacena. Utiliza 16 bits y se usa la codificación UTF-16 de Unicode.

        */

        boolean var7 = true;
        char var8 = 'g';

        // Tipo de datos estructurados - clases
        // ======================================


        /*
        Cadenas de caracteres

        Aunque las cadenas de caracteres no son un tipo simple en Java, sino una instancia de la clase String, el lenguaje otorga un tratamiento bastante especial a este tipo de dato, lo cual provoca que, en ocasiones, nos parezca estar trabajando con un tipo primitivo.
        Aunque cuando declaramos una cadena estamos creando un objeto, su declaración no se diferencia de la de una variable de tipo primitivo de las que acabamos de ver:

         */

        String var9 = "Variable tipo String de ejemplo";

        /*
        Vectores o arrays

        Los vectores son colecciones de datos de un mismo tipo. También son conocidos popularmente como arrays.
        Un vector es una estructura de datos en la que a cada elemento le corresponde una posición identificada por uno o más índices numéricos enteros.
        También es habitual llamar matrices a los vectores que trabajan con dos dimensiones.

         */



        int[][] matriz;
        matriz = new int[2][2];

        matriz[0][1] = 29;

        System.out.println("1. Tipo de datos primitivos");
        System.out.println();
        System.out.println("Tipos numéricos enteros");
        System.out.println("=======================");
        System.out.println("Byte:"+var1);
        System.out.println("Short:"+var2);
        System.out.println("Int:"+var3);
        System.out.println("Long:"+var4);

        System.out.println();

        System.out.println("Tipos numéricos en punto flotante");
        System.out.println("=================================");
        System.out.println("Float:"+var5);
        System.out.println("Double:"+var6);

        System.out.println();

        System.out.println("Tipos caracteres y booleanos");
        System.out.println("============================");
        System.out.println("Booleano:"+var7);
        System.out.println("Char:"+var8);

        System.out.println();

        System.out.println("2. Tipo de datos estructurados - clases");
        System.out.println();

        System.out.println("Cadenas de caracteres / Vectores o arrays");
        System.out.println("=========================================");
        System.out.println("Cadena caracteres:"+var9);
        System.out.println("Array:"+matriz[0][1]);

        System.out.println();

    }
}
