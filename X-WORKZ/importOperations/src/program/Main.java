package program;

public class Main {
    public static void main(String[] args) {

        Clip clip1 = new Clip(Color.RED);
        Clip clip2 = new Clip(Color.BLUE);
        Clip clip3 = new Clip(Color.GREEN);
        Clip clip4 = new Clip(Color.YELLOW);
        Clip clip5 = new Clip(Color.PURPLE);

        Clip[] clips = {clip1, clip2, clip3, clip4, clip5};

        Pushpa pushpa = new Pushpa();
        pushpa.useClip(clips);

        Ticket ticket = new Ticket(TicketType.PREMIUM, 100.0);
        Cricket cricket = new Cricket(ticket);

        Brush brush = new Brush(BrushColor.WHITE);

        Virat virat = new Virat(brush, clip1, ticket, cricket);
        virat.play();
        virat.clean();
        virat.relax();
        virat.holdClip();
    }
}
