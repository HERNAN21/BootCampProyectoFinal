package com.nttdata.client.model.dto.Enterprice;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class UpdateEnterpriseClientAccountDto {

    @Id
    private String accountId;
    private String accountType;
    private String accountUrl;
    private String accountIsoCurrencyCode;

    /*private short accountRegistrationStatus;
    private Date accountInsertionDate;
    private String accountFk_insertionUser;
    private String accountInsertionTerminal;*/

}