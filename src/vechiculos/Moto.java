package vechiculos;

public class Moto extends Vehiculo{

    public int cilindrada;

    public Moto(String marca,String modelo, int cilindrada,String color){
        super(marca,modelo,color);
        this.cilindrada = cilindrada;

    }



    @Override
    public void arrancar(){
        if(!arrancado){
            System.out.println("Girando llave");
            System.out.println("Vehiculo arrancado");
            arrancado=true;
        }else{
            System.out.println("El coche ya está arrancado");
        }

    }

    @Override
    public void apagar() {
        if(velocidad==0){
            if(arrancado==true){

                arrancado=false;
                System.out.println("Girando llave..");
                System.out.println("Coche apagado");

            } else {
                System.out.println("El coche ya está apagado");
            }

        } else {
            System.out.println("El coche está en marcha, la velocidad debe ser 0");
        }

    }

    @Override
    public void iniciarReproducion() {
        System.out.println("Reproduciendo música en la moto");
    }

    @Override
    public void detenerReproduccion() {
        System.out.println("Parando música en la moto");
    }
}
