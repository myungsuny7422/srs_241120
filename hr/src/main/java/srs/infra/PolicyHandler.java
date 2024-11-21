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
    HrRepository hrRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='SeatReturned'"
    )
    public void wheneverSeatReturned_UpdateLocation(
        @Payload SeatReturned seatReturned
    ) {
        SeatReturned event = seatReturned;
        System.out.println(
            "\n\n##### listener UpdateLocation : " + seatReturned + "\n\n"
        );

        // Sample Logic //
        Hr.updateLocation(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='SeatReserved'"
    )
    public void wheneverSeatReserved_UpdateLocation(
        @Payload SeatReserved seatReserved
    ) {
        SeatReserved event = seatReserved;
        System.out.println(
            "\n\n##### listener UpdateLocation : " + seatReserved + "\n\n"
        );

        // Sample Logic //
        Hr.updateLocation(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
