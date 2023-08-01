package tan.le.shop1.entities.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Table(name = "product_promotion")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductPromotion implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "product", referencedColumnName = "id")
    @JsonIgnore
    private Products product;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "inventory", referencedColumnName = "id")
    @JsonIgnore
    private Inventory inventory;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "promotion", referencedColumnName = "id")
    @JsonIgnore
    private Promotion promotion;

}
