package tan.le.shop1.entities.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {
	
	@JsonProperty
	private Long id;
	
	@JsonProperty
	private String line;
	
	@JsonProperty
	private String street;
	
	@JsonProperty
	private String ward;
	
	@JsonProperty
	private String district;
	
	@JsonProperty
	private String city;
	
	@JsonProperty
	private String type;
	
	@JsonProperty
	private Boolean isDefault;
	
	
	
}
