package com.bank.credit.service.impl;

import com.bank.credit.model.Credit;
import com.bank.credit.repository.CreditRepository;
import com.bank.credit.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CreditServiceImpl implements CreditService {

    @Autowired
    private CreditRepository creditRepository;

    @Override
    public Flux<Credit> findAllService() {
        return creditRepository. findAll();
    }

    @Override
    public Mono<Credit> findByCreditService(String idClient) {
        return creditRepository.findById(idClient);
    }

    @Override
    public Mono<Credit> saveCreditService(Credit credit) {
        return creditRepository.save(credit);
    }

    @Override
    public Mono<Void> deleteCreditService(String idClient) {
        return creditRepository.deleteById(idClient);
    }
}
