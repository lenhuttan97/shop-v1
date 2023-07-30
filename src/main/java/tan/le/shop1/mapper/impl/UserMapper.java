package tan.le.shop1.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.Users;
import tan.le.shop1.entities.dto.user.UserDetailDto;
import tan.le.shop1.entities.dto.user.UserLoginDto;
import tan.le.shop1.entities.dto.user.UserRegisterDto;
import tan.le.shop1.entities.dto.user.UserUpdateDto;
import tan.le.shop1.mapper.IUserMapper;

@Component
public class UserMapper implements IUserMapper{
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public UserDetailDto toDto(Users user) {
		if (user != null) {
			return mapper.map(user, UserDetailDto.class);
		}
		return null;
	}

	@Override
	public UserLoginDto toLoginDto(Users user) {
		if (user != null) {
			return mapper.map(user, UserLoginDto.class);
		}
		return null;
	}

	@Override
	public UserRegisterDto toRegisterDto(Users user) {
		if (user != null) {
			return mapper.map(user, UserRegisterDto.class);
		}
		return null;
	}

	@Override
	public Users toEntity(UserRegisterDto dto) {
		if(dto != null) {
			return mapper.map(dto, Users.class);
		}
		return null;
	}

	@Override
	public Users toEntity(UserUpdateDto dto) {
		if(dto != null) {
			return mapper.map(dto, Users.class);
		}
		return null;
	}

}