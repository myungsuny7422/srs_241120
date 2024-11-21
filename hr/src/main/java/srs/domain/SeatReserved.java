package srs.domain;

import java.util.*;
import lombok.*;
import srs.domain.*;
import srs.infra.AbstractEvent;

@Data
@ToString
public class SeatReserved extends AbstractEvent {

    private Integer id;
    private String seatName;
    private Boolean reservedYn;
    private String reservedEmployeeId;
    private Date reservedDt;
}
