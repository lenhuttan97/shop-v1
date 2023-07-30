package tan.le.shop1.entities.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tan.le.shop1.entities.dto.user.UserDetailDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingSessionDto {
	
	@JsonProperty
	private Long id;

	@JsonProperty
	private UserDetailDto user;
	
	@JsonProperty
	private Integer total;
	
	@JsonProperty
	private List<OrderItemDto> item;
	
	@JsonProperty
	private String createAt;
	
	@JsonProperty
	private String modifierAt;
	
}
