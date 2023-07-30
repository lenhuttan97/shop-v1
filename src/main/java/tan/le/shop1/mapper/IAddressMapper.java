package tan.le.shop1.mapper;

import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.Address;
import tan.le.shop1.entities.dto.AddressDto;

@Component
public interface IAddressMapper {

	AddressDto toDto(Address address);
	
	Address toEntity(AddressDto dto);
}
