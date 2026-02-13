import javax.swing.*;
import java.awt.*;

// ---------- Interfaces ----------

interface Printable {
    String printDetails();
}

interface Compatible {
    boolean isCompatible(Object obj);
}

interface Drawable {
    void draw(Graphics g);
}

// ---------- Rectangle Class ----------

class RectangleShape implements Printable, Compatible, Drawable {

    private int x, y, width, height;

    RectangleShape(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public String printDetails() {
        return "Rectangle → Width: " + width +
               ", Height: " + height +
               ", Area: " + (width * height);
    }

    public boolean isCompatible(Object obj) {
        if (obj instanceof RectangleShape) {
            RectangleShape r = (RectangleShape) obj;
            return this.width == r.width &&
                   this.height == r.height;
        }
        return false;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawRect(x, y, width, height);
    }
}

// ---------- Sphere Class (Drawn as Circle) ----------

class Sphere implements Printable, Compatible, Drawable {

    private int x, y, radius;

    Sphere(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public String printDetails() {
        double volume = (4.0 / 3) * Math.PI * radius * radius * radius;
        return "Sphere → Radius: " + radius +
               ", Volume: " + volume;
    }

    public boolean isCompatible(Object obj) {
        if (obj instanceof Sphere) {
            Sphere s = (Sphere) obj;
            return this.radius == s.radius;
        }
        return false;
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.drawOval(x, y, radius * 2, radius * 2);
    }
}

// ---------- Drawing Panel ----------

class DrawingPanel extends JPanel {

    private RectangleShape rectangle;
    private Sphere sphere;

    DrawingPanel() {
        rectangle = new RectangleShape(50, 60, 150, 100);
        sphere = new Sphere(250, 60, 70);

        // Print details to console
        System.out.println(rectangle.printDetails());
        System.out.println(sphere.printDetails());
        System.out.println("Rectangle compatible with itself? " +
                rectangle.isCompatible(rectangle));
        System.out.println("Sphere compatible with new Sphere(70)? " +
                sphere.isCompatible(new Sphere(0, 0, 70)));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        rectangle.draw(g);
        sphere.draw(g);
    }
}

// ---------- Main Frame ----------

public class Test extends JFrame {

    Test() {
        setTitle("Swing + AWT Shapes");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new DrawingPanel());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ShapeDemo().setVisible(true);
        });
    }
}
