package singletonDP;

// Bill Pugh Singleton Implementation

public class Singleton
{

    private Singleton()
    {
        System.out.println("This is an instance of Singleton");
    }

    // Inner class to provide instance of class
    private static class BillPughSingleton
    {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance()
    {
        return BillPughSingleton.INSTANCE;
    }
}
