import com.zoo.Zoo;
import com.zoo.bird.Owl;
import com.zoo.fish.Catfish;

public class Main {

    public static void main(String[] args) {
        Zoo owl = new Owl();
        System.out.println(owl.ShowInformation());

        Zoo catfish = new Catfish();
        System.out.println(catfish.ShowInformation());

    }
}
