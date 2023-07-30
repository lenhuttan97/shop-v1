package tan.le.shop1.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.OrderDetails;
import tan.le.shop1.entities.dto.OrderDto;
import tan.le.shop1.mapper.IOrderMapper;

@Component
public class OrderMapper implements IOrderMapper{
	
	@Autowired
    private ModelMapper mapper;

	@Override
	public OrderDto toDto(OrderDetails detail) {
		if(detail != null){
			return mapper.map(detail, OrderDto.class);
		}
		return null;
	}

	@Override
	public OrderDetails toEntity(OrderDto dto) {
		if(dto != null) {
			return mapper.map(dto, OrderDetails.class);
		}
		return null;
	}

	
}
