package srs.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import srs.domain.*;
import srs.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ReservePlaced extends AbstractEvent {

    private Long id;
    private String employeeId;
    private Integer seatId;

    public ReservePlaced(Reserve aggregate) {
        super(aggregate);
    }

    public ReservePlaced() {
        super();
    }
}
//>>> DDD / Domain Event
