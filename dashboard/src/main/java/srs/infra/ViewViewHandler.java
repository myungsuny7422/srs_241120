package srs.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import srs.config.kafka.KafkaProcessor;
import srs.domain.*;

@Service
public class ViewViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private ViewRepository viewRepository;
    //>>> DDD / CQRS
}
