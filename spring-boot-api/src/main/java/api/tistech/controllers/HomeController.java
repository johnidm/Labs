package api.tistech.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Home")
@RequestMapping(path = "/")
public class HomeController {

    @GetMapping("")
    public String index() {
        return "TisTech API running!";
    }

}
