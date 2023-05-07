package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressEmployee {

    @Autowired
    AddressService addressService;

    /*GET /addresses - get all addresses
    GET /addresses/{id} - get an address by id
    POST /addresses - create a new address
    PUT /addresses/{id} - update an address by id
    DELETE /addresses/{id} - delete an address by id*/

    @GetMapping("/")
    public Iterable<Address> getAll(){
        return addressService.getAllAddress();
    }

    @GetMapping("/{id}")
    public Address getById(@PathVariable Long id){
        return addressService.getById(id);
    }

    @PostMapping("/")
    public String postAddressList(@RequestBody List<Address> list){
        return addressService.addList(list);
    }

    @PutMapping("/{id}")
    public String updateById(@PathVariable Long id, @RequestBody Address address){
        return addressService.updateById(id, address);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        addressService.deleteById(id);
    }
}
