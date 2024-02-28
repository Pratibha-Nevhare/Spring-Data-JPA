package com.example.SpringData;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
@Autowired
EmpRepository repo;

@PostMapping("/addemp")
public Employee addEmp(@RequestBody Employee e) {
    return repo.save(e);
}

@GetMapping("/getemp")
public List<Employee> getEmp() {
    return repo.findAll();
}

@PutMapping("/update")
public Employee updateEmp(@RequestBody Employee e) {
    return repo.save(e);
}

@DeleteMapping("/delete/{empid}")
public ResponseEntity<?> deleteEmp(@PathVariable("empid") Integer empid) {
    Optional<Employee> employee = repo.findById(empid);
    if (employee.isPresent()) {
        repo.delete(employee.get());
        return new ResponseEntity<>(HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

@GetMapping("/getemp/{empid}")
public Employee getEmp(@PathVariable("empid") Integer empid)
{
	Optional<Employee> o=repo.findById(empid);
	return o.get();
}
}
