import java.lang.reflect.Array;
import java.util.ArrayList;

public class PSCAnimal {

    public static void main(String[] args) {
        Animal a = new Animal ("Pitoco", 1);
        Cachorro c = new Cachorro ("Belinha", 2);
        Gato g = new Gato ("Lasanha", 8);
         
        System.out.println("Animal");
        System.out.println(a.toString());
        System.out.println(a.emitirSom());


        System.out.println("Cachorro");
        System.out.println(c.toString());
        System.out.println(c.emitirSom());

        System.out.println("Gato");
        System.out.println(g.toString());
        System.out.println(g.emitirSom());
       
        ArrayList<Animal> animais = new ArrayList();

        animais.add(a);
        animais.add(c);
        animais.add(g);
        System.out.println(animais);

        for (Animal an : animais) {
            if (an instanceof Cachorro) {
                System.out.println("É um cachorro.\n" + an.emitirSom());
            } else if (an instanceof Gato) {
                System.out.println("É um gato.\n" + an.emitirSom());
            } else {
                System.out.println("É um animal genérico.\n" + an.emitirSom());
            }
        }


    } 
    
}
