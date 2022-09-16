package com.comprehensive.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comprehensive.assessment.entity.DoctorClass;

public interface DoctorRepository extends JpaRepository<DoctorClass, Integer> {

    DoctorClass findById(int id);

}
