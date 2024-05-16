package LinkedList.TheGreatestDate;
import java.time.LocalDate;


public class Node {
    LocalDate data;
    Node next;

    public Node(int date, int month, int year){
        this.data = LocalDate.of(year, month, date);
        this.next = null;
    }

    @Override
    public String toString() {
        return String.format("%d %d %d", this.data.getDayOfMonth(), this.data.getMonth().getValue(), this.data.getYear());
    }
}
