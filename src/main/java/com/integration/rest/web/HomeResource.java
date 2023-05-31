package com.integration.rest.web;

import com.integration.model.ChangeEmploymentParam;
import com.integration.model.EmployeeITS;
import com.integration.servive.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeResource {


    private final EmployeeService employeeService;

    public HomeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee")
    public ResponseEntity create(@RequestBody EmployeeITS employee){
      employeeService.sendNewEmployee(employee);
      return ResponseEntity.ok().build();
    }

    @PostMapping("/employment-change")
    public ResponseEntity employmentChange(@RequestBody ChangeEmploymentParam changeEmploymentParam){
        employeeService.sendChangeEmployment(changeEmploymentParam);
        return ResponseEntity.ok().build();
    }
}
