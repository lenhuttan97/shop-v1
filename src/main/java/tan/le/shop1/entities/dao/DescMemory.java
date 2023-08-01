package tan.le.shop1.entities.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Table(name = "desc_memory")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DescMemory implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "ram", referencedColumnName = "id")
//    private VariationOption ram;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "rom", referencedColumnName = "id")
//    private VariationOption rom ;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sd", referencedColumnName = "id")
    private VariationOption sd;
}
