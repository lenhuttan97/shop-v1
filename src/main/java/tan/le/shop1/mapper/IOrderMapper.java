package tan.le.shop1.mapper;

import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.OrderDetails;
import tan.le.shop1.entities.dto.OrderDto;

@Component
public interface IOrderMapper {

	OrderDto toDto (OrderDetails detail);
	
	OrderDetails toEntity(OrderDto dto);
}
