package Exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {

        ArrayList<Person> people = new ArrayList<>();

        void addPerson(Person person) {
            people.add(person);
        }

        boolean deletePersonById(String id) {
            for (Person person : people) {
                if (person.id.equals(id)) {
                    people.remove(person);
                    return true;
                }
            }
            return false;
        }

        boolean editPersonById(String id) {
            for (Person person : people) {
                if (person.id.equals(id)) {
                    return person.editPerson();
                }
            }
            return false;
        }

        void displayAll() {
            people.forEach((person) -> {
                person.displayInfo();
            }
            );
        }
    }

