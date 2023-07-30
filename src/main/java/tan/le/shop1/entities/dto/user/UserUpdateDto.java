package tan.le.shop1.entities.dto.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tan.le.shop1.entities.dto.AddressDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateDto {


	@JsonProperty
	private Long id;
	
	@JsonProperty
	private String fullName;
	
	@JsonProperty
	private String email;
	
	@JsonProperty
	private String phone;
	
	@JsonProperty
	private String password;
	
	@JsonProperty
	private String avatar;
	
	@JsonProperty
	private String gender;
	
	@JsonProperty
	private String dayOfBirth;
	
	@JsonProperty
	private List<AddressDto> address;
}
