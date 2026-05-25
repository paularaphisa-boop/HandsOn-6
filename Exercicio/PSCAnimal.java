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
       
    } 
    
}
