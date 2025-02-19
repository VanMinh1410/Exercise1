
package exercise2;
import java.util.Date;
public class Dog extends Animal {
    String breed;
    public Dog (String id,String source,Date dateOfBirth, String color,String breed){
        super (id,source,dateOfBirth,color);
        this.breed = breed;
    }
    @Override
    public void makeSound(){
        System.out.print("Woof!");
    }
}
