package program;

public class
Ticket {
    TicketType type;
    double cost;

    public Ticket(TicketType type, double cost) {
        this.type = type;
        this.cost = cost;
    }


    public void buy() {
        System.out.println("Buying a " + type + " ticket for $" + cost);
    }

    public double sell() {
        System.out.println("Selling a " + type + " ticket for $" + (cost * 1.2));
        return cost*1.2;
    }

}
