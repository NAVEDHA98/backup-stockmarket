package com.premium.stc.dao;

import java.util.List;

import com.premium.stc.model.IPOPlaned;

public interface IPOPlanedDao {
 public IPOPlaned Insert(IPOPlaned ipo);
 public List<IPOPlaned> GetAllIPOPlaned(); 
}
