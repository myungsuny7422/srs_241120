package srs.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import srs.domain.*;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/reserves")
@Transactional
public class ReserveController {

    @Autowired
    ReserveRepository reserveRepository;

    @RequestMapping(
        value = "/reserves/{id}/returnreserve",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Reserve returnReserve(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /reserve/returnReserve  called #####");
        Optional<Reserve> optionalReserve = reserveRepository.findById(id);

        optionalReserve.orElseThrow(() -> new Exception("No Entity Found"));
        Reserve reserve = optionalReserve.get();
        reserve.returnReserve();

        reserveRepository.save(reserve);
        return reserve;
    }

    @RequestMapping(
        value = "/reserves/{id}/cancelreserve",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Reserve cancelReserve(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /reserve/cancelReserve  called #####");
        Optional<Reserve> optionalReserve = reserveRepository.findById(id);

        optionalReserve.orElseThrow(() -> new Exception("No Entity Found"));
        Reserve reserve = optionalReserve.get();
        reserve.cancelReserve();

        reserveRepository.save(reserve);
        return reserve;
    }
}
//>>> Clean Arch / Inbound Adaptor
