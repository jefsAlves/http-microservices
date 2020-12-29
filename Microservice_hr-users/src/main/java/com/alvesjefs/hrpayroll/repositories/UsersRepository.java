package com.alvesjefs.hrpayroll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvesjefs.hrpayroll.domain.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

	Users findByEmail(String email);
}
