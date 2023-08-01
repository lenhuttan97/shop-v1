package tan.le.shop1.enums.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;
import tan.le.shop1.enums.VariationType;

@Convert
public class EnumsVariationTypeConverter implements AttributeConverter<VariationType, String> {


    @Override
    public String convertToDatabaseColumn(VariationType attribute) {
        if (attribute == null){
            return null;
        }

        switch (attribute){
            case pin -> {
                return "pin";
            }
            case camera -> {
                return "camera";
            }
            case screen -> {
                return "screen";
            }
            case chip -> {
                return "chip";
            }
            case memory -> {
                return "memory";
            }
            case color -> {
                return "color";
            }
            case utility -> {
                return "utility";
            }
            case summary -> {
                return "summary";
            }
            default -> {
                throw new IllegalArgumentException(attribute + " not supported.");
            }
        }
    }

    @Override
    public VariationType convertToEntityAttribute(String dbData) {
        if(dbData == null) {
            return null;
        }
        switch (dbData) {
            case "pin" -> {
                return VariationType.pin;
            }
            case "camera" -> {
                return VariationType.camera;
            }
            case "chip" -> {
                return VariationType.chip;
            }
            case "memory" -> {
                return VariationType.memory;
            }
            case "color" -> {
                return VariationType.color;
            }
            case "screen" -> {
                return VariationType.screen;
            }
            case "utility" -> {
                return VariationType.utility;
            }
            case "summary" -> {
                return VariationType.summary;
            }
            default -> {
                throw new IllegalArgumentException(dbData + " not supported.");
            }
        }
    }
}
