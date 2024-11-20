package srs.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import srs.domain.*;
import srs.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ResigterPlaced extends AbstractEvent {

    private Long id;
    private String seatName;
    private Boolean reservedYn;
    private Integer reservedEmployeeId;
    private Date reservedDt;

    public ResigterPlaced(Seat aggregate) {
        super(aggregate);
    }

    public ResigterPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
