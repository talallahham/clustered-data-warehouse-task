package com.progress_soft.clustered_data_warehouse.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Deal {
    @Id
    Long id;
    String fromCurrencyIsoCode;
    String toCurrencyIsoCode;
    LocalDateTime timestamp;
    Double dealAmount; //In ordering currency code.
}
