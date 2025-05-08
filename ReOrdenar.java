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
