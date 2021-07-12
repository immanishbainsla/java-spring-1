package com.example.springboot_camel_sample_1;

import com.fasterxml.jackson.core.util.VersionUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Version {

    @GetMapping("/version")
    public String SayVersion(){
        String version = VersionUtil.class.getPackage().getImplementationVersion();
        return (version != null) ? "current project version : " + version : "version ot found";
    }
}
