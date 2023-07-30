package tan.le.shop1.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tan.le.shop1.entities.dao.Promotion;
import tan.le.shop1.entities.dao.Variation;
import tan.le.shop1.entities.dto.product.ProductDetailDto;
import tan.le.shop1.entities.dto.product.ProductDto;
import tan.le.shop1.enums.Sort;
import tan.le.shop1.service.ProductsService;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductsService{
	
	
	@Override
	public List<ProductDetailDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public List<ProductDto> findByBetweenDay(Date start, Date end) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public List<ProductDto> findAll(int pageSize, String sort, Sort sortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDto> findByPromotion(Promotion promotion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDto> findByVariation(List<Variation> variations) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDetailDto findById(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDetailDto save(ProductDetailDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean update(ProductDetailDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(ProductDetailDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDetailDto> saveBatch(List<ProductDetailDto> list) {
		// TODO Auto-generated method stub
		return null;
	}

}
