#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import ${package}.client.GitHubClient;
import ${package}.client.dto.Contributor;
import feign.Request;
import fun.golinks.core.annotate.FeginResource;
import fun.golinks.core.exception.FeignClientException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 演示，调用三方http接口的方式
 */
@RequestMapping("github")
@RestController
public class GithubController {

    @FeginResource
    private GitHubClient gitHubClient;

    @GetMapping("contributors")
    public List<Contributor> contributors() throws FeignClientException {
        return gitHubClient.contributors("xincao9", "infra-framework", new Request.Options(1000, 500));
    }
}
