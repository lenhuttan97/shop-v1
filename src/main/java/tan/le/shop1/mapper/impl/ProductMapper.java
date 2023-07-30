package tan.le.shop1.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tan.le.shop1.entities.dao.Products;
import tan.le.shop1.entities.dto.product.ProductDetailDto;
import tan.le.shop1.entities.dto.product.ProductDto;
import tan.le.shop1.mapper.IProductMapper;

@Component
public class ProductMapper implements IProductMapper{
	
	@Autowired
    private ModelMapper mapper;

	@Override
	public ProductDetailDto toDTO(Products product) {
		if(product != null) {
			return mapper.map(product, ProductDetailDto.class);
		}
		return null;
	}

	@Override
	public List<ProductDto> toListDTO(List<Products> products) {
		if(!products.isEmpty()) {
			List<ProductDto> dtos = new ArrayList<>();
			for (Products product : products) {
				if(product != null) {
					dtos.add(mapper.map(product, ProductDto.class));
				}
			}
			
			return dtos;
		}
		return null;
	}

	@Override
	public Products toEntiry(ProductDetailDto dto) {
		if(dto != null) {
			return mapper.map(dto, Products.class);
		}
		return null;
	}

}
