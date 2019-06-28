import java.util.*;

public class OrderBurger{
    public static void main(String[] args){
        BurgerFactory burgerFactory = new BurgerFactory();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select your burger : ");
        String burgerType = sc.nextLine();

        System.out.println("Please select the size :");
        String size = sc.next();

        Burger burger1 = burgerFactory.getBurger(burgerType,size);
        burger1.prepareBurger();
    }
}
