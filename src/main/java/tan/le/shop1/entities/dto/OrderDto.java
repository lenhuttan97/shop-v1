package tan.le.shop1.entities.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Convert;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tan.le.shop1.entities.dto.user.UserDetailDto;
import tan.le.shop1.enums.converter.EnumsOrderStatusConverter;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

	@JsonProperty
	private Long id;
	
	@JsonProperty
	private UserDetailDto user;

	@JsonProperty
	private AddressDto shippingSesstion;
	
	@JsonProperty
	private String author;
	
	@JsonProperty
	@Convert(converter = EnumsOrderStatusConverter.class)
	private String status;
	
	@JsonProperty
	private Integer totalPrice;
	
	@JsonProperty
	private Integer totalItems;
	
	@JsonProperty
	private List<OrderItemDto> item;
	
	@JsonProperty
	private String createAt;
	
	@JsonProperty
	private String modifierAt;
	
}
