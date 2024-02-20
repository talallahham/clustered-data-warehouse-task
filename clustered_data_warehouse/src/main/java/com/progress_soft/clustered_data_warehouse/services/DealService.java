package com.progress_soft.clustered_data_warehouse.services;

import com.progress_soft.clustered_data_warehouse.dto.DealDto;
import com.progress_soft.clustered_data_warehouse.entities.Deal;
import com.progress_soft.clustered_data_warehouse.repos.DealRepo;
import com.progress_soft.clustered_data_warehouse.utils.CurrencyCodes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class DealService {
    @Autowired
    private DealRepo dealRepo;

    CurrencyCodes currencyCodes = new CurrencyCodes();

    public void validateDealData(DealDto payload) {
        log.info("In 'validateDealData()' function: receiving payload {}", payload);

        // ID Check
        log.info("In 'validateDealData()' function: entering id check. For id={}", payload.getId());
        if(payload.getId() == null) {
            log.info("In 'validateDealData()' function: id check failed, cause ID is null/blank. For id={}", payload.getId());
            throw new RuntimeException("ID must not be null");
        }

        try {
            long id = Long.parseLong(payload.getId());
            if(id < 0) {
                log.info("In 'validateDealData()' function: id check failed, cause ID is negative. For id={}", payload.getId());
                throw new Exception();
            }

        } catch (Exception e) {
            log.info("In 'validateDealData()' function: id check failed, cause ID is not a number or negative. For id={}", payload.getId());
            throw new RuntimeException("Invalid ID. ID must be a positive integer number");
        }
        log.info("In 'validateDealData()' function: passing id check. For id={}", payload.getId());
        // #######

        // From currency ISO code Check
        log.info("In 'validateDealData()' function: entering fromCurrencyISO check. For fromCurrencyIsoCode={}", payload.getFromCurrencyIsoCode());
        if(payload.getFromCurrencyIsoCode() == null || payload.getFromCurrencyIsoCode().isEmpty()) {
            log.info("In 'validateDealData()' function: fromCurrencyISO check failed, cause fromCurrencyISO is is null/blank. For fromCurrencyISO={}", payload.getFromCurrencyIsoCode());
            throw new RuntimeException("Invalid ISO code. (From currency ISO code must not be null)");
        }

        if(currencyCodes.getIsoCode(payload.getFromCurrencyIsoCode()).equals("false")) {
            log.info("In 'validateDealData()' function: fromCurrencyISO check failed, cause fromCurrencyISO is is not valid ISO code. For fromCurrencyISO={}", payload.getFromCurrencyIsoCode());
            throw new RuntimeException("Invalid ISO code. (From currency ISO code, must be a valid ISO code)");
        }
        log.info("In 'validateDealData()' function: passing fromCurrencyISO check. For fromCurrencyISO={}", payload.getFromCurrencyIsoCode());
        // ##############

        // To currency ISO code Check
        log.info("In 'validateDealData()' function: entering toCurrencyISO check. For toCurrencyISO={}", payload.getToCurrencyIsoCode());
        if(payload.getToCurrencyIsoCode() == null || payload.getToCurrencyIsoCode().isEmpty()) {
            log.info("In 'validateDealData()' function: toCurrencyISO check failed, cause toCurrencyISO is is not valid ISO code. For toCurrencyISO={}", payload.getToCurrencyIsoCode());
            throw new RuntimeException("Invalid ISO code. (To currency ISO code must not be null)");
        }

        if(currencyCodes.getIsoCode(payload.getToCurrencyIsoCode()).equals("false")) {
            log.info("In 'validateDealData()' function: toCurrencyISO check failed, cause toCurrencyISO is is not valid ISO code. For toCurrencyISO={}", payload.getToCurrencyIsoCode());
            throw new RuntimeException("Invalid ISO code. (To currency ISO code, must be a valid ISO code)");
        }
        log.info("In 'validateDealData()' function: passing toCurrencyISO check. For toCurrencyISO={}", payload.getToCurrencyIsoCode());
        // ##############

        // Timestamp Check
        log.info("In 'validateDealData()' function: entering timestamp check. For timestamp={}", payload.getTimestamp());
        if(payload.getTimestamp() == null) {
            log.info("In 'validateDealData()' function: timestamp failed, cause timestamp is null/blank. For timestamp={}", payload.getTimestamp());
            throw new RuntimeException("Timestamp must not be null");
        }

        try {
            LocalDateTime.parse(payload.getTimestamp());
        } catch (Exception e) {
            log.info("In 'validateDealData()' function: timestamp failed, cause timestamp is not valid date that uses ISO8601 format. For timestamp={}", payload.getTimestamp());
            throw new RuntimeException("Invalid Timestamp. Use ISO8601 format for the timestamp: {YYYY}-{MM}-{DD}T{HOURS}:{MINUTES}:{SECONDS}.{MILLISECONDS}");
        }
        log.info("In 'validateDealData()' function: passing timestamp check. For timestamp={}", payload.getTimestamp());
        // #######

        // Deal amount Check
        log.info("In 'validateDealData()' function: entering dealAmount check. For dealAmount={}", payload.getDealAmount());
        if(payload.getDealAmount() == null) {
            log.info("In 'validateDealData()' function: dealAmount check failed, cause dealAmount is null/blank. For dealAmount={}", payload.getDealAmount());
            throw new RuntimeException("Deal amount must not be null");
        }

        try {
            double dealAmount = Double.parseDouble(payload.getDealAmount());
            if(dealAmount < 0) {
                log.info("In 'validateDealData()' function: dealAmount check failed, cause dealAmount is negative. For dealAmount={}", payload.getDealAmount());
                throw new Exception();
            }

        } catch (Exception e) {
            log.info("In 'validateDealData()' function: dealAmount check failed, cause dealAmount is not a number or negative. For id={}", payload.getDealAmount());
            throw new RuntimeException("Invalid Deal amount. Deal amount must be a positive float number");
        }
        log.info("In 'validateDealData()' function: passing dealAmount check. For dealAmount={}", payload.getDealAmount());
        // #######
    }

    public void saveDeal(DealDto payload) {
        log.info("In 'saveDeal()' function: receiving payload {}", payload);

        Long id = Long.parseLong(payload.getId());
        if(dealRepo.findById(id).isPresent()) {
            log.info("In 'saveDeal()' function: saving data was failed, cause ID has been found in the DB. For id={}", payload.getId());
            throw new RuntimeException("Deal with same ID already found");
        }

        Deal deal = new Deal(
                id,
                currencyCodes.getIsoCode(payload.getFromCurrencyIsoCode()),
                currencyCodes.getIsoCode(payload.getToCurrencyIsoCode()),
                LocalDateTime.parse(payload.getTimestamp()),
                Double.parseDouble(payload.getDealAmount())
        );

        dealRepo.save(deal);
        log.info("In 'saveDeal()' function: passing duplicate detection test and saving payload data in the DB");
    }
}
