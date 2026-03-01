import br.com.alura.age.model.AgePerson;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        AgePerson personOne = new AgePerson("Janaina", 18);
        AgePerson personTwo = new AgePerson("Osvaldo", 5);
        AgePerson personThree = new AgePerson("Carlito", 60);

        ArrayList<AgePerson> people = new ArrayList<>();

        people.add(personOne);
        people.add(personTwo);
        people.add(personThree);

        for (AgePerson person : people) {
            person.compareAge();
            System.out.println(person);
        }
    }
}