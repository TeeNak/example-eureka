package example.eureka.discovery;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by teenak on 12/09/15.
 */
@FeignClient("EXAMPLE-EUREKA-CLIENT")
public interface ItemClient {
    @RequestMapping(method = RequestMethod.GET, value = "/items")
    List<Book> getItems();

}
