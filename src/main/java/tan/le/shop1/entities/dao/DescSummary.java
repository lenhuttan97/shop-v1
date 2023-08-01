package tan.le.shop1.entities.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Table(name = "desc_summary")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DescSummary implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "design", referencedColumnName = "id")
    private VariationOption design;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "material", referencedColumnName = "id")
    private VariationOption material ;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "weight", referencedColumnName = "id")
    private VariationOption weight;

    private Date introduce;
}
