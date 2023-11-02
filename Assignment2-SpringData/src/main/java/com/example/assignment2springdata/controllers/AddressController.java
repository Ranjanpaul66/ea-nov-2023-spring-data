package com.example.assignment2springdata.controllers;

import com.example.assignment2springdata.models.Address;
import com.example.assignment2springdata.models.User;
import com.example.assignment2springdata.services.AddressService;
import com.example.assignment2springdata.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/address")
public class AddressController {
    private final AddressService addressService;

    @PostMapping
    public void saveAddress(@RequestBody Address address){
        addressService.create(address);
    }

    @PutMapping
    public void updateAddress(@RequestBody Address address){
        addressService.update(address);
    }

    @GetMapping("/{id}")
    public Address getAddress(@PathVariable Long id){
        return addressService.getAddress(id);
    }


    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Long id){
        addressService.delete(id);
        return;
    }
}