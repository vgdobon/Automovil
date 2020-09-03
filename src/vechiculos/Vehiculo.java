package vechiculos;

public abstract class Vehiculo implements IMusicable {

    protected boolean arrancado;
    protected String marca;
    protected String modelo;
    protected int cilindrada;
    protected String color;
    protected int velocidad=0;

    //color velocidad acelrar y frenar para apagar velocidad en 0

    public Vehiculo(String marca,String modelo,String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color=color;
        this.velocidad = velocidad;
    }

    public abstract void arrancar();
    public abstract void apagar();

    public void frenar(){
        if(velocidad > 0 && arrancado == true){
            System.out.println("Frenando");
            velocidad--;
        }else{
            System.out.println("El coche está parado");
        }

    }
    public void acelerar(){
        if(arrancado=true){
            System.out.println("Acelerando");
            velocidad++;
        }else{
            System.out.println("El coche está apagado");
        }

    }

    public void conducir(){
        if(arrancado){
            System.out.println("Estamos conduciendo el coche");
        }else{
            System.out.println("El coche no está arrancado");
        }
    }



    public boolean isArrancado() {
        return arrancado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public int getCilindrada() {
        return cilindrada;
    }

    public String getColor() {
        return color;
    }

    public int getVelocidad() {
        return velocidad;
    }

}
