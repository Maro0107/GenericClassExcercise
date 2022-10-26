import java.util.ArrayList;
import java.util.Iterator;

public class Zoo<T extends Animal> {
    private ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(T animal){
        animals.add(animal);
    }

    public void printAllAnimals(){
        Iterator<Animal> iter = animals.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
