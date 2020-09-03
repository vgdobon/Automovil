import vechiculos.Bicileta;
import vechiculos.IMusicable;
import vechiculos.Moto;
import vechiculos.Vehiculo;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Vehiculo moto = new Moto("Ducatti","Monster",125,"Negra");

        moto.conducir();
        moto.arrancar();
        moto.conducir();
        moto.apagar();
        moto.conducir();

        System.out.println(moto.getCilindrada() + " cv");
        System.out.println(moto.getMarca());
        System.out.println(moto.isArrancado());

        moto.acelerar();
        moto.acelerar();
        System.out.println(moto.getVelocidad());

        moto.apagar();
        moto.frenar();
        System.out.println(moto.getVelocidad());
        moto.apagar();
        moto.frenar();
        moto.apagar();

        IMusicable musicable = Tombola.sortearElemento();

        musicable.iniciarReproducion();
    }
}
