package zad2;


public class Lipstick {
    private String brand;
    private float volume = 5.0f;
    private int length = 10;
    private String type = "liquid";
    private String color;
    private boolean recycled = false;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean getRecycled() {
        return recycled;
    }

    public void setRecycled(boolean recycled) {
        this.recycled = recycled;
    }

    public Lipstick(String brand) {
        this.setBrand(brand);

    }

    public Lipstick(String brand, String color, String type, float volume) {
        this(brand);
        this.setColor(color);
        this.setType(type);
        this.setVolume(volume);
    }

    public Lipstick(String brand, String color, String type, float volume, int length, boolean recycled) {
        this(brand, color, type, volume);
        this.setLength(length);
        this.setRecycled(recycled);

    }

    @Override
    public String toString() {
        return "Lipstick{" +
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                ", length=" + length +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", recycled=" + recycled +
                '}';
    }
}
