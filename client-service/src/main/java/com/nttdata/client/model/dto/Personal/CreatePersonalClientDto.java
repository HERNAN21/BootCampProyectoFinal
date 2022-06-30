package com.nttdata.client.model.dto.Personal;

import com.nttdata.client.model.GenericProduct;
import lombok.Data;

import java.util.List;

@Data
public class CreatePersonalClientDto {
    private String documentType;
    private String documentNumber;
    private String firstName;
    private String lastName;
    private String residenceAddress;
    private List<GenericProduct> accounts;
    private String profile;
    
    private String fk_insertionUser;
    private String insertionTerminal;

}