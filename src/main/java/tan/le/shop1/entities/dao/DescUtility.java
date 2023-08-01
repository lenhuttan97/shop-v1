package tan.le.shop1.entities.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Table(name = "desc_utility")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DescUtility implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sercurity", referencedColumnName = "id")
    private VariationOption sercurity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "specifical", referencedColumnName = "id")
    private VariationOption specifical ;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "record", referencedColumnName = "id")
    private VariationOption record;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tech", referencedColumnName = "id")
    private VariationOption tech;
}
