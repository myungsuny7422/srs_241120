package srs.domain;

import java.util.*;
import lombok.*;
import srs.domain.*;
import srs.infra.AbstractEvent;

@Data
@ToString
public class SeatReserved extends AbstractEvent {

    private Long id;
}
