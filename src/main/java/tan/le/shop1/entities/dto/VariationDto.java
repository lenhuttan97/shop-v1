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
public class VariationDto {
	
	@JsonProperty
	private Long id;
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private String Value;
	
	@JsonProperty
	private String desc;
}
