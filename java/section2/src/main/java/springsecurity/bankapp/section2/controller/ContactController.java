package springsecurity.bankapp.section2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/contact")
    private String getContactDetails(){
        return "Here are contact details from db";
    }
}
