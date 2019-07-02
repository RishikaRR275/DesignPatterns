package observerDP;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Marks marks = new Marks();

        new PercentageObserver(marks);
        new GpaObserver(marks);

        System.out.println("Marks = 85");
        marks.setState(85);
    }

}
