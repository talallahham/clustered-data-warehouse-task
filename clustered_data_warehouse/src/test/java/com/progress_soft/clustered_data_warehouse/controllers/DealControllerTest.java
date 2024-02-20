package com.progress_soft.clustered_data_warehouse.controllers;

import com.progress_soft.clustered_data_warehouse.dto.DealDto;
import com.progress_soft.clustered_data_warehouse.services.DealService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.validation.ConstraintViolationException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;

public class DealControllerTest {

    @Mock
    private DealService dealService;

    @InjectMocks
    private DealController dealController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void success() {
        DealDto payload = new DealDto();
        ResponseEntity<String> response = dealController.saveDeal(payload);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Deal saved successfully", response.getBody());
    }

    @Test
    public void failed() {
        DealDto payload = new DealDto();
        doThrow(new ConstraintViolationException("Validation failed", null)).when(dealService).validateDealData(any());

        ResponseEntity<String> response = dealController.saveDeal(payload);

        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());
    }
}