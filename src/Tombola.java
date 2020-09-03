import vechiculos.Bicileta;
import vechiculos.IMusicable;
import vechiculos.Moto;
import vechiculos.Vehiculo;

import java.util.Random;

public class Tombola {

    public static IMusicable sortearElemento(){
        int numeroAleatorio = new Random(3).nextInt(2);
        System.out.println(numeroAleatorio);
        if(numeroAleatorio==0){
            return new Bicileta();

        }else{
            return new Moto("Peugeot","125 Super Sport",125,"Amarillo");
        }

    }

}
