package com.sebastian.zemogatest.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sebastian.zemogatest.portfolio.entity.Portfolio;
import com.sebastian.zemogatest.portfolio.service.PortfolioService;

@RestController
public class RestApiPortfolio {

	@Autowired
	@Qualifier("portfolioService")
	private PortfolioService portfolioService;

	@GetMapping("/getPortfolio")
	public Portfolio getPortfolio(@RequestParam(value = "id") final Integer id) {
		return portfolioService.getPortfolioById(id);
	}

	@PostMapping("/updatePortfolio")
	public Portfolio updatePortfolio(@RequestParam(value = "id") final Integer id,
			@RequestParam(value = "description") final String description,
			@RequestParam(value = "image") final String image,
			@RequestParam(value = "twitterUserName") final String twitterUserName,
			@RequestParam(value = "title") final String title) {
		final Portfolio newDataPortfolio = new Portfolio();
		newDataPortfolio.setIdportfolio(id);
		newDataPortfolio.setDescription(description);
		newDataPortfolio.setImage(image);
		newDataPortfolio.setTwitterUserName(twitterUserName);
		newDataPortfolio.setTitle(title);
		return portfolioService.updatePortfolio(newDataPortfolio);
	}

}
