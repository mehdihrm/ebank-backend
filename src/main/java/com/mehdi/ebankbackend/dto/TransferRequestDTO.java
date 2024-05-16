package com.mehdi.ebankbackend.dto;

import lombok.Data;

import java.util.List;
@Data
public class TransferRequestDTO {
    private String accountSource;
    private String accountDestination;
    private double amount;
    private String description;
}
