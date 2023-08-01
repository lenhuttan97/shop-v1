package tan.le.shop1.entities.dao;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "variation_option")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VariationOption implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="name", referencedColumnName = "id")
	@JsonIgnore
	private Variation name;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="value", referencedColumnName = "id")
	@JsonIgnore
	private Variation value;
	
//	@OneToMany(mappedBy = "variationOption", fetch = FetchType.LAZY)
//	private List<ProductsVariationOption> productsVariation;

//	 @ManyToMany(mappedBy = "productsVariation")
//	    private List<Products> variationProducts;
}
