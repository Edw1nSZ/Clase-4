package animales;

public class Gato extends Animal{

    public Gato(int edad, String nombre) {
        super(edad, nombre);
    }
    @Override
    public void comer(){
        System.out.println("Gato comer");
    }
}
