package com.geekster.EmployeeAddress.repository;

import com.geekster.EmployeeAddress.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends CrudRepository<Address, Long> {
}
