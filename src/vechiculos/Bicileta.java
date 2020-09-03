package vechiculos;


public class Bicileta implements IMusicable {

    @Override
    public void iniciarReproducion() {
        System.out.println("Reproduciendo música en la bicicleta");
    }

    @Override
    public void detenerReproduccion() {
        System.out.println("Parando música en la bicicleta");
    }
}
