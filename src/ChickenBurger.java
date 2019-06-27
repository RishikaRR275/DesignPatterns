public class ChickenBurger implements Burger{
    String size;
    ChickenBurger(String size){
        this.size = size;
    }
    public void prepareBurger(){
        System.out.println("One "+ size+ " Chicken Burger coming right up!");
    }
}