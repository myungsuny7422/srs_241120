package srs.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import srs.HrApplication;

@Entity
@Table(name = "Hr_table")
@Data
//<<< DDD / Aggregate Root
public class Hr {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer employeeId;

    private Integer locationId;

    private String locationName;

    public static HrRepository repository() {
        HrRepository hrRepository = HrApplication.applicationContext.getBean(
            HrRepository.class
        );
        return hrRepository;
    }

    //<<< Clean Arch / Port Method
    public static void updateLocation(SeatReserved seatReserved) {
        //implement business logic here:

        /** Example 1:  new item 
        Hr hr = new Hr();
        repository().save(hr);

        */

        /** Example 2:  finding and process
        
        repository().findById(seatReserved.get???()).ifPresent(hr->{
            
            hr // do something
            repository().save(hr);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateLocation(SeatReturned seatReturned) {
        //implement business logic here:

        /** Example 1:  new item 
        Hr hr = new Hr();
        repository().save(hr);

        */

        /** Example 2:  finding and process
        
        repository().findById(seatReturned.get???()).ifPresent(hr->{
            
            hr // do something
            repository().save(hr);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
