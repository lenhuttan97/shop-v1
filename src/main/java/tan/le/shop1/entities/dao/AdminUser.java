package tan.le.shop1.entities.dao;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tan.le.shop1.enums.LoginStatus;
import tan.le.shop1.enums.converter.EnumsLoginStatusConverter;

@Table(name = "admin_user")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminUser implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@NotNull
	private String fullName;
	
//	@NotNull
	@Convert(converter = EnumsLoginStatusConverter.class)
	private LoginStatus status;
	
	@NotNull
	private String password;
	
//	@NotNull
	@Column(unique = true)
	private String username;
	
//	private Long type;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id", referencedColumnName = "id")
	@JsonIgnore
    private AdminType adminType;
	
	@CreationTimestamp
	private LocalDateTime createAt;
	
	@UpdateTimestamp
	private LocalDateTime modifierAt;
	
	
	private LocalDateTime lastLogin;
}
