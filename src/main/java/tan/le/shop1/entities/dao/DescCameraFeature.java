package tan.le.shop1.entities.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Table(name="camera_feature")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DescCameraFeature implements Serializable {

    private static final long serialVersionUID = -8832862623919132232L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "desc_camera", referencedColumnName = "id")
    @JsonIgnore
    private DescCamera descCamera;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "feature", referencedColumnName = "id")
    private VariationOption feature;
}
