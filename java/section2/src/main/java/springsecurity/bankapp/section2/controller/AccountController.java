package springsecurity.bankapp.section2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/myAccount")
    private String getAccountDetails(){
        return "Here are account details from db";
    }
}
