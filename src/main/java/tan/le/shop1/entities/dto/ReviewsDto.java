package tan.le.shop1.entities.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tan.le.shop1.entities.dto.product.ProductDto;
import tan.le.shop1.entities.dto.user.UserDetailDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewsDto {

	@JsonProperty
	private Long id;
	
	@JsonProperty
	private UserDetailDto user;
	
	@JsonProperty
	private ProductDto product;
	
	@JsonProperty
	private Integer ratingValue;
	
	@JsonProperty
	private String comment;
	
	@JsonProperty
	private String createAt;
	
	@JsonProperty
	private String modifierAt;
}
