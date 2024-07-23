package springsecurity.bankapp.section2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/myCards")
    private String getCardDetails(){
        return "Here are cards details from db";
    }
}
