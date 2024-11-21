package srs.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import srs.domain.*;
import srs.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ReserveCancelled extends AbstractEvent {

    private Long id;
    private String employeeId;
    private Integer seatId;

    public ReserveCancelled(Reserve aggregate) {
        super(aggregate);
    }

    public ReserveCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
