package program;

public class Virat {
    Brush brush;
    Clip clip;
    Ticket ticket;
    Cricket cricket;

    public Virat(Brush brush, Clip clip, Ticket ticket, Cricket cricket) {
        this.brush = brush;
        this.clip = clip;
        this.ticket = ticket;
        this.cricket = cricket;
    }

    public void play() {
        cricket.watch();
    }

    public void clean() {
        brush.clean();
        brush.scrub();
    }

    public void relax() {
        ticket.buy();
        System.out.println("Relaxing after the match!");
    }

    public void holdClip(){
        clip.hold();
    }
}
