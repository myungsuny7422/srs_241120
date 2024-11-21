package srs.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import srs.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "seats", path = "seats")
public interface SeatRepository
    extends PagingAndSortingRepository<Seat, Integer> {}
