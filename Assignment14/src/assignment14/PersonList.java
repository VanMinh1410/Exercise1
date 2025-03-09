package assignment14;

import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void updatePerson(String id) {
        for (Person p : personList) {
            if (p.getId().equals(id)) {
                p.updatePerson(id);
                return;
            }
        }
        System.out.println("Person not found.");
    }

    public void deletePersonById(String id) {
        personList.removeIf(p -> p.getId().equals(id));
    }

    public Person findPersonById(String id) {
        return personList.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public void displayEveryone() {
        for (Person p : personList) {
            p.displayInfo();
        }
    }
}
