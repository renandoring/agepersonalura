import br.com.alura.age.model.AgePerson;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //CHAMANDO JSON, IMPRIMINDO MAIS FORMATADO E COM TTO DE UPPER CASE
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        ArrayList<AgePerson> people = new ArrayList<>();

        AgePerson personOne = new AgePerson("Janaina", 18);
        AgePerson personTwo = new AgePerson("Osvaldo", 5);
        AgePerson personThree = new AgePerson("Carlito", 60);

        people.add(personOne);
        people.add(personTwo);
        people.add(personThree);

        for (AgePerson person : people) {
            person.compareAge();
            System.out.println(person);
        }

        try (FileWriter escrita = new FileWriter("people.json")) {
            escrita.write(gson.toJson(people));
            escrita.close();
            System.out.println("People JSON written");
            System.out.println("The size of people is " + people.size());
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo" + e.getMessage());
        }
    }
}