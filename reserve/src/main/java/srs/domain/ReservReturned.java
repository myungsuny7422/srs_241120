package srs.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import srs.domain.*;
import srs.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ReservReturned extends AbstractEvent {

    private Long id;
    private String employeeId;
    private Integer seatId;

    public ReservReturned(Reserve aggregate) {
        super(aggregate);
    }

    public ReservReturned() {
        super();
    }
}
//>>> DDD / Domain Event
