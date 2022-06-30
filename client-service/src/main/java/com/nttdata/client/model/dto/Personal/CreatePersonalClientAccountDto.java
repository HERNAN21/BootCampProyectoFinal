package com.nttdata.client.model.dto.Personal;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class CreatePersonalClientAccountDto {

    @Id
    private String accountId;
    private String accountType;
    private String accountUrl;
    private String accountIsoCurrencyCode;

    private String accountFk_insertionUser;
    private String accountInsertionTerminal;

}