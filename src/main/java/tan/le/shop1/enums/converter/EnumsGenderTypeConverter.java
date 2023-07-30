package tan.le.shop1.enums.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;
import tan.le.shop1.enums.GenderType;

@Convert
public class EnumsGenderTypeConverter implements AttributeConverter<GenderType, String>{

	@Override
	public String convertToDatabaseColumn(GenderType attribute) {
		if(attribute == null) {
			return null;
		}
		
		switch (attribute) {
		case MALE:
			return "male";
		case FEMALE:
			return "female";
		default:
			throw new IllegalArgumentException(attribute + " not supported.");
		}
	}

	@Override
	public GenderType convertToEntityAttribute(String dbData) {
		if(dbData == null) {
			return null;
		}
		switch (dbData) {
		case "male":
			return GenderType.MALE;
		case "femal":
			return GenderType.FEMALE;

		default:
			throw new IllegalArgumentException(dbData + " not supported.");
		}
	}

}
