package com.comprehensive.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.comprehensive.assessment.entity.DoctorClass;
import com.comprehensive.assessment.service.DoctorService;

@RestController
public class DoctorController {
    @Autowired
    private DoctorService service;



    @GetMapping("/DoctorGet")
    public List<DoctorClass> getDoctor(){
        return service.getAllDoctor();
    }

    @GetMapping("/DoctorGet/{field}")
    public List<DoctorClass> getAllDoctorByDescendingOrder(@PathVariable String field){
        return service.getAllDoctorByDescendingOrder(field);
    }
    @GetMapping("/DoctorGetDescBySal")
    public List<DoctorClass> getAllDoctorByDescendingOrderBySalary(){
        return service.getAllDoctorByDescendingOrderBySalary();
    }

    @PostMapping("/DoctorPost")
    public DoctorClass saveDoctor(@RequestBody DoctorClass Doctor) throws Exception {
        return service.addDoctor(Doctor);
    }

    @PutMapping("/DoctorPut")
    public DoctorClass editDoctor(@RequestBody DoctorClass Doctor)
    {
        return service.editDoctor(Doctor);
    }

    @PutMapping("/Doctor/{id}/{salary}")
    public DoctorClass updatedDoctor(@PathVariable int salary, @PathVariable int id, @RequestBody DoctorClass Doctor) {
        return service.updateDoctor(Doctor, id);
    }
    @DeleteMapping("/DoctorDel/{id}")
    public String deleteDoctor(@PathVariable int id) {
        return service.deleteDoctor(id);
    }

}
