package srs.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import srs.domain.*;

@Component
public class ReserveHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Reserve>> {

    @Override
    public EntityModel<Reserve> process(EntityModel<Reserve> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/returnreserve")
                .withRel("returnreserve")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/cancelreserve")
                .withRel("cancelreserve")
        );

        return model;
    }
}
