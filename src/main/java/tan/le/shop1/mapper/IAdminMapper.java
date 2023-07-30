package tan.le.shop1.mapper;

import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.AdminUser;
import tan.le.shop1.entities.dto.AdminDto;

@Component
public interface IAdminMapper {

	AdminDto toDto(AdminUser admin);
	
	AdminUser toEntity(AdminDto dto);
}
