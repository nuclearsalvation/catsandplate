import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Plate plate = new Plate(90);
        plate.info();
        ArrayList<Cat> listCats = new ArrayList<>();
        listCats.add(new Cat("Cat 1", 20));
        listCats.add(new Cat("Cat 2" , 30));
        listCats.add(new Cat("Cat 3", 50));
        for(Cat cat: listCats){
            cat.eat(plate);
        }
        for (Cat cat: listCats){
            System.out.println(cat.getHungry());
        }
    }
}
