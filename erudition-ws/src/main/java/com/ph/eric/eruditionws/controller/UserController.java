package com.ph.eric.eruditionws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ph.eric.eruditionws.service.UserService;
import com.ph.eric.eruditionws.to.UserTO;

/**
 * 
 * 
 * @author davidericjohn
 * @since 1.0.0
 */
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	private ResponseEntity<List<UserTO>> getAll() {
		return ResponseEntity.ok(this.service.getAll());
	}

}