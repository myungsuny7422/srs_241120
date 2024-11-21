package srs.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import srs.SeatApplication;

@Entity
@Table(name = "Seat_table")
@Data
//<<< DDD / Aggregate Root
public class Seat {

    @Id
    private Integer id;

    private String seatName;

    private Boolean reservedYn;

    private String reservedEmployeeId;

    private Date reservedDt;

    public static SeatRepository repository() {
        SeatRepository seatRepository = SeatApplication.applicationContext.getBean(
            SeatRepository.class
        );
        return seatRepository;
    }

    //<<< Clean Arch / Port Method
    public static void reserveSeat(ReservePlaced reservePlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        Seat seat = new Seat();
        repository().save(seat);

        SeatReserved seatReserved = new SeatReserved(seat);
        seatReserved.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(reservePlaced.get???()).ifPresent(seat->{
            
            seat // do something
            repository().save(seat);

            SeatReserved seatReserved = new SeatReserved(seat);
            seatReserved.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void returnSeat(ReservReturned reservReturned) {
        //implement business logic here:

        /** Example 1:  new item 
        Seat seat = new Seat();
        repository().save(seat);

        SeatReturned seatReturned = new SeatReturned(seat);
        seatReturned.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(reservReturned.get???()).ifPresent(seat->{
            
            seat // do something
            repository().save(seat);

            SeatReturned seatReturned = new SeatReturned(seat);
            seatReturned.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void returnSeat(ReserveCancelled reserveCancelled) {
        //implement business logic here:

        /** Example 1:  new item 
        Seat seat = new Seat();
        repository().save(seat);

        SeatReturned seatReturned = new SeatReturned(seat);
        seatReturned.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(reserveCancelled.get???()).ifPresent(seat->{
            
            seat // do something
            repository().save(seat);

            SeatReturned seatReturned = new SeatReturned(seat);
            seatReturned.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
