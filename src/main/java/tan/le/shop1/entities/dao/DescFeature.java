package tan.le.shop1.entities.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Table(name = "feature")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DescFeature implements Serializable {
    private static final long serialVersionUID = -8832862623919132232L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String title;

    private String content;

    private String image;

    @ManyToOne(optional = false,cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "desc", referencedColumnName = "id")
    @JsonIgnore
    private Desc desc;
}
