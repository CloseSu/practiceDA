package ch3;

import org.junit.jupiter.api.Test;

public class Test37 {

    @Test
    public void testDog() {
        Ch37 ch37 = new Ch37();
        ch37.enqueue(new Animal("dog", 7));
        ch37.enqueue(new Animal("dog", 8));
        ch37.enqueue(new Animal("dog", 1));
        ch37.enqueue(new Animal("dog", 4));
        ch37.enqueue(new Animal("dog", 2));

        Animal a1 = ch37.dequeueDog();
        System.out.println(a1.kind + " " + a1.age);
    }

    @Test
    public void testCat() {
        Ch37 ch37 = new Ch37();
        ch37.enqueue(new Animal("cat", 5));
        ch37.enqueue(new Animal("cat", 7));
        ch37.enqueue(new Animal("cat", 3));
        ch37.enqueue(new Animal("cat", 1));
        ch37.enqueue(new Animal("cat", 9));

        Animal a1 = ch37.dequeueCat();
        System.out.println(a1.kind + " " + a1.age);

    }

    @Test
    public void testAll() {
        Ch37 ch37 = new Ch37();
        ch37.enqueue(new Animal("dog", 7));
        ch37.enqueue(new Animal("dog", 8));
        ch37.enqueue(new Animal("dog", 1));
        ch37.enqueue(new Animal("dog", 4));
        ch37.enqueue(new Animal("dog", 2));
        ch37.enqueue(new Animal("cat", 5));
        ch37.enqueue(new Animal("cat", 7));
        ch37.enqueue(new Animal("cat", 3));
        ch37.enqueue(new Animal("cat", 1));
        ch37.enqueue(new Animal("cat", 9));

        Animal a1 = ch37.dequeue();
        System.out.println(a1.kind + " " + a1.age);
        a1 = ch37.dequeue();
        System.out.println(a1.kind + " " + a1.age);
    }
}
