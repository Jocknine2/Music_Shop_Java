package instruments;

public class Guitar extends Instrument{

    private int strings;

    public Guitar(String material, String colour, String type, int strings, int price) {
        super(material, colour, type, price);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public String play(){
        return "Wonder Wall";
    }


}
