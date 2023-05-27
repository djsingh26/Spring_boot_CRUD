package com.codedj.Sprint.boot.tutorial.service;

import com.codedj.Sprint.boot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(long departmentId);

    public void deleteDepartmentById(long departmentId);
}
