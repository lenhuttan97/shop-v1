package tan.le.shop1.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.Reviews;
import tan.le.shop1.entities.dto.ReviewsDto;
import tan.le.shop1.mapper.IReviewsMapper;

@Component
public class ReviewsMapper implements IReviewsMapper{
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public ReviewsDto toDto(Reviews review) {
		if(review != null) {
			return mapper.map(review, ReviewsDto.class);
		}
		return null;
	}

	@Override
	public List<ReviewsDto> toDto(List<Reviews> reviews) {
		if(!reviews.isEmpty()) {
			List<ReviewsDto> dtos = new ArrayList<>();
			for (Reviews review : reviews) {
				if(review != null) {
					dtos.add(mapper.map(review, ReviewsDto.class));
				}
			}
			
			return dtos;
		}
		return null;
	}

	@Override
	public Reviews toEntity(ReviewsDto dto) {
		if(dto !=  null) {
			return mapper.map(dto, Reviews.class);
		}
		return null;
	}

}
