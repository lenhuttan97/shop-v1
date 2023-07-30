package tan.le.shop1.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.Promotion;
import tan.le.shop1.entities.dto.PromotionDto;
import tan.le.shop1.mapper.IPromotionMapper;

@Component
public class PromotionMapper implements IPromotionMapper{
	
	@Autowired
    private ModelMapper mapper;
	
	@Override
	public PromotionDto toDto(Promotion promotion) {
		if(promotion != null) {
			return mapper.map(promotion, PromotionDto.class);
		}
		return null;
	}

	@Override
	public Promotion toEntity(PromotionDto dto) {
		if(dto != null) {
			return mapper.map(dto, Promotion.class);
		}
		return null;
	}

}
