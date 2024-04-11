package com.inventry.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Sample")
public class SampleController {
	@Autowired
	StudentRepo sr;
	
	@PostMapping(value="/post")
	public String save(EntityStudent e) {
		 sr.save(e);
		 return "success";
		
	}
	@GetMapping(value="/findall")
	public List<EntityStudent> findall() {
		return sr.findAll();
	}
	
	@PatchMapping(value="/get/{id}")
	public String get(@RequestBody EntityStudent s,@PathVariable int id) {
		EntityStudent stu=sr.findById(id).get();
		stu.setDept(s.getDept());
		sr.save(stu);
		return "save";
		
	}
	@PutMapping(value="/put/{x}")
	public String get1(@RequestBody EntityStudent t,@PathVariable int x) {
		t.setId(x);
		sr.save(t);
		return "save";
		
	}
	@PostMapping(value="/saveall")
	public List<EntityStudent> saveall(@RequestBody List<EntityStudent> p) {
		return sr.saveAll(p);
	}
	@GetMapping(value="/findbyid/{id}")
	public EntityStudent findbyid(@PathVariable int id ) {
		return sr.findById(id).get();
	}
	@GetMapping(value="getall")
	public String getall(@RequestBody EntityStudent u,@RequestParam int id,String name,int age,String dept,int attendance) {
		u.setId(id);
		u.setName(name);
		u.setAge(age);
		u.setDept(dept);
		u.setAttendance(attendance);
		return "StudentDetails:"+id+"_"+name+"_"+age+"_"+dept+"_"+attendance;
	}
	@PostMapping(value="/saveEntity")
    public ResponseEntity<?> saveEntity(@RequestBody EntityStudent y) {
       sr.save(y);
        return ResponseEntity.ok("Entity saved successfully");
    }
	
	

}
