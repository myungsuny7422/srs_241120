package srs.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import srs.domain.*;

@Component
public class HrHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Hr>> {

    @Override
    public EntityModel<Hr> process(EntityModel<Hr> model) {
        return model;
    }
}
