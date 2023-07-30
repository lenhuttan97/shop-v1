package tan.le.shop1.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tan.le.shop1.entities.dto.OrderDto;
import tan.le.shop1.service.OrderService;

@Service
@RequiredArgsConstructor
public class OrderServiveImpl implements OrderService{
	
	@Override
	public List<OrderDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDto findById(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDto save(OrderDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean update(OrderDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(OrderDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDto> saveBatch(List<OrderDto> list) {
		// TODO Auto-generated method stub
		return null;
	}

}
