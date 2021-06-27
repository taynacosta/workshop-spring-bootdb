package com.taynacosta.workshopmongo.resourses;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taynacosta.workshopmongo.domain.User;
import com.taynacosta.workshopmongo.dto.UserDTO;
import com.taynacosta.workshopmongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	
	@Autowired
	private UserService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List <UserDTO>> findAll(){
		List<User> list = service.findAll();
		List<UserDTO> listdto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listdto);
	}
}
