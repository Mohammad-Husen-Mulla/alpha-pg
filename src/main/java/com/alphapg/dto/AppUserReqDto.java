package com.alphapg.dto;

import com.alphapg.entity.Role;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppUserReqDto {
	
	private Long userId;
	private String name;
	private String email;
	private String phone;
	private String password;
	private Boolean isAccountEnabled;
	private Role role;

}
