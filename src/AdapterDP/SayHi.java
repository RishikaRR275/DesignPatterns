package AdapterDP;

public class SayHi {
    public static void main(String[] args) {
        JapanesePerson japanesePerson = new JapanesePerson();
        Korean koreanPerson = new KoreanPerson();
        Korean languageAdapter = new LanguageAdapter(japanesePerson);

        System.out.println("Japanese Person says...");
        japanesePerson.sayHiInJapanese();

        System.out.println("Korean Person says...");
        koreanPerson.sayHiInKorean();

        System.out.println("Language Adapter...");
        languageAdapter.sayHiInKorean();
    }


}
