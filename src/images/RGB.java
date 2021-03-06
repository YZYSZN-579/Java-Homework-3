package images;

public class RGB {

    //preset colors
    public static final RGB BLACK = new RGB(0);
    public static final RGB WHITE = new RGB(1);
    public static final RGB RED = new RGB(1, 0, 0);
    public static final RGB GREEN = new RGB(0, 1, 0);
    public static final RGB BLUE = new RGB(0, 0, 1);

    private double red;
    private double green;
    private double blue;

    public RGB(double red, double green, double blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public RGB(double grey) {
        red = grey;
        green = grey;
        blue = grey;
    }

    // returns a new color combining two colors, the max value of each base color is 1
    public static RGB superpose(RGB rgb1, RGB rgb2) {
        RGB newColor = new RGB(rgb1.red + rgb2.red
                , rgb1.green + rgb2.green, rgb1.blue + rgb2.blue);

        if (newColor.red > 1) {
            newColor.red = 1;
        }
        if (newColor.green > 1) {
            newColor.green = 1;
        }
        if (newColor.blue > 1) {
            newColor.blue = 1;
        }
        return newColor;
    }

    //returns a color, using a formula
    public static RGB mix(RGB rgb1, RGB rgb2, double alpha) {
        return new RGB((alpha * rgb1.red + (1 - alpha) * rgb2.red),
                (alpha * rgb1.green + (1 - alpha) * rgb2.green),
                (alpha * rgb1.blue + (1 - alpha) * rgb2.blue));
    }

    public double getRed() {
        return red;
    }

    public double getGreen() {
        return green;
    }

    public double getBlue() {
        return blue;
    }

    //returns the inverted color of the given one
    public RGB invert() {
        return new RGB(1 - red, 1 - green, 1 - blue);
    }

    //returns a color using a parameter as a filter
    public RGB filter(RGB filter) {
        return new RGB(red * filter.red, green * filter.green, blue * filter.blue);
    }

    public String toString() {
        return String.format("<%.4f, %.4f, %.4f>", red, green, blue);
    }
}
