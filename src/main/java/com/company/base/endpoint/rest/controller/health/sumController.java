package com.company.base.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class sumController {

    @GetMapping("/sum")
    public BigInteger sommeArbitraire(
            @RequestParam("a") String a,
            @RequestParam("b") String b) {
        BigInteger bigIntA = new BigInteger(a);
        BigInteger bigIntB = new BigInteger(b);

        BigInteger somme = bigIntA.add(bigIntB);

        return somme;
    }
}
