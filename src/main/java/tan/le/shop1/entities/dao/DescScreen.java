package tan.le.shop1.entities.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Table(name ="desc_screen")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DescScreen implements Serializable {
    private static final long serialVersionUID = -8832862623919132232L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tech", referencedColumnName = "id")
    private VariationOption tech;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "resolution", referencedColumnName = "id")
    private VariationOption resolution ;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "widescreen", referencedColumnName = "id")
    private VariationOption widescreen;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "brightness", referencedColumnName = "id")
    private VariationOption brightness;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "glass", referencedColumnName = "id")
    private VariationOption glass;
}
