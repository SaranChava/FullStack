package org.springsecurity.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springsecurity.dto.contact;

@RestController
public class ContactController {

    @PostMapping("/contact")
    public String saveContact(){
        return "Contact details saved along with note";
    }
}
