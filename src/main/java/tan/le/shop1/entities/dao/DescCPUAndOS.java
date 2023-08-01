package tan.le.shop1.entities.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Table(name = "desc_cpu_os")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DescCPUAndOS implements Serializable {

    private static final long serialVersionUID = -8832862623919132232L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OS", referencedColumnName = "id")
    private VariationOption OS;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cpu", referencedColumnName = "id")
    private VariationOption cpu ;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "speed", referencedColumnName = "id")
    private VariationOption speed;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gpu", referencedColumnName = "id")
    private VariationOption gpu;

}
