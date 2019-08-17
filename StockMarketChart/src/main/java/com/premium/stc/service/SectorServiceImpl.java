package com.premium.stc.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.stc.dao.SectorDao;
import com.premium.stc.model.Sector;
@Service
public class SectorServiceImpl implements SectorService {
	@Autowired
	private SectorDao sectorDao;
	public Sector Insert(Sector sector) throws ClassNotFoundException, SQLException {
		return sectorDao.Insert(sector) ;
	}

	public List<Sector> GetAllSector() throws ClassNotFoundException, SQLException {
		return sectorDao.GetAllSector();
	}

}
