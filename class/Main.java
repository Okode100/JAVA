
import java.time.Year;

class car {
    String brand;
    String color;
    int year;

    car(String brand,String color,int year){
        this.brand = brand;
        this.color = color;
        this.year = year;
        
    }
}
public class Main {
    void display() {
        car mycar = new car("BMW", "BLACK",Year.now().getValue());
        System.out.println("This car is a"+mycar.brand +", the color is"+ mycar.color+ ", it was manufactured in the year" +mycar.year);
    }
    public static void main(String[] arg){
        Main main = new Main();
        main.display();
    }
}

    
    
    
