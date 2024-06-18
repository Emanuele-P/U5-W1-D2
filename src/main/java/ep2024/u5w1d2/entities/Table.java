package ep2024.u5w1d2.entities;

import ep2024.u5w1d2.enums.ReservationStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Table {
    private int number;
    private int covers;
    private ReservationStatus reservation;

    @Override
    public String toString() {
        return "Table: " + number + ", " + covers + " covers, Status: " + reservation;
    }
}
