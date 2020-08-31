package com.sebastian.zemogatest.portfolio.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PortfolioControllerTest {

	@Autowired
	private PortfolioController portfolioController;

	@Test
	public void contexLoads() throws Exception {
		assertThat(portfolioController).isNotNull();
	}

}
