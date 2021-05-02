package topics.collection.zoo;

import java.util.Calendar;

public class Zoo {
    public static void main(String[] args) {

        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();

        Cage.isCompatible(monkey1, monkey2);

    }



   // Cage<Monkey> cage = new Cage<>(new Monkey(), new Monkey());

}
