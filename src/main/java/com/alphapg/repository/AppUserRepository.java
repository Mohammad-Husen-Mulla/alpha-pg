package com.alphapg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alphapg.entity.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	
	Optional<AppUser> findByEmailOrPhone(String email, String phone);
	
	Optional<AppUser> findByPhone(String phone);

	Optional<AppUser> findByEmail(String email);
}
