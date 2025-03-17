package springsecurity.bankapp.section2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/notices")
    private String getNoticeDetails(){
        return "Here are notice details from db";
    }
}
