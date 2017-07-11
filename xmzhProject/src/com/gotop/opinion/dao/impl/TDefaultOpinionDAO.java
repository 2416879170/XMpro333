package com.gotop.opinion.dao.impl;

import com.gotop.opinion.dao.ITDefaultOpinionDAO;
import com.gotop.opinion.model.TDefaultOpinion;
import com.gotop.opinion.model.TDefaultOpinionExample;
import com.gotop.util.dataSource.SqlMapClientDao;
import com.primeton.utils.Page;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;

public class TDefaultOpinionDAO extends SqlMapClientDao implements ITDefaultOpinionDAO {
    /**
	 * @abatorgenerated
	 */
	protected Logger log = Logger.getLogger(TDefaultOpinionDAO.class);

	/**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table T_DEFAULT_OPINION
     *
     * @abatorgenerated 
     */
    public TDefaultOpinionDAO() {
        super();
    }

    /**
     * 插入一条新数据.
     * @abatorgenerated
     */
    public void insert(TDefaultOpinion record) {
        getSqlMapClientTemplate().insert("T_DEFAULT_OPINION_SqlMap.abatorgenerated_insert", record);
    }

    /**
     * 通过主键更新一条全部字段内容
     * @abatorgenerated
     */
    public int updateByPrimaryKey(TDefaultOpinion record) {
        int rows = getSqlMapClientTemplate().update("T_DEFAULT_OPINION_SqlMap.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * 通过主键更新部分字段，部分字段说明：当字段为null时不更新，当字段值为''空值是更新为空值
     * @abatorgenerated
     */
    public int updateByPrimaryKeySelective(TDefaultOpinion record) {
        int rows = getSqlMapClientTemplate().update("T_DEFAULT_OPINION_SqlMap.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * 通过查询实例，查询记录
     * @abatorgenerated
     */
    public List selectByExample(Long empid) {
        List list = queryForList("T_DEFAULT_OPINION_SqlMap.queryDefaultOpsByemp", empid);
        return list;
    }

    /**
     * 通过Map方式的动态条件，查询分页数据
     * @abatorgenerated
     */
    public List selectByMapAndPage(HashMap example) {
        List list = queryForList("T_DEFAULT_OPINION_SqlMap.abatorgenerated_selectByMapAndPage", example);
        return list;
    }

    /**
     * 通过Bean方式的动态条件，查询分页数据
     * @abatorgenerated
     */
    public List selectByExampleAndPage(TDefaultOpinion record, TDefaultOpinionExample example, Page page) {
         UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
         List list = queryForList("T_DEFAULT_OPINION_SqlMap.abatorgenerated_selectByExampleAndPage",parms,page);
        return list;
    }

    /**
     * 根据查询模板的查询结果扩展一个实例
     * @abatorgenerated
     * @param example 条件
     */
    public TDefaultOpinion expandEntityByTemplate(TDefaultOpinion example) {
        TDefaultOpinion result = (TDefaultOpinion)queryForObject("T_DEFAULT_OPINION_SqlMap.abatorgenerated_expandEntityByTemplate", example);
        return result;
    }

    /**
     * 根据Bean数据模板查询条件查询所有记录
     * @abatorgenerated
     * @param example 条件
     */
    public List queryEntitiesByTemplate(TDefaultOpinion example) {
        List<TDefaultOpinion> result = (List<TDefaultOpinion>)queryForList("T_DEFAULT_OPINION_SqlMap.abatorgenerated_queryEntitiesByTemplate", example);
        return result;
    }

    /**
     * 根据Bean数据模板分页查询
     * @abatorgenerated
     * @param example 条件
     * @param page 分页信息
     */
    public List queryEntitiesByTemplateWithPage(TDefaultOpinion example, Page page) {
        List<TDefaultOpinion> result = (List<TDefaultOpinion>)queryForList("T_DEFAULT_OPINION_SqlMap.abatorgenerated_queryEntitiesByTemplate", example,page);
        return result;
    }

    /**
     * 通过主键查询一条记录
     * @abatorgenerated
     */
    public TDefaultOpinion selectByPrimaryKey(Long recId) {
        TDefaultOpinion key = new TDefaultOpinion();
        key.setRecId(recId);
        TDefaultOpinion record = (TDefaultOpinion) queryForObject("T_DEFAULT_OPINION_SqlMap.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * 通过查询实例，删除数据
     * @abatorgenerated
     */
    public int deleteByExample(TDefaultOpinionExample example) {
        int rows = getSqlMapClientTemplate().delete("T_DEFAULT_OPINION_SqlMap.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * 根据Bean数据模板查询条件更新记录
     * @abatorgenerated
     * @param example 条件
     */
    public int deleteByTemplate(TDefaultOpinion example) {
        int rows = getSqlMapClientTemplate().delete("T_DEFAULT_OPINION_SqlMap.abatorgenerated_deleteByTemplate", example);
        return rows;
    }

    /**
     * 通过主键删除一条记录
     * @abatorgenerated
     */
    public int deleteByPrimaryKey(Long recId) {
        TDefaultOpinion key = new TDefaultOpinion();
        key.setRecId(recId);
        int rows = getSqlMapClientTemplate().delete("T_DEFAULT_OPINION_SqlMap.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * 通过查询实例，统计总数
     * @abatorgenerated
     */
    public int countByExample(TDefaultOpinionExample example) {
        Integer count = (Integer)  queryForObject("T_DEFAULT_OPINION_SqlMap.abatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * 通过查询Bean数据模板，统计总数
     * @abatorgenerated
     * @param example 条件
     */
    public int countByTemplate(TDefaultOpinion example) {
        Integer rows = (Integer)queryForObject("T_DEFAULT_OPINION_SqlMap.abatorgenerated_countByTemplate", example);
        return rows.intValue();
    }

    /**
     * 通过查询实例，更新非null字段
     * @abatorgenerated
     */
    public int updateByExampleSelective(TDefaultOpinion record, TDefaultOpinionExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("T_DEFAULT_OPINION_SqlMap.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * 通过查询实例，更新全部字段
     * @abatorgenerated
     */
    public int updateByExample(TDefaultOpinion record, TDefaultOpinionExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("T_DEFAULT_OPINION_SqlMap.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * 根据Bean数据模板查询条件更新记录
     * @abatorgenerated
     * @param record 值
     * @param example 条件
     */
    public int updateEntityByTemplate(TDefaultOpinion record, TDefaultOpinion example) {
        HashMap<String,TDefaultOpinion> params = new HashMap<String,TDefaultOpinion>();
        params.put("record", record);
        params.put("template", example);
        int rows = getSqlMapClientTemplate().update("T_DEFAULT_OPINION_SqlMap.abatorgenerated_updateEntityByTemplate", params);
        return rows;
    }

    /**
     * 分页查询信息
     * @abatorgenerated
     */
    public List selectByDynamic(HashMap map, Page page) throws Exception {
        List list = queryForList("T_DEFAULT_OPINION_SqlMap.queryDefaultOpsByemp", map, page);
        return list;
    }

	/**
	 * This class was generated by Abator for iBATIS. This class corresponds to the database table T_DEFAULT_OPINION
	 * @abatorgenerated  
	 */
	private static class UpdateByExampleParms extends TDefaultOpinionExample {
		private Object record;

		public UpdateByExampleParms(Object record,
				TDefaultOpinionExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}

	@Override
	public List<TDefaultOpinion> queryDefaultOps(Long empid) throws Exception {
		List<TDefaultOpinion> list  = queryForList("T_DEFAULT_OPINION_SqlMap.queryDefaultOpsByemp", empid);
		return list;
	}

	@Override
	public List<TDefaultOpinion> queryDefaultOpsForshow(Long empid)
			throws Exception {
		List<TDefaultOpinion> list  = queryForList("T_DEFAULT_OPINION_SqlMap.queryDefaultOpsForshow", empid);
		return list;
	}
}