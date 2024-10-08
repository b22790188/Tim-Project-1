package org.example.stylish.dto.productDto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfoListDto {
    private List<ProductInfoDto> data;

    @JsonProperty("next_paging")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer nextPaging;
}
