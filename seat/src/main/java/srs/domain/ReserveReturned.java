package srs.domain;

import java.util.*;
import lombok.*;
import srs.domain.*;
import srs.infra.AbstractEvent;

@Data
@ToString
public class ReserveReturned extends AbstractEvent {

    private Long id;
}
