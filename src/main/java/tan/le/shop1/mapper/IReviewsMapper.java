package tan.le.shop1.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.Reviews;
import tan.le.shop1.entities.dto.ReviewsDto;

@Component
public interface IReviewsMapper {
	
	ReviewsDto toDto(Reviews review);
	
	List<ReviewsDto> toDto(List<Reviews> reviews);
	
	Reviews toEntity(ReviewsDto dto);
}
