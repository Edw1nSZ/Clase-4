package animales;
//para implementar una interfaz se usa la palabra implements
public class Gato extends Animal implements Alimentos{

    public Gato(int edad, String nombre) {
        super(edad, nombre);
    }
    @Override
    public void comer(){
        System.out.println("Gato comer");
    }

    @Override
    public void alimentarse() {
        System.out.println("Me alimento");
    }

    @Override
    public void masticar() {
        System.out.println("Estoy masticando");
    }
}
