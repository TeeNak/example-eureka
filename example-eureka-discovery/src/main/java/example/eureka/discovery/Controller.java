package example.eureka.discovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by teenak on 12/09/15.
 */
@RestController
public class Controller {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired ItemClient itemClient;




    public String getItems() {
        List<Book> items = itemClient.getItems();
        StringBuilder sb = new StringBuilder();
        for( Book item : items) {

            sb.append("id = " + item.getId() + "\n");
            sb.append("title = " + item.getTitle() + "\n");
            sb.append("author = " + item.getAuthor() + "\n");

            sb.append("\n");
        }
        return sb.toString();

    }

    @RequestMapping("/")
    public String home() {
        return "Retrieved items are : <pre>" + getItems() + "</pre>";
    }



}
