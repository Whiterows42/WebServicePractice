package com.nt.cntrl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Employee;

@RestController
public class TestController {

	
	@GetMapping("/emp/{id}")
	public String first(@PathVariable int id) {
		
		System.out.println(id);
		return "ok";
	}
	
	
	
	@GetMapping("/send/{id}")
	public Employee sendDetails(@PathVariable int id) {
		
		Employee e = new Employee(id,"sam",id*100);
		
		return e;
	}
	@GetMapping("/values")
	public Employee thired() {
		
		Employee e = new Employee(22,"ajit",300);
		return e;
	}
	
	@PostMapping("getAll")
	public String getAllData(@RequestBody Employee e) {
		
		System.out.println(e);
		return "status ok";
	}
}
