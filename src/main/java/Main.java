public class Main {
    public static void main(String[] args) {

Zoo<Animal> zoo = new Zoo<>();
zoo.addAnimal(new Lion("Lion",10));
zoo.addAnimal(new Tiger("Tiger",14));

       zoo.printAllAnimals();

    }
}
