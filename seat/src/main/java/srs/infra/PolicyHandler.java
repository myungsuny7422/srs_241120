package srs.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import srs.config.kafka.KafkaProcessor;
import srs.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    SeatRepository seatRepository;

    @Autowired
    Repository Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReservePlaced'"
    )
    public void wheneverReservePlaced_ReserveSeat(
        @Payload ReservePlaced reservePlaced
    ) {
        ReservePlaced event = reservePlaced;
        System.out.println(
            "\n\n##### listener ReserveSeat : " + reservePlaced + "\n\n"
        );

        // Sample Logic //
        Seat.reserveSeat(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReservReturned'"
    )
    public void wheneverReservReturned_ReturnSeat(
        @Payload ReservReturned reservReturned
    ) {
        ReservReturned event = reservReturned;
        System.out.println(
            "\n\n##### listener ReturnSeat : " + reservReturned + "\n\n"
        );

        // Sample Logic //
        Seat.returnSeat(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReserveCancelled'"
    )
    public void wheneverReserveCancelled_ReturnSeat(
        @Payload ReserveCancelled reserveCancelled
    ) {
        ReserveCancelled event = reserveCancelled;
        System.out.println(
            "\n\n##### listener ReturnSeat : " + reserveCancelled + "\n\n"
        );

        // Sample Logic //
        Seat.returnSeat(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
