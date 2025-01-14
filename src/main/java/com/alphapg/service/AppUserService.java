package com.alphapg.service;

import com.alphapg.dto.AppUserReqDto;
import com.alphapg.dto.AppUserResponseDto;

public interface AppUserService {
	
	String registerUser(AppUserReqDto dto);
	
	AppUserResponseDto getAppUserResponseDto(long id);
	
	String deleteUser(long id);
	
	String updateUser(AppUserReqDto appUserReqDto);
}
