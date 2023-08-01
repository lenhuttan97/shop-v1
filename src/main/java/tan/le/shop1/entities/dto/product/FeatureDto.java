package tan.le.shop1.entities.dto.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FeatureDto {

    private Integer Id;

    private String title;

    private String content;

    private String image;
}
