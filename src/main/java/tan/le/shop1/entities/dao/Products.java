package tan.le.shop1.entities.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name ="products")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Products implements Serializable{
	
	private static final long serialVersionUID = -8832862623919132232L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String name;
	
	private String SKU;
	
	@Column(name = "description")
	private String desc;
	
//	private Long categoryId;
	
	@NotNull
	private Double price;
	
	@NotNull
	private Integer inventory;
	
	@NotNull
	@AssertTrue
	private Boolean isAvailable;
	
	@NotNull
	@AssertFalse
	private Boolean isBestsaler;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "promotion_id", referencedColumnName = "id")
	@JsonIgnore
	private Promotion promotion;
	
	private String img;
	
	@CreationTimestamp
	private LocalDateTime createAt;
	
	@UpdateTimestamp
	private LocalDateTime modifierAt;
	
	@CreationTimestamp
	private LocalDateTime deleteAt;
	
	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
	private List<Reviews> review;
	
//	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
//	private List<ProductsVariationOption> productsVariation;
	
	@ManyToMany
    @JoinTable(name = "products_variation", 
    joinColumns = @JoinColumn(name = "product_id"), 
    								inverseJoinColumns = @JoinColumn(name = "variation_id"))
    private List<VariationOption> productsVariation;
	
}
