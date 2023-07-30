package tan.le.shop1.entities.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tan.le.shop1.enums.LoginStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminDto {

	@JsonProperty
	private Long id;
	
	@JsonProperty
	private String username;
	
	@JsonProperty
	private String password;
	
	@JsonProperty
	private String fullname;
	
	@JsonProperty
	private LoginStatus status;
	
	@JsonProperty
	private String createAt;
	
	@JsonProperty
	private String modifierAt;
	
	@JsonProperty
	private String lastLogin;
	
	@JsonProperty
	private String amdinType;
	
	@JsonProperty
	private String permit;
		
}
