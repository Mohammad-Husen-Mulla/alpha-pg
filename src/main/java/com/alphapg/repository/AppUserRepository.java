package com.alphapg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alphapg.entity.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

}
