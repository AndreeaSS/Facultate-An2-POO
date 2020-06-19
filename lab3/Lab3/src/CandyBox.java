import java.util.Objects;

public class CandyBox {

    private String flavor;
    private String origin;

    public CandyBox() {

    }

    public CandyBox(String flavour, String origin) {
        this.flavor = flavour;
        this.origin = origin;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "The " + origin + " " + flavor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CandyBox)) return false;
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(getFlavor(), candyBox.getFlavor()) &&
                Objects.equals(getOrigin(), candyBox.getOrigin());
    }
}

class Lindt extends CandyBox {

    float length, width, height;

    public Lindt() {
        super();
    }

    public Lindt(String flavour, String origin, float length, float width, float height) {
        super(flavour, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getVolume() {
        return this.length * this.width * this.height;
    }

    @Override
    public String toString() {
        return super.toString() + " has volume " + this.getVolume();
    }

    public void printLindtDim() {
        System.out.println("Lindt dimension is " + length
                + " length" + ", " + width + " width " + "and " + height + " height");
    }
}

class Bavarelli extends CandyBox {

    float radius, height;

    public Bavarelli() {
        super();
    }

    public Bavarelli(String flavour, String origin, float radius, float height) {
        super(flavour, origin);
        this.radius = radius;
        this.height = height;
    }

    public float getVolume() {
        return this.radius * this.height;
    }

    @Override
    public String toString() {
        return super.toString() + " has volume " + this.getVolume();
    }

    public void printBavarelliDim() {
        System.out.println("Bavarelly dimension is " + radius
                + " radius " + "and " + height + " height");
    }

}

class ChocAmor extends CandyBox {

    float length;

    public ChocAmor() {
        super();
    }

    public ChocAmor(String flavour, String origin, float length) {
        super(flavour, origin);
        this.length = length;
    }

    public float getVolume() {
        return this.length * this.length;
    }

    @Override
    public String toString() {
        return super.toString() + " has volume " + this.getVolume();
    }

    public void printChocAmorDim() {
        System.out.println("ChocAmor dimension is " + length + " length ");
    }

}
