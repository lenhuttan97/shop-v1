package tan.le.shop1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tan.le.shop1.entities.dao.AdminType;
import tan.le.shop1.entities.dao.AdminUser;
import tan.le.shop1.entities.dto.AdminDto;
import tan.le.shop1.mapper.IAdminMapper;
import tan.le.shop1.repository.AdminTypeRepository;
import tan.le.shop1.repository.AdminUserRepository;
import tan.le.shop1.service.AdminService;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminUserRepository adminUserRepository;
	
	@Autowired
	private AdminTypeRepository adminTypeRepository;

	@Autowired
	private IAdminMapper mapper;

	@Override
	public List<AdminDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminDto findById(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminDto save(AdminDto t) {
		System.out.println(t.getAmdinType());
		System.out.println(mapper.toEntity(t).toString());
		
		adminUserRepository.save(mapper.toEntity(t));
		return t;
	}

	@Override
	public Boolean update(AdminDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(AdminDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminDto> saveBatch(List<AdminDto> list) {
		// TODO Auto-generated method stub
		return null;
	}

}
