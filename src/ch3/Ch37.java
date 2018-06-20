package ch3;

import java.util.LinkedList;

public class Ch37 {
    LinkedList<Animal> dogs = new LinkedList<>();
    LinkedList<Animal> cats = new LinkedList<>();

    public void enqueue(Animal animal) {
        if (animal.kind.toUpperCase().equals("DOG")) {
            dogs.add(animal);
        }else {
            cats.add(animal);
        }
    }

    public Animal dequeue() {
        sort(dogs);
        sort(cats);
        if (dogs.peek().age > cats.peek().age) {
            return dogs.pop();
        } else {
            return cats.pop();
        }
    }

    public Animal dequeueDog() {
        sort(dogs);
        return dogs.pop();
    }

    public Animal dequeueCat() {
        sort(cats);
        return cats.pop();
    }

    private void sort (LinkedList<Animal> animals) {
        animals.sort((p1, p2) -> -p1.age.compareTo(p2.age));
    }
}
