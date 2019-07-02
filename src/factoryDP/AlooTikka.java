package factoryDP;

public class AlooTikka implements Burger{
    private String size;
    AlooTikka(String size){
        this.size = size;
    }
    public void prepareBurgers(){
        System.out.println("One "+ size+ " Aloo Tikka coming right up!!!");
    }
}