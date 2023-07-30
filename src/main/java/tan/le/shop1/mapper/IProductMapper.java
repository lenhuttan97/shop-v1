package tan.le.shop1.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.Products;
import tan.le.shop1.entities.dto.product.ProductDetailDto;
import tan.le.shop1.entities.dto.product.ProductDto;

@Component
public interface IProductMapper {
	
	ProductDetailDto toDTO(Products product);
	
	List<ProductDto> toListDTO(List<Products> products);
	
	
	Products toEntiry(ProductDetailDto dto);

}
