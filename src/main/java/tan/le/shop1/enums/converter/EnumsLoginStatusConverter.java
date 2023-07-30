package tan.le.shop1.enums.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;
import tan.le.shop1.enums.LoginStatus;

//@Convert
public class EnumsLoginStatusConverter implements AttributeConverter<LoginStatus, String>{

	@Override
	public String convertToDatabaseColumn(LoginStatus attribute) {
		if(attribute == null) {
			return null;
		}
		switch (attribute) {
		case in_progress:
			return "in progress";
		case logout:
			return "logout";
		case unavaible:
			return "unavaible";
		default:
			throw new IllegalArgumentException(attribute + " not supported.");
		}
	}

	@Override
	public LoginStatus convertToEntityAttribute(String dbData) {
		if(dbData == null) {
			return null;
		}
		switch (dbData) {
		case "in progress":
			return LoginStatus.in_progress;
		case "logout":
			return LoginStatus.logout;
		case "unavaible":
			return LoginStatus.unavaible;
		default:
			throw new IllegalArgumentException(dbData + " not supported.");
		}
	}

}
