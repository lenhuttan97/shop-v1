package tan.le.shop1.mapper;

import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.ShoppingSession;
import tan.le.shop1.entities.dto.ShoppingSessionDto;

@Component
public interface IShoppingMapper {

	ShoppingSessionDto toDto(ShoppingSession shopping);
	
	ShoppingSession toEntity(ShoppingSessionDto dto);
}
