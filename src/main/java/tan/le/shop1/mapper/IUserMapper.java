package tan.le.shop1.mapper;

import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.Users;
import tan.le.shop1.entities.dto.user.UserDetailDto;
import tan.le.shop1.entities.dto.user.UserLoginDto;
import tan.le.shop1.entities.dto.user.UserRegisterDto;
import tan.le.shop1.entities.dto.user.UserUpdateDto;

@Component
public interface IUserMapper {

		UserDetailDto toDto(Users user);
		
		UserLoginDto toLoginDto(Users user);
		
		UserRegisterDto toRegisterDto(Users user);
		
		Users toEntity(UserRegisterDto dto);
		
		Users toEntity(UserUpdateDto dto);
}
