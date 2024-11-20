package srs.domain;

import java.util.*;
import lombok.*;
import srs.domain.*;
import srs.infra.AbstractEvent;

@Data
@ToString
public class SeatReturned extends AbstractEvent {

    private Long id;
    private String seatName;
    private Boolean reservedYn;
    private Integer reservedEmployeeId;
    private Date reservedDt;
}
