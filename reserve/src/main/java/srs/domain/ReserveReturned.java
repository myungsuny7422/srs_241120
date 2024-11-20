package srs.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import srs.domain.*;
import srs.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ReserveReturned extends AbstractEvent {

    private Long id;
    private String employeeId;

    public ReserveReturned(Reserve aggregate) {
        super(aggregate);
    }

    public ReserveReturned() {
        super();
    }
}
//>>> DDD / Domain Event
