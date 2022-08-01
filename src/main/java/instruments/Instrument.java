package instruments;

public abstract class Instrument implements Iplay, ISell{

    private String material;
    private String colour;
    private String type;

    private int price;

    protected Instrument(String material, String colour, String type, int price) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
