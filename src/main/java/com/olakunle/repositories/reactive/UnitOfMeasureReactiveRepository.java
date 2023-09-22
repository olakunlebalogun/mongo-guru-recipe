package com.olakunle.repositories.reactive;

import com.olakunle.domains.UnitOfMeasure;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface UnitOfMeasureReactiveRepository extends ReactiveMongoRepository<UnitOfMeasure,String> {

}
