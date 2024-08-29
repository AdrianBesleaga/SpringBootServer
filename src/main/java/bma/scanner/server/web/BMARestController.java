package bma.scanner.server.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@Slf4j
public class BMARestController {

    @GetMapping
    public String get() {
        log.debug("GetRequest");
        return "";
    }

    @PostMapping
    public String post(@RequestBody String requestBody) {
        log.debug("PostRequest: {}", requestBody);
        return requestBody;
    }

    @PutMapping
    public String put(@RequestBody String requestBody) {
        log.debug("PutRequest: {}", requestBody);
        return requestBody;
    }
}
