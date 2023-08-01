package tan.le.shop1.entities.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Table(name = "desc_pin")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DescPin implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type", referencedColumnName = "id")
    private VariationOption type;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "capacity", referencedColumnName = "id")
    private VariationOption capacity ;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "power", referencedColumnName = "id")
    private VariationOption power;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tech", referencedColumnName = "id")
    private VariationOption tech;
}
