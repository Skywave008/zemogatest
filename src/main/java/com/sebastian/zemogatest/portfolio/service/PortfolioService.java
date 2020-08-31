package com.sebastian.zemogatest.portfolio.service;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sebastian.zemogatest.portfolio.entity.Portfolio;
import com.sebastian.zemogatest.portfolio.repository.PortfolioRepository;

@Service("portfolioService")
public class PortfolioService {

	@Autowired
	@Qualifier("portfolioRepository")
	private PortfolioRepository portfolioRepository;

	@PersistenceContext
	private EntityManager em;

	public Portfolio getPortfolioById(final Integer id) {
		final Portfolio portfolio = Optional.ofNullable(portfolioRepository.findById(id)).get();
		return portfolio;
	}

	public Portfolio updatePortfolio(final Portfolio portfolio) {
		final Portfolio updatedPortfolio = portfolioRepository.save(portfolio);
		return updatedPortfolio;
	}

}
