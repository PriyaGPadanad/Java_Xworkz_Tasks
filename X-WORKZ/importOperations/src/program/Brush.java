package program;

public class Brush {
    BrushColor color;

    public Brush(BrushColor color) {
        this.color = color;
    }

    public void clean() {
        System.out.println("Cleaning with a " + color + " brush.");
    }

    public void scrub() {
        System.out.println("Scrubbing with a " + color + " brush.");
    }
}
