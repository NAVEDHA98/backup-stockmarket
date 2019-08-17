package com.premium.stc.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.premium.stc.model.Sector;
@Repository
public class SectorDaoImpl implements SectorDao{

	public static Connection Connect() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.jdbc.Driver"); 
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
		System.out.println("connect");
		return con;  
	}

	public Sector Insert(Sector sector) throws ClassNotFoundException, SQLException {
		
		Connection con=Connect();
		PreparedStatement stmt=con.prepareStatement("Insert into SECTORS(sector_name,brief) values(?,?)");
		stmt.setString(1, sector.getName());
		stmt.setString(2, sector.getBrief());
		System.out.println(stmt.execute());
		return null;
	}


	public List<Sector> GetAllSector() throws ClassNotFoundException, SQLException {
		Connection con=Connect();
		PreparedStatement stmt=con.prepareStatement("Select * from sectors");
		ResultSet rs=stmt.executeQuery();
		List<Sector> list=new ArrayList<Sector>();
		while(rs.next()) 
		{
			Sector sector=new Sector();
			sector.setId(rs.getInt(1));
			sector.setName(rs.getString(2));
			sector.setBrief(rs.getString(3));  
			list.add(sector);
		
		}
		return list;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Sector sector=new Sector();
		sector.setName("hardware");
		sector.setBrief("easy");
		SectorDaoImpl sec=new SectorDaoImpl();
		sec.Insert(sector);
		List<Sector> list=sec.GetAllSector();
		for(Sector s:list)
		{
			System.out.println(s);
		}
		
	}

}
