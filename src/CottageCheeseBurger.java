public class CottageCheeseBurger implements Burger{
    private String size;
    CottageCheeseBurger(String size){
        this.size = size;
    }
    public void prepareBurger(){
        System.out.println("One "+ size+ " Cottage Cheese Burger coming right up!");
    }
}
