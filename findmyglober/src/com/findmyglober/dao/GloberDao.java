package com.findmyglober.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.findmyglober.db.DataBaseManager;
import com.findmyglober.vo.GloberVO;

public class GloberDao {

	public List<GloberVO> getGloberByName(String name) {
		String sql = "SELECT GLO.GlbId, GLO.SourceId, GLO.FirstName, GLO.SecondNAme," + 
				   "GLO.MidleName, GLO.LastName, GLO.PhNmbr, GLO.MailAdd, PRO.PrjName, " +
				   "GLO.PicPath, GLO.Quadrant " + 
				   "FROM findglbr.catglobers GLO, findglbr.tblprj PRO, findglbr.tblprjlead LEAD " +
				   "where LEAD.GlbId = GLO.GlbId " +
				   "and PRO.ProjectId = LEAD.ProjectId " +				   		
				   "AND GLO.FirstName LIKE '%" + name + "%'";
		
		List<GloberVO> listGlobers = null;

		try {
			DataBaseManager manager = new DataBaseManager();
			ResultSet resultSet = manager.executeSelect(sql);
			listGlobers = new ArrayList<GloberVO>();

			while (resultSet.next()) {
				GloberVO vo = new GloberVO();

				vo.setGloberId(resultSet.getInt("GlbId"));
				vo.setFirstName(resultSet.getString("FirstName"));
				vo.setSecondName(resultSet.getString("SecondNAme"));
				vo.setMiddleName(resultSet.getString("MidleName"));
				vo.setLastName(resultSet.getString("LastName"));
				vo.setPhoneNumber(resultSet.getString("PhNmbr"));
				vo.setMail(resultSet.getString("MailAdd"));
				vo.setProjectName(resultSet.getString("PrjName"));
				vo.setQuadrant(resultSet.getString("Quadrant"));
				vo.setPicPath(resultSet.getString("PicPath"));

				listGlobers.add(vo);
				vo = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listGlobers;
	}
	
	public List<GloberVO> getGloberByEmail(String globerEmail) {

		ArrayList<GloberVO> listGlobers = new ArrayList<GloberVO>();

		String sql = "SELECT GLO.GlbId, GLO.SourceId, GLO.FirstName, GLO.SecondNAme," + 
				   "GLO.MidleName, GLO.LastName, GLO.PhNmbr, GLO.MailAdd, PRO.PrjName, " + 
				   "GLO.PicPath, GLO.Quadrant " +
				   "FROM findglbr.catglobers GLO, findglbr.tblprj PRO, findglbr.tblprjlead LEAD " +
				   "where LEAD.GlbId = GLO.GlbId " +
				   "AND PRO.ProjectId = LEAD.ProjectId " +				   		
				   "AND GLO.MailAdd LIKE '%" + globerEmail + "%'";
				

		DataBaseManager manager = new DataBaseManager();
		try {
			ResultSet resultSet = manager.executeSelect(sql);
			while (resultSet.next()) {
				GloberVO vo = new GloberVO();

				vo.setGloberId(resultSet.getInt("GlbId"));
				vo.setFirstName(resultSet.getString("FirstName"));
				vo.setSecondName(resultSet.getString("SecondNAme"));
				vo.setMiddleName(resultSet.getString("MidleName"));
				vo.setLastName(resultSet.getString("LastName"));
				vo.setPhoneNumber(resultSet.getString("PhNmbr"));
				vo.setMail(resultSet.getString("MailAdd"));
				vo.setProjectName(resultSet.getString("PrjName"));
				vo.setQuadrant(resultSet.getString("Quadrant"));
				vo.setPicPath(resultSet.getString("PicPath"));

				listGlobers.add(vo);
				vo = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listGlobers;
	}
	
	public List<GloberVO> getGloberByProject(String project) {
		String sql = "SELECT GLO.GlbId, GLO.SourceId, GLO.FirstName, GLO.SecondNAme," + 
				   "GLO.MidleName, GLO.LastName, GLO.PhNmbr, GLO.MailAdd, PRO.PrjName, " +
				   "GLO.PicPath, GLO.Quadrant " +
				   "FROM findglbr.catglobers GLO, findglbr.tblprj PRO, findglbr.tblprjlead LEAD " +
				   "where LEAD.GlbId = GLO.GlbId " +
				   "and PRO.ProjectId = LEAD.ProjectId " +
				   "and PRO.PrjName LIKE '%" + project + "%'";								
								
		List<GloberVO> listGlobers = null;

		try {
			DataBaseManager manager = new DataBaseManager();
			ResultSet resultSet = manager.executeSelect(sql);
			listGlobers = new ArrayList<GloberVO>();

			while (resultSet.next()) {
				GloberVO vo = new GloberVO();

				vo.setGloberId(resultSet.getInt("GlbId"));
				vo.setFirstName(resultSet.getString("FirstName"));
				vo.setSecondName(resultSet.getString("SecondNAme"));
				vo.setMiddleName(resultSet.getString("MidleName"));
				vo.setLastName(resultSet.getString("LastName"));
				vo.setPhoneNumber(resultSet.getString("PhNmbr"));
				vo.setMail(resultSet.getString("MailAdd"));
				vo.setProjectName(resultSet.getString("PrjName"));
				vo.setQuadrant(resultSet.getString("Quadrant"));
				vo.setPicPath(resultSet.getString("PicPath"));

				listGlobers.add(vo);
				vo = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listGlobers;
	}

	public GloberVO getGloberByGloberID(String globerId) {

		String sql = "SELECT GLO.GlbId, GLO.SourceId, GLO.FirstName, GLO.SecondNAme," + 
				   "GLO.MidleName, GLO.LastName, GLO.PhNmbr, GLO.MailAdd, PRO.PrjName, " +
				   "GLO.PicPath, GLO.Quadrant " +
				   "FROM findglbr.catglobers GLO, findglbr.tblprj PRO, findglbr.tblprjlead LEAD " +
				   "where LEAD.GlbId = GLO.GlbId " +
				   "and PRO.ProjectId = LEAD.ProjectId " +
				   "and GLO.GlbId = " + globerId ;								
								
		GloberVO glober = new GloberVO();

		try {
			DataBaseManager manager = new DataBaseManager();
			ResultSet resultSet = manager.executeSelect(sql);

			while (resultSet.next()) {
				GloberVO vo = new GloberVO();

				vo.setGloberId(resultSet.getInt("GlbId"));
				vo.setFirstName(resultSet.getString("FirstName"));
				vo.setSecondName(resultSet.getString("SecondNAme"));
				vo.setMiddleName(resultSet.getString("MidleName"));
				vo.setLastName(resultSet.getString("LastName"));
				vo.setPhoneNumber(resultSet.getString("PhNmbr"));
				vo.setMail(resultSet.getString("MailAdd"));
				vo.setProjectName(resultSet.getString("PrjName"));
				vo.setQuadrant(resultSet.getString("Quadrant"));
				vo.setPicPath(resultSet.getString("PicPath"));
				
				glober = vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return glober;
	
	}
}
