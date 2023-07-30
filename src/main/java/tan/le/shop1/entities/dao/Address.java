package tan.le.shop1.entities.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tan.le.shop1.enums.AddressType;
import tan.le.shop1.enums.converter.EnumsAddressTypeConverter;

import java.io.Serializable;

@Table(name = "address")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable {


    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String line;

    @NotNull
    private String street;

    @NotNull
    private String ward;

    @NotNull
    private String district;

    @NotNull
    private String city;

    @NotNull(message = "address Type cannot be null")
    @Convert(converter = EnumsAddressTypeConverter.class)
    private AddressType type;

    private Boolean isDefault;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
//	@JoinColumns(foreignKey = @ForeignKey(name = "PK_USER"), value = @JoinColumn(referencedColumnName = "id"))
    @JsonIgnore
    private Users user;

}
