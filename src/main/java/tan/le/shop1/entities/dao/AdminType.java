package tan.le.shop1.entities.dao;

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

@Table(name = "admin_type")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminType implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Amdin Type cannot be null")
    private String amdinType;
    @NotNull
    private String permit;

    @CreationTimestamp
    private LocalDateTime createAt;

    @UpdateTimestamp
    private LocalDateTime modifierAt;

    @OneToOne(mappedBy = "adminType", fetch = FetchType.LAZY)
    private AdminUser adminUser;
}
