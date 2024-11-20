package srs.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import srs.domain.*;
import srs.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SeatReturned extends AbstractEvent {

    private Long id;
    private String seatName;
    private Boolean reservedYn;
    private Integer reservedEmployeeId;
    private Date reservedDt;

    public SeatReturned(Seat aggregate) {
        super(aggregate);
    }

    public SeatReturned() {
        super();
    }
}
//>>> DDD / Domain Event
