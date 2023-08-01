package tan.le.shop1.entities.dao;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tan.le.shop1.enums.converter.EnumsVariationTypeConverter;

@Table (name = "variation")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Variation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String name;

	@Column(name = "variation_type")
	@Convert(converter = EnumsVariationTypeConverter.class)
	private String type;

	@Column(name = "description")
	private String desc;
	
	@OneToMany(mappedBy ="name", fetch = FetchType.LAZY)
	private List<VariationOption> names;

	@OneToMany(mappedBy ="value", fetch = FetchType.LAZY)
	private List<VariationOption> values;
}
