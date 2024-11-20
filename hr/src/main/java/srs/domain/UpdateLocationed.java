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

    public UpdateLocationed(Hr aggregate) {
        super(aggregate);
    }

    public UpdateLocationed() {
        super();
    }
}
//>>> DDD / Domain Event
