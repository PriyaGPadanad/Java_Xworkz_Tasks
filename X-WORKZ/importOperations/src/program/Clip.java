package program;


public class Clip {
    Color color;

    public Clip(Color color) {
        this.color = color;
    }

    public void hold() {
        System.out.println("Holding a " + color + " clip.");
    }

}
