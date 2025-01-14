package com.alphapg.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.alphapg.constant.AppConstants;
import com.alphapg.dto.AppUserReqDto;
import com.alphapg.dto.AppUserResponseDto;
import com.alphapg.entity.AppUser;
import com.alphapg.repository.AppUserRepository;
import com.alphapg.service.AppUserService;

@Service
public class IAppUserServiceImpl implements AppUserService {

	private final AppUserRepository appUserRepository;

	public IAppUserServiceImpl(AppUserRepository appUserRepository) {
		this.appUserRepository = appUserRepository;
	}

	@Override
	public String registerUser(AppUserReqDto dto) {

		Optional<AppUser> optUser = appUserRepository.findByEmailOrPhone(dto.getEmail(), dto.getPhone());
		if (optUser.isPresent()) {

			AppUser appUser = optUser.get();

			if (appUser.getEmail().equals(dto.getEmail())) {
				throw new RuntimeException(AppConstants.ERROR_EMAIL_EXISTS);
			}

			if (appUser.getPhone().equals(dto.getPhone())) {
				throw new RuntimeException(AppConstants.ERROR_PHONE_EXISTS);
			}

		}

		try {
			AppUser user = new AppUser();
			BeanUtils.copyProperties(dto, user);
			appUserRepository.save(user);
			return AppConstants.REGISTRATION_SUCCESS_MESSAGE;
		} catch (Exception e) {
			return AppConstants.ERROR_UNKNOWN;
		}

	}

	@Override
	public AppUserResponseDto getAppUserResponseDto(long id) {

		AppUserResponseDto dto = new AppUserResponseDto();

		AppUser user = appUserRepository.findById(id)
				.orElseThrow(() -> new RuntimeException(AppConstants.ERROR_USER_NOTFOUND));

		BeanUtils.copyProperties(user, dto);

		return dto;
	}

	@Override
	public String deleteUser(long id) {

		AppUser user = appUserRepository.findById(id)
				.orElseThrow(() -> new RuntimeException(AppConstants.ERROR_USER_NOTFOUND));
		appUserRepository.delete(user);

		return AppConstants.PROCESS_SUCC_MSG;
	}

	@Override
	public String updateUser(AppUserReqDto appUserReqDto) {
		return null;
	}

}
