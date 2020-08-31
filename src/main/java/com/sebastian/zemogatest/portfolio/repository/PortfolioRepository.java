package com.sebastian.zemogatest.portfolio.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sebastian.zemogatest.portfolio.entity.Portfolio;

@Repository("portfolioRepository")
public interface PortfolioRepository extends JpaRepository<Portfolio, Serializable> {
	
	public abstract Portfolio findById(Integer id);
}	
