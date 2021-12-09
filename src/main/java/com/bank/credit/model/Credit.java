package com.bank.credit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor

@Data
@Document(collection = "credit")
public class Credit {
    @Id
    public String idClient;
    public String numCredit;
    public Date date;
}
