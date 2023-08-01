package tan.le.shop1.entities.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Table(name = "desc_camera")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DescCamera implements Serializable {

    private static final long serialVersionUID = -8832862623919132232L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "position", referencedColumnName = "id")
    private VariationOption position;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "resolution", referencedColumnName = "id")
    private VariationOption resolution ;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "video", referencedColumnName = "id")
    private VariationOption video;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "flash", referencedColumnName = "id")
    private VariationOption flash;


    @OneToMany(mappedBy = "descCamera", fetch = FetchType.LAZY)
    private List<DescCameraFeature> features;

}
