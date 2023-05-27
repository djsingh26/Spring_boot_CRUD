package com.codedj.Sprint.boot.tutorial.Controller;

import com.codedj.Sprint.boot.tutorial.entity.Department;
import com.codedj.Sprint.boot.tutorial.service.DepartmentService;
import com.codedj.Sprint.boot.tutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmemtById(@PathVariable("id") long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted Successfull";
    }



}
