package com.progress_soft.clustered_data_warehouse.repos;

import com.progress_soft.clustered_data_warehouse.entities.Deal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DealRepo extends MongoRepository<Deal, Long> {
}
