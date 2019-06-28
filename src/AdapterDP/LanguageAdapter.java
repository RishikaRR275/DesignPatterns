package AdapterDP;

public class LanguageAdapter implements Korean {
    private Japanese japanese;
    LanguageAdapter(Japanese japanese){
        this.japanese = japanese;
    }

    public void sayHiInKorean(){
        japanese.sayHiInJapanese();
    }
}
