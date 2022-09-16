package com.comprehensive.assessment.service;

import java.util.Comparator;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.comprehensive.assessment.controller.ErrorMessages;
import com.comprehensive.assessment.entity.DoctorClass;
import com.comprehensive.assessment.repository.DoctorRepository;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repository;

    // to add the Doctor
    public DoctorClass addDoctor(@NotNull DoctorClass Doctor) throws Exception {
        DoctorClass addDoctor = repository.findById(Doctor.getId());

        if(addDoctor != null){
            throw new doctorServiceException
                    (ErrorMessages.Doctor_already_exists_in_the_database.getErrorMessages());
        }
           return repository.save(Doctor);
    }



    // to get all the Doctor
    public List<DoctorClass> getAllDoctor() {
        return repository.findAll();
    }

    // to get the element based on Descending order
    public List<DoctorClass> getAllDoctorByDescendingOrder(String field) {
        return repository.findAll(Sort.by(Sort.Direction.DESC,field));
    }
   public List<DoctorClass> getAllDoctorByDescendingOrderBySalary(){
       List<DoctorClass> list = repository.findAll();
       list.sort(new Comparator<DoctorClass>() {
           @Override
           public int compare(DoctorClass o1, DoctorClass o2) {
               if(o2.getSalary()==o1.getSalary()){
                   return o1.getName().compareTo(o2.getName());
               }
               return o2.getSalary()-o1.getSalary();
           }
       });
       return list;
   }

    // to edit the Doctor
    public DoctorClass editDoctor(DoctorClass Doctor) {
        DoctorClass ExistingDoctor;
        ExistingDoctor = repository.findById(Doctor.getId());
        ExistingDoctor.setSalary(Doctor.getSalary());
        ExistingDoctor.setName(Doctor.getName());
        ExistingDoctor.setSpecialization(Doctor.getSpecialization());
         return repository.save(ExistingDoctor);
    }
    public DoctorClass updateDoctor(DoctorClass Doctor, int id)
    {
        DoctorClass docupdate;
        docupdate = repository.findById(Doctor.getId());
        docupdate.setName(Doctor.getName());
        docupdate.setSalary(Doctor.getSalary());
        docupdate.setSpecialization(Doctor.getSpecialization());
        repository.save(docupdate);
        return docupdate;
    }

    // to delete the Doctor
    public String deleteDoctor(int id) {
        repository.deleteById(id);
        return "Doctor deleted";
    }


}