package com.nttdata.client.model.dto.Enterprice;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class CreateEnterpriseClientAccountDto {

    @Id
    private String accountId;
    private String accountType;
    private String accountUrl;
    private String accountIsoCurrencyCode;
    
    private String accountFk_insertionUser;
    private String accountInsertionTerminal;

}