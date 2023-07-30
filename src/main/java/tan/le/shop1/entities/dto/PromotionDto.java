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
public class PromotionDto {
	
	@JsonProperty
	private Long id;
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private String desc;
	
	@JsonProperty
	private Integer discountRate;
	
	@JsonProperty
	private String starAt;
	
	@JsonProperty
	private String endAt;
	
	@JsonProperty
	private String createAt;
	
	@JsonProperty
	private String modifierAt;
	
	@JsonProperty
	private List<ProductDto> products;
}
