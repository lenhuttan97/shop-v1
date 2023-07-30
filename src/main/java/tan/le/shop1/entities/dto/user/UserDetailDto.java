package tan.le.shop1.entities.dto.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Convert;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tan.le.shop1.entities.dto.AddressDto;
import tan.le.shop1.entities.dto.OrderDto;
import tan.le.shop1.entities.dto.ReviewsDto;
import tan.le.shop1.entities.dto.ShoppingSessionDto;
import tan.le.shop1.enums.LoginStatus;
import tan.le.shop1.enums.converter.EnumsLoginStatusConverter;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailDto {
	
	@JsonProperty
	private Long id;
	
	@JsonProperty
	private String fullName;
	
	@JsonProperty
	private String username;
	
	@JsonProperty
	private String email;
	
	@JsonProperty
	private String phone;
	
	@JsonProperty
	private String password;
	
	@JsonProperty
	@Convert(converter = EnumsLoginStatusConverter.class)
	private LoginStatus status;
	
//	@JsonProperty
//	private String permittance;
	
	@JsonProperty
	private String avatar;
	
	@JsonProperty
	private String gender;
	
	@JsonProperty
	private String dayOfBirth;
	
	@JsonProperty
	private List<AddressDto> address;
	
	@JsonProperty
	private List<OrderDto> orderings;
	
	@JsonProperty
	private List<OrderDto> ordereds;
	
	@JsonProperty
	private List<ShoppingSessionDto> ShoppingSessionDto;
	
	@JsonProperty
	private List<ReviewsDto> reviews;


}
