package lab2;

public class boxVolume {
    private double volume;
    private double width;
    private double height;
    private double length;

    public boxVolume(double volume, double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void Volume(double width, double height, double length) {
        volume = width * height * length;
    }
    public double getVolume() {
        return volume;
    }
}
