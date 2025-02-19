
package exercise2;
import java.util.Date;
public class Cat extends Animal {
    String color;
    public Cat(String id,String source, Date dateOfBirth,String color){
        super (id,source,dateOfBirth,color);
        this.color = color; 
        }
    @Override
        public void makeSound(){
          System.out.print("Meos");
    }
}
