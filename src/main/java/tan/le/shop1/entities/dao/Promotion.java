package tan.le.shop1.entities.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name ="promotion")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Promotion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String code;

	@NotNull
	private String name;
	
	@Column(name = "description")
	private String desc;
	

	private Integer discountRate;


	private Double maxPrice;


	private Double discountMoney;
	
	@CreationTimestamp
	private LocalDateTime startAt;
	
	@CreationTimestamp
	private LocalDateTime endAt;
	
	@CreationTimestamp
	private LocalDateTime createAt;
	
	@CreationTimestamp
	private LocalDateTime modifierAt;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "product", referencedColumnName = "id")
	@JsonIgnore
	private ProductPromotion product;
}
