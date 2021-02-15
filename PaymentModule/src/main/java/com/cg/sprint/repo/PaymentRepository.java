package com.cg.sprint.repo;

import org.springframework.data.repository.CrudRepository;

import com.cg.sprint.domain.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
