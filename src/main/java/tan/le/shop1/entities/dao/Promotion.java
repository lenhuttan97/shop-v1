package tan.le.shop1.entities.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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
	private String name;
	
	@Column(name = "description")
	private String desc;
	
	@NotNull
	private Integer discountRate;
	
	@CreationTimestamp
	private LocalDateTime startAt;
	
	@CreationTimestamp
	private LocalDateTime endAt;
	
	@CreationTimestamp
	private LocalDateTime createAt;
	
	@CreationTimestamp
	private LocalDateTime modifierAt;
	
	@OneToMany(mappedBy = "promotion", fetch = FetchType.LAZY)
	private List<Products> products;
}
