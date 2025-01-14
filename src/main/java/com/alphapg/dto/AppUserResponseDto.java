package com.alphapg.dto;

import com.alphapg.entity.Role;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppUserResponseDto {
	
	private Long userId;
	private String name;
	private String email;
	private String phone;
	private Boolean isAccountEnabled;
	private Role role;
}
