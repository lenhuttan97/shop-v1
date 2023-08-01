package tan.le.shop1.entities.dao;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Table(name = "specification")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Specification implements Serializable {

    private static final long serialVersionUID = -8832862623919132232L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "screen", referencedColumnName = "id")
    private DescScreen screen;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "camera", referencedColumnName = "id")
    private DescCamera camera;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cpu_os", referencedColumnName = "id")
    private DescCPUAndOS cpuAndOs;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "memory", referencedColumnName = "id")
    private DescMemory memory;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "connect", referencedColumnName = "id")
    private DescConnect connect;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pin", referencedColumnName = "id")
    private DescPin pin;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "utility", referencedColumnName = "id")
    private DescUtility utility;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "summary", referencedColumnName = "id")
    private DescSummary summary;
}
