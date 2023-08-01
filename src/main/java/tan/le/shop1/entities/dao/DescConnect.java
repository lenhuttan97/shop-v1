package tan.le.shop1.entities.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Table(name = "desc_connect")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DescConnect implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mobile", referencedColumnName = "id")
    private VariationOption mobile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wifi", referencedColumnName = "id")
    private VariationOption wifi ;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gps", referencedColumnName = "id")
    private VariationOption gps;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bluetooth", referencedColumnName = "id")
    private VariationOption bluetooth;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "charging", referencedColumnName = "id")
    private VariationOption charging ;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "jack", referencedColumnName = "id")
    private VariationOption jack;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orther", referencedColumnName = "id")
    private VariationOption orther;
}
