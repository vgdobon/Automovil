package vechiculos;

public abstract class Vehiculo {

    protected boolean arrancado;
    protected String marca;
    protected String modelo;
    protected int cilindrada;

    public Vehiculo(String marca,String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void arrancar();
    public abstract void apagar();

    public void frenar(){
        System.out.println("Frenando");
    }

    public void conducir(){
        if(arrancado){
            System.out.println("Estamos conduciendo el coche");
        }else{
            System.out.println("El coche no está arrancado");
        }
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public boolean isArrancado() {
        return arrancado;
    }
    public String getMarca() {
        return marca;
    }

}
