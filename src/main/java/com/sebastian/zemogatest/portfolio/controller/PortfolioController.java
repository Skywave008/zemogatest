package com.sebastian.zemogatest.portfolio.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sebastian.zemogatest.portfolio.constant.ViewConstant;
import com.sebastian.zemogatest.portfolio.entity.Portfolio;
import com.sebastian.zemogatest.portfolio.service.PortfolioService;
import com.sebastian.zemogatest.portfolio.service.TwitterService;

@Controller
public class PortfolioController {

	private static final Log LOGGER = LogFactory.getLog(PortfolioController.class);

	@Autowired
	@Qualifier("portfolioService")
	private PortfolioService portfolioService;

	@Autowired
	@Qualifier("twitterService")
	private TwitterService twitterService;

	@RequestMapping({ "/" })
	public ModelAndView returnAdminView() {
		final Integer id = 634377;
		final ModelAndView mav = new ModelAndView(ViewConstant.PORTFOLIO);
		LOGGER.info("Getting tweets" + twitterService.getTweetsTimeline());
		LOGGER.info("Getting portfolio with id: "+ id);
		final Portfolio portfolio = portfolioService.getPortfolioById(id);
		mav.addObject("tweets", twitterService.getTweetsTimeline());
		mav.addObject("portfolio", portfolio);
		return mav;
	}

}
