package com.progress_soft.clustered_data_warehouse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DealDto {
    String id;
    String fromCurrencyIsoCode;
    String toCurrencyIsoCode;
    String timestamp;
    String dealAmount;
}
