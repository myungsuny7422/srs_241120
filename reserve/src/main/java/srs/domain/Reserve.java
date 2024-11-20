package srs.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import srs.ReserveApplication;
import srs.domain.ReserveCancelled;
import srs.domain.ReservePlaced;
import srs.domain.ReserveReturned;

@Entity
@Table(name = "Reserve_table")
@Data
//<<< DDD / Aggregate Root
public class Reserve {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String employeeId;

    @PostPersist
    public void onPostPersist() {
        ReservePlaced reservePlaced = new ReservePlaced(this);
        reservePlaced.publishAfterCommit();

        ReserveReturned reserveReturned = new ReserveReturned(this);
        reserveReturned.publishAfterCommit();

        ReserveCancelled reserveCancelled = new ReserveCancelled(this);
        reserveCancelled.publishAfterCommit();
    }

    public static ReserveRepository repository() {
        ReserveRepository reserveRepository = ReserveApplication.applicationContext.getBean(
            ReserveRepository.class
        );
        return reserveRepository;
    }
}
//>>> DDD / Aggregate Root
