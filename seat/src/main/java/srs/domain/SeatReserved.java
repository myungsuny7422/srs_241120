package srs.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import srs.domain.*;
import srs.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SeatReserved extends AbstractEvent {

    private Long id;

    public SeatReserved(Seat aggregate) {
        super(aggregate);
    }

    public SeatReserved() {
        super();
    }
}
//>>> DDD / Domain Event
