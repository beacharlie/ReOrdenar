<h1>Tarea para ED03: test y TDD</h1>

# <ins>Reordenar Dígitos Descendentemente</ins>

## <ins>Enunciado del Problema</ins>

Tu tarea consiste en crear una función que tome cualquier entero no negativo como argumento y lo devuelva con sus dígitos en orden descendente. Básicamente, reorganiza los dígitos para obtener el mayor número posible.

 ## <ins>Ejemplos:</ins>

Entrada: 42145 Salida: 54421

Entrada: 145263 Salida: 654321

Entrada: 123456789 Salida: 987654321
<br>

## a) Investiga lo que es el TDD, como aproximación básica vamos a escribir primero los test siguiendo esta filosofía y esta estructura, ten en cuenta que los valores en el ejemplo no son los correctos: 

# <a>a)</a> <ins>Desarrollo Guiado por Pruebas (TDD)</ins>

El Desarrollo Guiado por Pruebas (TDD) es una metodología de desarrollo de software que se basa en un ciclo corto y repetitivo de los siguientes pasos:

1.  **<mark>Red (Roja)</mark>:** Escribir una prueba (test) fallida para una pequeña parte de la funcionalidad.
2.  **<mark>Green (Verde)</mark>:** Escribir la menor cantidad de código posible para que la prueba pase.
3.  **<mark>Refactor (Refactorizar)</mark>:** Mejorar el código sin alterar su comportamiento externo.

<br>

## b)Investiga qué es el assertEquals y si hay más tipos de assert.

# <a>b)</a> <ins>assertEqualsy otros tipos deassert</ins>
assertEquals(expected, actual) es un método de la clase Assert en JUnit que verifica si el valor actual (actual) producido por el código bajo prueba es igual al valor esperado (expected). Si no son iguales, la prueba falla.

<br>

JUnit proporciona varios otros métodos assert para diferentes tipos de verificaciones, los que he encontrado más interesantes son:

- assertTrue(condition): Verifica si una condición booleana es true.

- assertFalse(condition): Verifica si una condición booleana es false.

- assertSame(expected, actual): Verifica si dos referencias de objeto apuntan al mismo objeto.

- assertArrayEquals(expectedArray, actualArray): Verifica si dos arrays son iguales en contenido y orden.

-assertThrows(expectedThrowable, executable): Verifica que la ejecución de un bloque de código lanza una excepción del tipo esperado.

- assertTimeout(timeout, executable): Verifica que la ejecución de un bloque de código completa dentro de un tiempo límite específico.

- assertNotEquals(unexpected, actual): Verifica si dos valores no son iguales.

## c) He puesto unos ejemplos, hay algún valor límite que sea interesante comprobar?

# <a>c)</a> <ins>Valores Límite para Comprobación</ins>

 - Cero (0): Debe devolver 0.

 - Números con dígitos repetidos: Debe devolver un número repetido despues de otro (62285 devolvera 86522).

 - Números con todos los dígitos iguales: Debe devolver el mismo numero.

 - Numeros negativos: Debe devolver una Exception.

## d) Ahora escribe el código para que cumpla los tests diseñados anteriormente. 

# <a>d)</a><ins>Codigo</ins>

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class ReOrdenar {

  public static int ordenarDesc(final int num) {
    int aux = 0;
    if (num < 0){
        throw new IllegalArgumentException("El número debe ser no negativo."); // excepcion en caso de ser negativo
    }else if(num == 0){
      return 0;
    }else{
        String b = String.valueOf(num); //paso los numeros a String para poder separarlos
        String[] p = b.split(""); // los separo con ""
        Arrays.sort(p); // ordenamos el array con los numeros declarados String
        StringBuilder resul = new StringBuilder(); //creo un StringBuilder para concatenar la cadena

        for (int i = p.length - 1; i >=0; i--){ //un for que recorra la cadena de mayor a menor
          resul.append(p[i]); //concatenamos de mayor a menor
        }
        return Integer.parseInt(resul.toString()) //Convertimos el String a Int y lo devolvemos
    }

  }

}

