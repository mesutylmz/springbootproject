package com.viavis.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.viavis.app.model.User;
import com.viavis.app.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/rest")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET,value="/users")
	public ResponseEntity<List<User>> getUsers(){
		
		List<User> users = userService.findUsers();
		return ResponseEntity.ok(users);
		
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/user/id")
	public ResponseEntity<?> getUser(@PathVariable("id") Long id){
		
		User user = userService.findUser(id);
		return ResponseEntity.ok(user);
			
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.GET, value = "/user")
	public ResponseEntity<List<User>> getOwners(@RequestParam("name") String name) {
		List<User> users 	= userService.findByName(name);
		return ResponseEntity.ok(users);
	}
	

	
}
