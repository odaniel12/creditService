package com.bank.credit.controller;

import com.bank.credit.model.Credit;
import com.bank.credit.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/creditBank")

public class CreditController {
    @Autowired
    private CreditService creditService;

    @GetMapping("/findAllCredit")
    public Flux<Credit> finAll(){
        return creditService.findAllService();
    }

    @GetMapping("/findCredit/{idClient}")
    public Mono<Credit> findByCredit(@PathVariable("idClient") String idClient) {
        return creditService.findByCreditService(idClient);

    }
    @PostMapping("/save")
    public Mono<Credit> saveCredit(@Validated @RequestBody Credit credit){
        return creditService.saveCreditService(credit);
    }

    @DeleteMapping("/delete/{idClient}")
    public Mono<Void> deleteCredit(@PathVariable("idClient") String idClient){
        return creditService.deleteCreditService(idClient);
    }
}
