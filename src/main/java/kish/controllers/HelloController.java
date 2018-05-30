package kish.controllers;

import kish.dto.EmployeeDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @PostMapping("/hello")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/wish")
    public String service1() {
        return "Good Morning";
    }

    @PutMapping("/employeeAdd")
    public Boolean addEmployee(@RequestBody EmployeeDto employeeDto) {
        return true;
    }

    @GetMapping("/employeeGet/{employeeId}")
    public EmployeeDto getEmployee(@PathVariable(value = "employeeId") String employeeId) {
        return new EmployeeDto(employeeId);
    }
}
