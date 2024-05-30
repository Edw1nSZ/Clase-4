import animales.Animal;
import animales.Gato;
import animales.Perro;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal gatoUno = new Gato(13,"Miaus");
        Animal PerroUno = new Perro(5,"Guaus");

        //**lista de animales
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(gatoUno);
        animales.add(PerroUno);
        //for para los animales que mostrarn el mensaje de los que estan comiendo
        for(Animal a : animales){
            System.out.println(a.getNombre());
            a.comer(2);
            a.comer();
        }




    }
}