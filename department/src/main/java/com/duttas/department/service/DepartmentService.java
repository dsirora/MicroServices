package com.duttas.department.service;

import com.duttas.department.entity.Department;
import com.duttas.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }

}
