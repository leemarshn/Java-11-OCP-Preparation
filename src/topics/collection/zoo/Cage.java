package topics.collection.zoo;

public class Cage<E extends Animal & Eat> {
    private E animal1;
    private E animal2;

    public Cage(E animal1, E animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public E getAnimal1() {
        return animal1;
    }

    public void setAnimal1(E animal1) {
        this.animal1 = animal1;
    }

    public E getAnimal2() {
        return animal2;
    }

    public static <E extends Animal> boolean isCompatible(E animal1, E animal2){
        return animal1.getType().equals(animal2.getType());
    }

    public void setAnimal2(E animal2) {
        this.animal2 = animal2;
    }

    public void feedAnimal(){
        animal1.eat();
        animal2.eat();
    }
}
