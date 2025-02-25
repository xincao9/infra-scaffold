#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 信息
 */
@Data
@Component
@ConfigurationProperties("app")
public class AppProperties {

    /**
     * 应用名
     */
    private String name;
    /**
     * 版本
     */
    private String version;
    /**
     * 作者
     */
    private String creater;

}
