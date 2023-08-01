package tan.le.shop1.entities.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "inventory")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Inventory implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    @JsonIgnore
    private Products product;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "memory", referencedColumnName = "id")
    private VariationOption memory;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "color", referencedColumnName = "id")
    private VariationOption color ;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "promotion", referencedColumnName = "id")
    @JsonIgnore
    private ProductPromotion promotion;

    @NotNull
    private Double price;

    @Column(name = "is_default", columnDefinition = "boolean default false")
    private Boolean isDefault;

    private Integer inventory;

    @CreationTimestamp
    private LocalDateTime createAt;

    @UpdateTimestamp
    private LocalDateTime modifierAt;


}
