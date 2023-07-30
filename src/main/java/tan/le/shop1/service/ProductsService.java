package tan.le.shop1.service;

import java.util.Date;
import java.util.List;

import tan.le.shop1.entities.dao.Promotion;
import tan.le.shop1.entities.dao.Variation;
import tan.le.shop1.entities.dto.product.ProductDetailDto;
import tan.le.shop1.entities.dto.product.ProductDto;
import tan.le.shop1.enums.Sort;

public interface ProductsService extends GenericServcie<ProductDetailDto>{

	List<ProductDto> findAll(int pageSize, String sort, Sort sortBy);
	
	List<ProductDto> findByPromotion(Promotion promotion);
	
	List<ProductDto> findByVariation(List<Variation> variations);
	
	List<ProductDto> findByBetweenDay(Date start, Date end);
	
	
}
