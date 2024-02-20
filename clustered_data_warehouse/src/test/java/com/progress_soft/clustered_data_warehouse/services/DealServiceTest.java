package com.progress_soft.clustered_data_warehouse.services;

import com.progress_soft.clustered_data_warehouse.dto.DealDto;
import com.progress_soft.clustered_data_warehouse.entities.Deal;
import com.progress_soft.clustered_data_warehouse.repos.DealRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class DealServiceTest {
    @Mock
    private DealRepo dealRepo;

    @InjectMocks
    private DealService dealService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void invalidId_0() {
        DealDto payload = new DealDto();
        payload.setId("-123");
        payload.setFromCurrencyIsoCode("USD");
        payload.setToCurrencyIsoCode("EUR");
        payload.setTimestamp("2024-02-19T12:30:00");
        payload.setDealAmount("100.50");

        assertThrows(RuntimeException.class, () -> dealService.validateDealData(payload));
    }

    @Test
    void invalidId_1() {
        DealDto payload = new DealDto();
        payload.setId("abc");
        payload.setFromCurrencyIsoCode("USD");
        payload.setToCurrencyIsoCode("EUR");
        payload.setTimestamp("2024-02-19T12:30:00");
        payload.setDealAmount("100.50");

        assertThrows(RuntimeException.class, () -> dealService.validateDealData(payload));
    }

    @Test
    void invalidId_2() {
        DealDto payload = new DealDto();
        payload.setId("abc123");
        payload.setFromCurrencyIsoCode("USD");
        payload.setToCurrencyIsoCode("EUR");
        payload.setTimestamp("2024-02-19T12:30:00");
        payload.setDealAmount("100.50");

        assertThrows(RuntimeException.class, () -> dealService.validateDealData(payload));
    }

    @Test
    void invalidFromCurrencyISO_0() {
        DealDto payload = new DealDto();
        payload.setId("123");
        payload.setFromCurrencyIsoCode("ABC");
        payload.setToCurrencyIsoCode("EUR");
        payload.setTimestamp("2024-02-19T12:30:00");
        payload.setDealAmount("100.50");

        assertThrows(RuntimeException.class, () -> dealService.validateDealData(payload));
    }

    @Test
    void invalidFromCurrencyISO_1() {
        DealDto payload = new DealDto();
        payload.setId("123");
        payload.setFromCurrencyIsoCode("123");
        payload.setToCurrencyIsoCode("EUR");
        payload.setTimestamp("2024-02-19T12:30:00");
        payload.setDealAmount("100.50");

        assertThrows(RuntimeException.class, () -> dealService.validateDealData(payload));
    }

    @Test
    void invalidTimestamp() {
        DealDto payload = new DealDto();
        payload.setId("123");
        payload.setFromCurrencyIsoCode("JOD");
        payload.setToCurrencyIsoCode("EUR");
        payload.setTimestamp("2022-03-11");
        payload.setDealAmount("100.50");

        assertThrows(RuntimeException.class, () -> dealService.validateDealData(payload));
    }

    @Test
    void invalidDealAmount_0() {
        DealDto payload = new DealDto();
        payload.setId("123");
        payload.setFromCurrencyIsoCode("JOD");
        payload.setToCurrencyIsoCode("EUR");
        payload.setTimestamp("2024-02-19T12:30:00");
        payload.setDealAmount("abc");

        assertThrows(RuntimeException.class, () -> dealService.validateDealData(payload));
    }

    @Test
    void invalidDealAmount_1() {
        DealDto payload = new DealDto();
        payload.setId("123");
        payload.setFromCurrencyIsoCode("JOD");
        payload.setToCurrencyIsoCode("EUR");
        payload.setTimestamp("2024-02-19T12:30:00");
        payload.setDealAmount("-203.56");

        assertThrows(RuntimeException.class, () -> dealService.validateDealData(payload));
    }

    @Test
    void invalidDealAmount_2() {
        DealDto payload = new DealDto();
        payload.setId("123");
        payload.setFromCurrencyIsoCode("JOD");
        payload.setToCurrencyIsoCode("EUR");
        payload.setTimestamp("2024-02-19T12:30:00");
        payload.setDealAmount("-2abc.65");

        assertThrows(RuntimeException.class, () -> dealService.validateDealData(payload));
    }

    @Test
    void missingId() {
        DealDto payload = new DealDto();
        payload.setFromCurrencyIsoCode("JOD");
        payload.setToCurrencyIsoCode("EUR");
        payload.setTimestamp("2024-02-19T12:30:00");
        payload.setDealAmount("-2abc.65");

        assertThrows(RuntimeException.class, () -> dealService.validateDealData(payload));
    }

    @Test
    void missingFromCurrencyIsoCode() {
        DealDto payload = new DealDto();
        payload.setId("123");
        payload.setToCurrencyIsoCode("EUR");
        payload.setTimestamp("2024-02-19T12:30:00");
        payload.setDealAmount("-2abc.65");

        assertThrows(RuntimeException.class, () -> dealService.validateDealData(payload));
    }

    @Test
    void missingToCurrencyIsoCode() {
        DealDto payload = new DealDto();
        payload.setId("123");
        payload.setFromCurrencyIsoCode("JOD");
        payload.setTimestamp("2024-02-19T12:30:00");
        payload.setDealAmount("-2abc.65");

        assertThrows(RuntimeException.class, () -> dealService.validateDealData(payload));
    }

    @Test
    void missingTimestamp() {
        DealDto payload = new DealDto();
        payload.setId("123");
        payload.setFromCurrencyIsoCode("JOD");
        payload.setToCurrencyIsoCode("EUR");
        payload.setDealAmount("-2abc.65");

        assertThrows(RuntimeException.class, () -> dealService.validateDealData(payload));
    }

    @Test
    void missingDealAmount() {
        DealDto payload = new DealDto();
        payload.setId("123");
        payload.setFromCurrencyIsoCode("JOD");
        payload.setToCurrencyIsoCode("EUR");
        payload.setTimestamp("2024-02-19T12:30:00");

        assertThrows(RuntimeException.class, () -> dealService.validateDealData(payload));
    }

    @Test
    void duplicatedId() {
        DealDto payload = new DealDto();
        payload.setId("1");
        when(dealRepo.findById(1L)).thenReturn(java.util.Optional.of(new Deal()));

        assertThrows(RuntimeException.class, () -> dealService.saveDeal(payload));
        verify(dealRepo, never()).save(any());
    }

    @Test
    void validData_0() {
        DealDto payload = new DealDto();
        payload.setId("1");
        payload.setFromCurrencyIsoCode("USD");
        payload.setToCurrencyIsoCode("EUR");
        payload.setTimestamp("2024-02-19T12:30:00");
        payload.setDealAmount("100.50");

        assertDoesNotThrow(() -> dealService.validateDealData(payload));
    }

    @Test
    void validData_1() {
        DealDto payload = new DealDto();
        payload.setId("1");
        payload.setFromCurrencyIsoCode("971");
        payload.setToCurrencyIsoCode("EUR");
        payload.setTimestamp("2024-02-19T12:30:00");
        payload.setDealAmount("100.50");

        assertDoesNotThrow(() -> dealService.validateDealData(payload));
    }

    @Test
    public void successful_save() {
        DealDto payload = new DealDto();
        payload.setId("1");
        payload.setFromCurrencyIsoCode("USD");
        payload.setToCurrencyIsoCode("EUR");
        payload.setTimestamp("2024-02-19T12:30:00");
        payload.setDealAmount("100.50");

        when(dealRepo.findById(1L)).thenReturn(java.util.Optional.empty());

        assertDoesNotThrow(() -> dealService.saveDeal(payload));

        verify(dealRepo, times(1)).save(any());
    }
}
