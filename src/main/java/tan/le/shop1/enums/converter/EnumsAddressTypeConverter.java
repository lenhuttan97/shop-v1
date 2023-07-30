package tan.le.shop1.enums.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;
import tan.le.shop1.enums.AddressType;

@Convert
public class EnumsAddressTypeConverter implements AttributeConverter<AddressType, String>{

	@Override
	public String convertToDatabaseColumn(AddressType attribute) {
		if(attribute == null){
			return null;
		}
		switch (attribute) {
		case home:
			return "home";
			
		case work:
			return "work";

		default:
			throw new IllegalArgumentException(attribute + " not supported.");
		}
	}

	@Override
	public AddressType convertToEntityAttribute(String dbData) {
		if(dbData == null) {
			return null;
		}
		switch (dbData) {
		case "home":
			return AddressType.home;
		case "work":
			return AddressType.work;

		default:
			throw new IllegalArgumentException(dbData + " not supported.");
		}
		
	}
}
