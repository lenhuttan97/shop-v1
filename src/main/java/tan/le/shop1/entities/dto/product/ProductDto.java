package tan.le.shop1.entities.dto.product;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tan.le.shop1.entities.dto.PromotionDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
	
	@JsonProperty
	private Long id;
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private Double price;
	
	@JsonProperty
	private PromotionDto promotion;
	
	@JsonProperty
	private List<String> img;
	
	@JsonProperty
	private Long averageRating;
	
	@JsonProperty
	private Boolean isBestsaler;
	
}
