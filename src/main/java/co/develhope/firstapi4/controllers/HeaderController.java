package co.develhope.firstapi4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/headers")

public class HeaderController {

    @GetMapping("/view")
    public String getHost(@RequestHeader(name = "host") String host){
        String[] hostInfo = host.split(":");
        return "Host name: "+hostInfo[0]+" \nHost port: "+hostInfo[1];
    }
}