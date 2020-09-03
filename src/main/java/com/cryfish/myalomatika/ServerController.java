package com.cryfish.myalomatika;

import com.cryfish.myalomatika.audio.Sound;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.apache.log4j.Logger;

import java.io.InputStream;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ServerController {
    private static final Logger log = Logger.getLogger(ServerController.class);

    @RequestMapping("/")
    String home() {
        return "Server is available";
    }

    @RequestMapping("/getVoice")
    InputStream getVoice(@RequestParam("number") String number,
                         @RequestParam("speed") double speed) {
        log.info("Number: " + number);
        log.info("Speed: " + speed);

        return Sound.getVoice(number, speed);
    }
}
