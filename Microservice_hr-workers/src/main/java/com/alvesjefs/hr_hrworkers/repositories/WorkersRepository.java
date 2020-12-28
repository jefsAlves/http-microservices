package com.alvesjefs.hr_hrworkers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvesjefs.hr_hrworkers.domain.Workers;

public interface WorkersRepository extends JpaRepository<Workers, Long> {

	Workers findByEmail(String email);

	Workers findByName(String name);
}
