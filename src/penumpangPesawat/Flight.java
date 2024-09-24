package penumpangPesawat;

public class Flight {
    private Passenger head;

    public Flight() {
        this.head = null;
    }

    public void addPassenger(String name) {
        Passenger newPassenger = new Passenger(name);
        if (head == null) {
            head = newPassenger;
        } else {
            Passenger current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPassenger;
        }
    }

    public void removePassenger(String name) {
        if (head == null) return;


        if (head.name.equals(name)) {
            head = head.next;
            return;
        }

        Passenger current = head;
        while (current.next != null) {
            if (current.next.name.equals(name)) {
                current.next = current.next.next; // Bypass the removed passenger
                return;
            }
            current = current.next;
        }
    }

    public void displayPassengers() {
        if (head == null) {
            System.out.println("No passengers.");
            return;
        }

        Passenger current = head;
        while (current != null) {
            System.out.println(current.name);
            current = current.next;
        }
    }
}
