package instruments;

public class Saxaphone extends Instrument {

    private int buttons;

    public Saxaphone(String material, String colour, String type, int buttons, int price) {
        super(material, colour, type, price);
        this.buttons = buttons;
    }

    public int getButtons() {
        return buttons;
    }

    public void setButtons(int buttons) {
        this.buttons = buttons;
    }

    public String play(){
        return "Baker Street";
    }


}
