package com.mvm.myhoneyapi.repository;

import com.mvm.myhoneyapi.dto.CustomerDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDto, Long> {
    Optional<CustomerDto> findByFirstName(String firstName);
    boolean existsByEmail(String email);
}
