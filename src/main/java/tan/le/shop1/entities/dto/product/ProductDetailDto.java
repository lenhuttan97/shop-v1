package tan.le.shop1.entities.dto.product;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tan.le.shop1.entities.dto.PromotionDto;
import tan.le.shop1.entities.dto.ReviewsDto;
import tan.le.shop1.entities.dto.VariationDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetailDto {

	@JsonProperty
	private Long id;
	
	@JsonProperty
	private String name;

	@JsonProperty
	private String desc;
	
	@JsonProperty
	private List<VariationDto> variation;
	
	@JsonProperty
	private Double price;
	
	@JsonProperty
	private Integer inventory;
	
	@JsonProperty
	private Boolean isAvailable;
	
	@JsonProperty
	private PromotionDto promotion;
	
	@JsonProperty
	private List<String> img;
	
	@JsonProperty
	private String createAt;
	
	@JsonProperty
	private String modifierAt;
	
	@JsonProperty
	private String deletaAt;
	
	@JsonProperty
	private Long averageRating;
	
	@JsonProperty
	private Integer totalRating;
	
	@JsonProperty
	private List<ReviewsDto> reviews;
	
	@JsonProperty
	private Boolean isBestsaler;
}
