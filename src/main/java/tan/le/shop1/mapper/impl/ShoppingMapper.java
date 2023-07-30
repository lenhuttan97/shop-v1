package tan.le.shop1.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.ShoppingSession;
import tan.le.shop1.entities.dto.ShoppingSessionDto;
import tan.le.shop1.mapper.IShoppingMapper;

@Component
public class ShoppingMapper implements IShoppingMapper{
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public ShoppingSessionDto toDto(ShoppingSession shopping) {
		if(shopping != null) {
			return mapper.map(shopping, ShoppingSessionDto.class);
		}
		return null;
	}

	@Override
	public ShoppingSession toEntity(ShoppingSessionDto dto) {
		if(dto != null) {
			return mapper.map(dto, ShoppingSession.class);
		}
		return null;
	}

}
