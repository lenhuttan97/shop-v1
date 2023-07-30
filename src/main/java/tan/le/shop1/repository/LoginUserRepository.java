package tan.le.shop1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tan.le.shop1.entities.dao.LoginUser;

public interface LoginUserRepository extends JpaRepository<LoginUser, Long>{

}
