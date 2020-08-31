package com.sebastian.zemogatest.portfolio.service;

import java.util.NoSuchElementException;
import java.util.Objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sebastian.zemogatest.portfolio.entity.Portfolio;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PortfolioServiceTest {

	final Integer EXISTING_VALUE = 634377;
	final Integer WRONG_VALUE = 00000;

	@Autowired
	@Qualifier("portfolioService")
	private PortfolioService portfolioService;

	@Test
	public void getPortfolioByIdTest() {
		final Portfolio data = portfolioService.getPortfolioById(EXISTING_VALUE);
		Assertions.assertTrue(Objects.nonNull(data.getDescription()));
	}

	@Test
	public void getPortfolioByIdNoElementTest() {
		Assertions.assertThrows(NoSuchElementException.class, () -> {
			portfolioService.getPortfolioById(WRONG_VALUE);
		});
	}
}
