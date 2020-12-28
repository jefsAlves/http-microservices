package com.alvesjefs.hr_hrworkers.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvesjefs.hr_hrworkers.domain.Workers;
import com.alvesjefs.hr_hrworkers.repositories.WorkersRepository;

@Service
public class WorkersService {

	@Autowired
	private WorkersRepository workersRepository;

	public Workers findById(Long id) {
		Optional<Workers> worker = workersRepository.findById(id);
		return worker.orElseThrow(() -> new ObjectNotFoundException("Id not found"));
	}

	public Workers findByEmail(String email) {
		Workers workers = workersRepository.findByEmail(email);
		return workers;
	}

	public Workers findByName(String name) {
		Workers workers = workersRepository.findByName(name);
		return workers;
	}

	public List<Workers> findAll(Workers workers) {
		return workersRepository.findAll();
	}
}
