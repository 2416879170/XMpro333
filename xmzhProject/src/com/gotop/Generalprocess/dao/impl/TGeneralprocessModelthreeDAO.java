package com.gotop.Generalprocess.dao.impl;

import com.gotop.Generalprocess.dao.ITGeneralprocessModelthreeDAO;
import com.gotop.Generalprocess.model.ProcessModelOne;
import com.gotop.Generalprocess.model.ProcessModelThree;
import com.gotop.Generalprocess.model.ProcessModelTwo;
import com.gotop.Generalprocess.model.TGeneralprocessModelthree;
import com.gotop.Generalprocess.model.TGeneralprocessModelthreeExample;
import com.gotop.util.dataSource.SqlMapClientDao;
import com.primeton.utils.Page;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;

public class TGeneralprocessModelthreeDAO extends SqlMapClientDao implements ITGeneralprocessModelthreeDAO {
    /**
     * 
     * @abatorgenerated
     */
    protected Logger log = Logger.getLogger(TGeneralprocessModelthreeDAO.class);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table T_GENERALPROCESS_MODELTHREE
     *
     * @abatorgenerated 
     */
    public TGeneralprocessModelthreeDAO() {
        super();
    }

	@Override
	public ProcessModelThree queryModelThree(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return (ProcessModelThree) queryForObject("T_GENERALPROCESS_MODELTHREE_SqlMap.queryModelThree", map);
	}

	@Override
	public void addModelThree(ProcessModelThree modelThree) {
		getSqlMapClientTemplate().insert("T_GENERALPROCESS_MODELTHREE_SqlMap.addModelThree", modelThree);
		
	}

	@Override
	public ProcessModelThree queryModelThreeById(String processModelId) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("processModelId", processModelId);
		return (ProcessModelThree) queryForObject("T_GENERALPROCESS_MODELTHREE_SqlMap.queryModelThreeById", map);
	}
	
	
	@Override
	public void uptModelThree(ProcessModelThree modelThree) {
		getSqlMapClientTemplate().update("T_GENERALPROCESS_MODELTHREE_SqlMap.uptModelThree", modelThree);
	}

	@Override
	public List queryReportTime(HashMap<String, Object> map) {
		
		return queryForList("T_GENERALPROCESS_MODELTHREE_SqlMap.queryReportTime", map);
	}
   
}