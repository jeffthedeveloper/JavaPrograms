package com.devsuperior.movieflix.resources;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.services.UserService;

@RestController
@RequestMapping("/users")
public class UserResource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	private UserService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
		UserDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@GetMapping(value = "/profile")
	public ResponseEntity<UserDTO> getProfile() {
		UserDTO dto = service.getProfile();
		return ResponseEntity.ok().body(dto);
	}
}
