package tan.le.shop1.enums.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;
import tan.le.shop1.enums.OrderStatus;

@Convert
public class EnumsOrderStatusConverter implements AttributeConverter<OrderStatus, String>{

	@Override
	public String convertToDatabaseColumn(OrderStatus attribute) {
		if(attribute == null) {
			return null;
		}
		switch (attribute) {
		case ORDER:
			return "order";
		case COMPLETE:
			return "complete";
		case PAY:
			return "pay";
		default:
			throw new IllegalArgumentException(attribute + " not supported.");
		}
	}

	@Override
	public OrderStatus convertToEntityAttribute(String dbData) {
		if(dbData == null) {
			return null;
		}
		switch (dbData) {
		case "order":
			return OrderStatus.ORDER;
		case "complete":
			return OrderStatus.COMPLETE;
		case "pay":
			return OrderStatus.PAY;
		default:
			throw new IllegalArgumentException(dbData + " not supported.");
		}
	}

}
