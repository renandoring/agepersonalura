import br.com.alura.age.model.AgePerson;

public class Main {
    public static void main(String[] args) {

        AgePerson personOne = new AgePerson();
        personOne.setName("Teste Nome");
        personOne.setAge(personOne.getAge());

        personOne.compareAge();
        personOne.specifications();
    }
}