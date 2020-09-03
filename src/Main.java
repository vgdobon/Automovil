import com.clases.*;
import vechiculos.Moto;
import vechiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {

        Vehiculo moto = new Moto("Ducatti","Monster",125);

        moto.conducir();
        moto.arrancar();
        moto.conducir();
        moto.apagar();
        moto.conducir();

        System.out.println(moto.getCilindrada() + " cv");
        System.out.println(moto.getMarca());
        System.out.println(moto.isArrancado());
    }
}
