package com.nttdata.client.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DocumentType {

    private String name;
    private int maxLength;
    private int minLength;

}
