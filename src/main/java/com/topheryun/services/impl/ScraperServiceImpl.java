package com.topheryun.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.topheryun.daos.IScraperDAO;
import com.topheryun.models.Mouse;
import com.topheryun.services.IScraperService;

public class ScraperServiceImpl implements IScraperService {

	private IScraperDAO scraperDAO;
	
	@Autowired
	public ScraperServiceImpl(IScraperDAO scraperDAO) {
		this.scraperDAO = scraperDAO;
	}
	
	@Override
	public void insertMouse(Mouse mouse) {
		scraperDAO.saveAndFlush(mouse);
	}

}
