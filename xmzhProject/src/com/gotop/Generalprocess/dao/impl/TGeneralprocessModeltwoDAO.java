package com.gotop.Generalprocess.dao.impl;

import com.gotop.Generalprocess.dao.ITGeneralprocessModeltwoDAO;
import com.gotop.Generalprocess.model.ProcessModelOne;
import com.gotop.Generalprocess.model.ProcessModelTwo;
import com.gotop.Generalprocess.model.TGeneralprocessModeltwo;
import com.gotop.Generalprocess.model.TGeneralprocessModeltwoExample;
import com.gotop.util.dataSource.SqlMapClientDao;
import com.primeton.utils.Page;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;

public class TGeneralprocessModeltwoDAO extends SqlMapClientDao implements ITGeneralprocessModeltwoDAO {
    /**
     * 
     * @abatorgenerated
     */
    protected Logger log = Logger.getLogger(TGeneralprocessModeltwoDAO.class);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table T_GENERALPROCESS_MODELTWO
     *
     * @abatorgenerated 
     */
    public TGeneralprocessModeltwoDAO() {
        super();
    }

    /**
     * 插入一条新数据.
     * @abatorgenerated
     */
    public void insert(TGeneralprocessModeltwo record) {
        getSqlMapClientTemplate().insert("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_insert", record);
    }

    /**
     * 通过主键更新一条全部字段内容
     * @abatorgenerated
     */
    public int updateByPrimaryKey(TGeneralprocessModeltwo record) {
        int rows = getSqlMapClientTemplate().update("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * 通过主键更新部分字段，部分字段说明：当字段为null时不更新，当字段值为''空值是更新为空值
     * @abatorgenerated
     */
    public int updateByPrimaryKeySelective(TGeneralprocessModeltwo record) {
        int rows = getSqlMapClientTemplate().update("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * 通过查询实例，查询记录
     * @abatorgenerated
     */
    public List selectByExample(TGeneralprocessModeltwoExample example) {
        List list = queryForList("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * 通过Map方式的动态条件，查询分页数据
     * @abatorgenerated
     */
    public List selectByMapAndPage(HashMap example) {
        List list = queryForList("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_selectByMapAndPage", example);
        return list;
    }

    /**
     * 通过Bean方式的动态条件，查询分页数据
     * @abatorgenerated
     */
    public List selectByExampleAndPage(TGeneralprocessModeltwo record, TGeneralprocessModeltwoExample example, Page page) {
         UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
         List list = queryForList("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_selectByExampleAndPage",parms,page);
        return list;
    }

    /**
     * 根据查询模板的查询结果扩展一个实例
     * @abatorgenerated
     * @param example 条件
     */
    public TGeneralprocessModeltwo expandEntityByTemplate(TGeneralprocessModeltwo example) {
        TGeneralprocessModeltwo result = (TGeneralprocessModeltwo)queryForObject("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_expandEntityByTemplate", example);
        return result;
    }

    /**
     * 根据Bean数据模板查询条件查询所有记录
     * @abatorgenerated
     * @param example 条件
     */
    public List queryEntitiesByTemplate(TGeneralprocessModeltwo example) {
        List<TGeneralprocessModeltwo> result = (List<TGeneralprocessModeltwo>)queryForList("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_queryEntitiesByTemplate", example);
        return result;
    }

    /**
     * 根据Bean数据模板分页查询
     * @abatorgenerated
     * @param example 条件
     * @param page 分页信息
     */
    public List queryEntitiesByTemplateWithPage(TGeneralprocessModeltwo example, Page page) {
        List<TGeneralprocessModeltwo> result = (List<TGeneralprocessModeltwo>)queryForList("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_queryEntitiesByTemplate", example,page);
        return result;
    }

    /**
     * 通过主键查询一条记录
     * @abatorgenerated
     */
    public TGeneralprocessModeltwo selectByPrimaryKey(BigDecimal processmodelid) {
        TGeneralprocessModeltwo key = new TGeneralprocessModeltwo();
        key.setProcessmodelid(processmodelid);
        TGeneralprocessModeltwo record = (TGeneralprocessModeltwo) queryForObject("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * 通过查询实例，删除数据
     * @abatorgenerated
     */
    public int deleteByExample(TGeneralprocessModeltwoExample example) {
        int rows = getSqlMapClientTemplate().delete("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * 根据Bean数据模板查询条件更新记录
     * @abatorgenerated
     * @param example 条件
     */
    public int deleteByTemplate(TGeneralprocessModeltwo example) {
        int rows = getSqlMapClientTemplate().delete("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_deleteByTemplate", example);
        return rows;
    }

    /**
     * 通过主键删除一条记录
     * @abatorgenerated
     */
    public int deleteByPrimaryKey(BigDecimal processmodelid) {
        TGeneralprocessModeltwo key = new TGeneralprocessModeltwo();
        key.setProcessmodelid(processmodelid);
        int rows = getSqlMapClientTemplate().delete("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * 通过查询实例，统计总数
     * @abatorgenerated
     */
    public int countByExample(TGeneralprocessModeltwoExample example) {
        Integer count = (Integer)  queryForObject("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * 通过查询Bean数据模板，统计总数
     * @abatorgenerated
     * @param example 条件
     */
    public int countByTemplate(TGeneralprocessModeltwo example) {
        Integer rows = (Integer)queryForObject("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_countByTemplate", example);
        return rows.intValue();
    }

    /**
     * 通过查询实例，更新非null字段
     * @abatorgenerated
     */
    public int updateByExampleSelective(TGeneralprocessModeltwo record, TGeneralprocessModeltwoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * 通过查询实例，更新全部字段
     * @abatorgenerated
     */
    public int updateByExample(TGeneralprocessModeltwo record, TGeneralprocessModeltwoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * 根据Bean数据模板查询条件更新记录
     * @abatorgenerated
     * @param record 值
     * @param example 条件
     */
    public int updateEntityByTemplate(TGeneralprocessModeltwo record, TGeneralprocessModeltwo example) {
        HashMap<String,TGeneralprocessModeltwo> params = new HashMap<String,TGeneralprocessModeltwo>();
        params.put("record", record);
        params.put("template", example);
        int rows = getSqlMapClientTemplate().update("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_updateEntityByTemplate", params);
        return rows;
    }

    /**
     * 分页查询信息
     * @abatorgenerated
     */
    public List selectByDynamic(HashMap map, Page page) throws Exception {
        List list = queryForList("T_GENERALPROCESS_MODELTWO_SqlMap.abatorgenerated_selectByDynamic", map, page);
        return list;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table T_GENERALPROCESS_MODELTWO
     *
     * @abatorgenerated 
     */
    private static class UpdateByExampleParms extends TGeneralprocessModeltwoExample {
        private Object record;

        public UpdateByExampleParms(Object record, TGeneralprocessModeltwoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

	@Override
	public ProcessModelTwo queryModelTwoById(String processModelId) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("processModelId", processModelId);
		return (ProcessModelTwo) queryForObject("T_GENERALPROCESS_MODELTWO_SqlMap.queryModelTwoById", map);
	
	}

	@Override
	public void addModelTwo(ProcessModelTwo modelTwo) {
		getSqlMapClientTemplate().insert("T_GENERALPROCESS_MODELTWO_SqlMap.addModelTwo", modelTwo);
	}

	@Override
	public ProcessModelTwo queryModelTwo(HashMap<String, Object> map) {
		return (ProcessModelTwo) getSqlMapClientTemplate().queryForObject("T_GENERALPROCESS_MODELTWO_SqlMap.queryModelTwo", map);
	}

	@Override
	public void uptModelTwo(ProcessModelTwo modelTwo) {
		getSqlMapClientTemplate().update("T_GENERALPROCESS_MODELTWO_SqlMap.uptModelTwo", modelTwo);
	}
}