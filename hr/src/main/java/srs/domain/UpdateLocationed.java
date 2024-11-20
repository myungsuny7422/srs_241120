package srs.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import srs.domain.*;
import srs.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class UpdateLocationed extends AbstractEvent {

    private Long id;
    private Integer employeeId;
    private Integer locationId;
    private String locationName;

    public UpdateLocationed(Hr aggregate) {
        super(aggregate);
    }

    public UpdateLocationed() {
        super();
    }
}
//>>> DDD / Domain Event
