
package exercise2;
import java.util.Date;
public class Processor {
    public static void main (String[] args){
        AnimalList animalList = new AnimalList();
        Dog dog = new Dog("1","Hanoi", new Date(),"Brown","Poodle");
        Cat cat = new Cat ("2","Saigon",new Date(),"White");
        animalList.addAnimal(dog);
        animalList.addAnimal(cat);
        animalList.displayALL();
    }
}
