package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class stdcontroller {
	@GetMapping("/")
public String homepage(){
	return "Welcome to student list";
}
	@GetMapping("/list")
	public List<Student> getList(){
		List<Student>detailsList=new ArrayList<>();
		detailsList.add(new Student(1,"xxxx",23));
		detailsList.add(new Student(2,"xxxx",3));
		detailsList.add(new Student(3,"xxxx",25));
		return detailsList;
	}
}
