package factoryDP;

public class BurgerFactory{
    public Burger getBurger(String burgerType,String burgerSize){
        if(burgerType == null)
            return null;

        burgerType = burgerType.toLowerCase();
        switch(burgerType){
            case "chicken burger":
                return new ChickenBurger(burgerSize);
            case "aloo tikka":
                return new AlooTikka(burgerSize);
            case "cottage cheese burger":
                return new CottageCheeseBurger(burgerSize);
        }
        return null;
    }
}