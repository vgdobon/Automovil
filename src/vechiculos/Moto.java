package vechiculos;

public class Moto extends Vehiculo {

    public int cilindrada;

    public Moto(String marca,String modelo, int cilindrada){
        super(marca,modelo);
        this.cilindrada = cilindrada;

    }

    @Override
    public void arrancar(){
        System.out.println("Girando llave");
        System.out.println("Vehiculo arrancado");
        arrancado=true;
    }

    @Override
    public void apagar() {
        arrancado=false;
        System.out.println("Coche apagado");
    }

}
