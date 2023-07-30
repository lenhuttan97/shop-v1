package tan.le.shop1.entities.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tan.le.shop1.entities.dto.product.ProductDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {

	@JsonProperty
	private Long id;
	
	@JsonProperty
	private ProductDto product;
	
	@JsonProperty
	private List<VariationDto> vatiations;
	
	@JsonProperty
	private Integer quantity;
	
	@JsonProperty
	private String createAt;
	
	@JsonProperty
	private String modifierAt;
	
}
