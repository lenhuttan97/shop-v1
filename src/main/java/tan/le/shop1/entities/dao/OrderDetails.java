package tan.le.shop1.entities.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tan.le.shop1.enums.converter.EnumsOrderStatusConverter;

@Table(name = "order_details")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	@JsonIgnore
	private Users user;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "shipping_address", referencedColumnName = "id")
	@JsonIgnore
	private Address shippingAddress;
	
	private Long author;
	
	@NotNull
	private Integer totalItem;
	
	private String payment;
	
	@NotNull
	@Convert(converter = EnumsOrderStatusConverter.class)
	private String status;
	
	@OneToMany(mappedBy = "orderDetail", fetch = FetchType.LAZY)
	private List<OrderItem> orderItems;
	
	@CreationTimestamp
	private LocalDateTime createAt;
	
	@UpdateTimestamp
	private LocalDateTime modifierAt;
	
}
