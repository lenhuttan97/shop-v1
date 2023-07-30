package tan.le.shop1.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tan.le.shop1.entities.dto.user.UserDetailDto;
import tan.le.shop1.service.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	
	@Override
	public List<UserDetailDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetailDto findById(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetailDto save(UserDetailDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean update(UserDetailDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(UserDetailDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDetailDto> saveBatch(List<UserDetailDto> list) {
		// TODO Auto-generated method stub
		return null;
	}

}
