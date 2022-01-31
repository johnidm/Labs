package api.tistech.controllers;

import api.tistech.model.Authentication;
import api.tistech.model.Token;
import api.tistech.service.TokenAuthenticationService;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "Login")
@RequestMapping(path = "/authentication")
public class AuthenticationController {

    @PostMapping(path = "")
    public ResponseEntity login(@RequestBody Authentication body) {
        if ((body.getUsername().equals("tistech")) && (body.getPassword().equals("1234"))) {
            String jwt = TokenAuthenticationService.generateToken(body.getUsername());

            Token token = new Token();
            token.setToken(jwt);

            return ResponseEntity.status(HttpStatus.CREATED).body(token);
        }

        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
}
