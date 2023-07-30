package tan.le.shop1.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.AdminType;
import tan.le.shop1.entities.dao.AdminUser;
import tan.le.shop1.entities.dto.AdminDto;
import tan.le.shop1.mapper.IAdminMapper;

@Component
public class AdminMapperImpl implements IAdminMapper{
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public AdminDto toDto(AdminUser admin) {
		if(admin != null) {
			return mapper.map(admin, AdminDto.class);
		}
		return null;
	}

	@Override
	public AdminUser toEntity(AdminDto dto) {
		if(dto != null) {
			AdminUser adminUser= mapper.map(dto, AdminUser.class);
			AdminType adminType = AdminType.builder().amdinType(dto.getAmdinType()).permit(dto.getPermit()).build();
			adminUser.setAdminType(adminType);
			return adminUser;
		}
		return null;
	}

}
