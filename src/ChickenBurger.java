public class ChickenBurger implements Burger{
    private String size;
    ChickenBurger(String size){
        this.size = size;
    }
    public void prepareBurgers(){
        System.out.println("One "+ size+ " Chicken Burger coming right up!!!");
    }
}