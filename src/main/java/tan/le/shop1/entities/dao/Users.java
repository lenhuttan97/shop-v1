package tan.le.shop1.entities.dao;

import java.io.Serializable;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tan.le.shop1.enums.GenderType;
import tan.le.shop1.enums.converter.EnumsGenderTypeConverter;

@Table (name = "users")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Users implements Serializable{
	
	private static final long serialVersionUID = -8832862623919132232L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String fullName;
	
	@NotNull
	@Email
	@Column(unique = true)
	private String email;
	
	@NotNull
	@Column(unique = true)
	private String phone;
	
	private Date birthOfDay;
	
	private String avatar;
	
	@NotNull
	@Convert(converter = EnumsGenderTypeConverter.class)
	private GenderType gender;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@UpdateTimestamp
	private LocalDateTime ModifierAt;
	
	@OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    private LoginUser loginUser;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Address> address;
	
}
