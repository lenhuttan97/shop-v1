package tan.le.shop1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tan.le.shop1.entities.dao.ShoppingItems;

public interface ShoppingItemsRepository extends JpaRepository<ShoppingItems, Long>{

}
