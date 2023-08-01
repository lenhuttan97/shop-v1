package tan.le.shop1.entities.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Table(name = "desc")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Desc  implements Serializable {

    private static final long serialVersionUID = -8832862623919132232L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "specification", referencedColumnName = "id")
    private Specification specification;

    @OneToMany(mappedBy = "desc", cascade = CascadeType.ALL)
    private List<DescFeature> features;
}
