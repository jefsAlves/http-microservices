package com.alvesjefs.hrpayroll.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvesjefs.hrpayroll.domain.Users;
import com.alvesjefs.hrpayroll.repositories.UsersRepository;
import com.alvesjefs.hrpayroll.services.exceptions.ObjectNotFoundException;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;

	public Users findById(Long id) {
		Optional<Users> user = usersRepository.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Id not found!"));
	}

	public Users findByEmail(String email) {
		Users users = usersRepository.findByEmail(email);
		return users;
	}
}
