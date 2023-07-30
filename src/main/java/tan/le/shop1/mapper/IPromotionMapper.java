package tan.le.shop1.mapper;

import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.Promotion;
import tan.le.shop1.entities.dto.PromotionDto;

@Component
public interface IPromotionMapper {
	
	PromotionDto toDto(Promotion promotion);
	
	Promotion toEntity(PromotionDto dto);
}
