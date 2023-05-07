package com.geekster.EmployeeAddress.service;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AddressService {

    @Autowired
    IAddressRepository addressRepository;

    public Iterable<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    public Address getById(Long id) {
        return addressRepository.findById(id).get();
    }

    public String addList(List<Address> list) {
        addressRepository.saveAll(list);
        return "Address List Added";
    }

    public String updateById(Long id, Address address) {
        addressRepository.save(address);
    }

    public void deleteById(Long id) {
        addressRepository.deleteById(id);
    }
}
