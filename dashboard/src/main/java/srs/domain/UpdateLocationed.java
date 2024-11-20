package srs.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import srs.infra.AbstractEvent;

@Data
public class UpdateLocationed extends AbstractEvent {

    private Long id;
    private Integer employeeId;
    private Integer locationId;
    private String locationName;
}
