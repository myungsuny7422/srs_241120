package srs.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import srs.ReserveApplication;

@Entity
@Table(name = "Reserve_table")
@Data
//<<< DDD / Aggregate Root
public class Reserve {

    @Id
    private Integer id;

    private String employeeId;

    private Integer seatId;

    public static ReserveRepository repository() {
        ReserveRepository reserveRepository = ReserveApplication.applicationContext.getBean(
            ReserveRepository.class
        );
        return reserveRepository;
    }
}
//>>> DDD / Aggregate Root
