package Bendispository.Abschlussprojekt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class LoginController {
    @RequestMapping(value="/username", method = RequestMethod.GET)
    @ResponseBody
    public String currentUsername(HttpServletRequest request ) {
        Principal principal = request.getUserPrincipal();

        return principal.getName();

    }
}