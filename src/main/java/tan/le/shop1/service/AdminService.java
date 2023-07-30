package tan.le.shop1.service;

import tan.le.shop1.entities.dto.AdminDto;


public interface AdminService extends GenericServcie<AdminDto>{
	AdminDto save(AdminDto t);
}
