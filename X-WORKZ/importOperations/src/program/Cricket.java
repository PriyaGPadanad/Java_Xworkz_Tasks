package program;

public class Cricket {
    Ticket ticket;

    public Cricket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void watch() {
        ticket.buy();
        System.out.println("Watching the cricket match!");
    }

    public double profit() {
        return ticket.sell();
    }

}
