package srs.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import srs.infra.AbstractEvent;

@Data
public class ResigterPlaced extends AbstractEvent {

    private Integer id;
    private String seatName;
    private Boolean reservedYN;
    private String reservedEmployeeId;
    private Date reservedDT;
}
