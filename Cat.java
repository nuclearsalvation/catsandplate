public class Cat {
    private String name;
    private int appetite;
    private boolean notHungry = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean getHungry(){
        return notHungry;
    }
    public void setHungry(boolean notHungry){
        this.notHungry = notHungry;
    }
    public int getAppetite(){
        return appetite;
    }
    public void setAppetite(int appetite){
        this.appetite = appetite;
    }
    public void eat(Plate plate) {
        if (appetite <= plate.getFood() && notHungry == false){
            plate.setFood(plate.getFood() - appetite);
            notHungry = true;
        } 

    }
    public void info(){
        System.out.println("Cat " + name + "appetite: " + appetite + "Is not hungry: " + notHungry);
    }
}