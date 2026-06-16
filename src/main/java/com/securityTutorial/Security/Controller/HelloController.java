package com.securityTutorial.Security.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.securityTutorial.Security.employee.Employee;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    private List<Employee> list = new ArrayList<>(List.of(
        new Employee(101, "yogesh", 22)
        
    ));

    @GetMapping("/")
    public String hello(){
        return "Learning spring Security with yogesh";
    }
    @GetMapping("/employee")
    public List<Employee> getEmployee(){
        return list;
    }
    @PostMapping("/add")
    public void add(@RequestBody Employee employee){
        list.add(employee);
    }

    @GetMapping("id")
    public String session(HttpServletRequest req){
        return "Session ID" + req.getSession().getId();
    }
}


