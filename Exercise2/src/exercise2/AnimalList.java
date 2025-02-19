
package exercise2;
import java.util.ArrayList;
public class AnimalList {
    ArrayList<Animal> animals = new ArrayList<>();
        public void addAnimal(Animal animal){
            animals.add(animal);
          
        }
        public void displayALL(){
            for(Animal animal : animals){
           System.out.print("ID:"+animal.id);
           System.out.print("Source:"+animal.source);
           System.out.print("Date of birth:"+animal.dateOfBirth);
           System.out.print("color:"+animal.color);
           animal.makeSound();
           System.out.print("--");
        }            
        }
    }
            

