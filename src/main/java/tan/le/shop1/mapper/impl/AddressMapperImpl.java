package tan.le.shop1.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.Address;
import tan.le.shop1.entities.dto.AddressDto;
import tan.le.shop1.mapper.IAddressMapper;

@Component
public class AddressMapperImpl implements IAddressMapper{

	@Autowired
    private ModelMapper mapper;
	
	@Override
	public AddressDto toDto(Address address) {
		if(address != null) {
			return mapper.map(address, AddressDto.class);
		}
		return null;
	}

	@Override
	public Address toEntity(AddressDto dto) {
		if(dto != null) {
			return mapper.map(dto, Address.class);
		}
		return null;
	}

}
