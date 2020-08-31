package com.sebastian.zemogatest.portfolio;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sebastian.zemogatest.portfolio.entity.Portfolio;
import com.sebastian.zemogatest.portfolio.repository.PortfolioRepository;

@SpringBootTest
public class PortfolioRepositoryTest {

	@Autowired
	private PortfolioRepository portfolioRepository;

	@Test
	public void savePortfolioTest() {
		Portfolio portfolio = new Portfolio();
		portfolio.setIdportfolio(777888);
		portfolio.setDescription("Test description");
		portfolio.setImage("A image");
		portfolio.setTwitterUserName("Test User");
		portfolio.setTitle("Test title");
		portfolio = portfolioRepository.save(portfolio);
		assertThat(portfolioRepository.findById(777888).getDescription()).isEqualTo(portfolio.getDescription());
	}
}
