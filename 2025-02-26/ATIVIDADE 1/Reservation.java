import java.util.Date;
import java.text.SimpleDateFormat;


public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        if (checkout.before(checkin) || checkout.equals(checkin)) {
            throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int duration() {
        long diff = checkout.getTime() - checkin.getTime();
        return (int) (diff / (24 * 60 * 60 * 1000));
    }

    public void updateDates(Date newCheckin, Date newCheckout) {
        Date hoje = new Date();
        if (newCheckin.before(hoje)) {
            throw new IllegalArgumentException("Error in reservation: Reservation dates for update must be future dates");
        }
        if (newCheckout.before(newCheckin) || newCheckout.equals(newCheckin)) {
            throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date");
        }
        this.checkin = newCheckin;
        this.checkout = newCheckout;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Reservation: Room " + roomNumber
                + ", check-in: " + sdf.format(checkin)
                + ", check-out: " + sdf.format(checkout)
                + ", " + duration() + " nights";
    }
}