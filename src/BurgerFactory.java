public class BurgerFactory{
    public Burger getBurger(String burgerType,String size){
        if(burgerType == null)
            return null;

        burgerType = burgerType.toLowerCase();
        switch(burgerType){
            case "chicken burger":
                return new ChickenBurger(size);
            case "aloo tikka":
                return new AlooTikka(size);
            case "cottage cheese burger":
                return new CottageCheeseBurger(size);
        }
        return null;
    }
}