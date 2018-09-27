package com.luv2code.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	List<Student> ll = new ArrayList<Student>();
	@PostConstruct
	public void loaddata(){
		 ll = new ArrayList<Student>();
		Student st1 = new Student(1, "Ashu", "Gunjal");
		Student st2 = new Student(2, "Sneha", "Bahirgonde");
		Student st3 = new Student(3, "Sanju", "Jadhav");
		ll.add(st1);
		ll.add(st2);
		ll.add(st3);
	}
	
	@GetMapping("/studentlist")
	public List<Student> getAllList(){
	
		return ll;
	
	}
	
	@GetMapping("/studentlist/{id}")
	public Student getid(@PathVariable int id){
		
		if(id >= ll.size() || id < 0){
			throw new StudentNotFoundException("Student not found" + id);
		}
		
		return ll.get(id);
	
	}
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException e)
	{
		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		return new ResponseEntity<StudentErrorResponse>(error,HttpStatus.NOT_FOUND);
	}
}
