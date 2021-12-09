package com.bank.credit.service;

import com.bank.credit.model.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {
    public Flux<Credit> findAllService();
    public Mono<Credit> findByCreditService(String idClient);
    public Mono<Credit> saveCreditService(Credit credit);
    public Mono<Void> deleteCreditService(String idClient);

}
