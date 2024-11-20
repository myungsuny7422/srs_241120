package srs.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import srs.ReserveApplication;
import srs.domain.ReservReturned;
import srs.domain.ReserveCancelled;
import srs.domain.ReservePlaced;

@Entity
@Table(name = "Reserve_table")
@Data
//<<< DDD / Aggregate Root
public class Reserve {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long employeeId;

    @PostPersist
    public void onPostPersist() {
        ReservePlaced reservePlaced = new ReservePlaced(this);
        reservePlaced.publishAfterCommit();

        ReservReturned reservReturned = new ReservReturned(this);
        reservReturned.publishAfterCommit();

        ReserveCancelled reserveCancelled = new ReserveCancelled(this);
        reserveCancelled.publishAfterCommit();
    }

    @PreUpdate
    public void onPreUpdate() {}

    public static ReserveRepository repository() {
        ReserveRepository reserveRepository = ReserveApplication.applicationContext.getBean(
            ReserveRepository.class
        );
        return reserveRepository;
    }

    //<<< Clean Arch / Port Method
    public void returnReserve() {
        //implement business logic here:

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void cancelReserve() {
        //implement business logic here:

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
