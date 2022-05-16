//Created by Khanh Nguyen Van

package J04002;

public class HCN {
    private double width, height;
    private String color;

    public HCN() {

    }

    private String createdColor(String color) {
        String tmp = "";
        tmp += color.toUpperCase().charAt(1);
        for (int i = 2; i < color.length(); i++) tmp += color.toLowerCase().charAt(i);
        return tmp;
    }

    public void Rectange() {
        this.width = 1;
        this.height = 1;
    }

    public void Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = createdColor(color);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return width * height;
    }

    public double findPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        if (width - (int) width != 0 || height - (int) height != 0 || width <= 0 || height <= 0) return "INVALID";
        return String.format("%.0f", findPerimeter()) + " " + String.format("%.0f", findArea()) + " " + color;
    }
}
