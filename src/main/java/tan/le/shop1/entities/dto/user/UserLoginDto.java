package tan.le.shop1.entities.dto.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Convert;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tan.le.shop1.entities.dto.ShoppingSessionDto;
import tan.le.shop1.enums.LoginStatus;
import tan.le.shop1.enums.converter.EnumsLoginStatusConverter;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginDto{

	
	@JsonProperty
	private Long id;
	
	@JsonProperty
	private String fullName;
	
	@JsonProperty
	@Convert(converter = EnumsLoginStatusConverter.class)
	private LoginStatus status;

	@JsonProperty
	private String avatar;
	
	@JsonProperty
	private List<ShoppingSessionDto> ShoppingSessionDto;
}
