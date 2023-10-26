package ${{values.java_package_name}}.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping(name = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    @CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.OPTIONS })
    public ResponseEntity<String> index(HttpServletRequest request) {

        return ResponseEntity.ok("I'm alive!");
    }
}
