#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class GreeterSayRequestVO {

    @Schema(description = "用户名", requiredMode = Schema.RequiredMode.REQUIRED, example = "Tom")
    @NotBlank
    private String name;
}
