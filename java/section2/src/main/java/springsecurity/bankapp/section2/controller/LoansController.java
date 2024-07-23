package springsecurity.bankapp.section2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/myLoans")
    private String getLoanDetails(){
        return "Here are loa details from db";
    }
}
