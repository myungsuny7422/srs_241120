package srs.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import srs.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "reserves", path = "reserves")
public interface ReserveRepository
    extends PagingAndSortingRepository<Reserve, Long> {}
