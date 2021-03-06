package edu.jxufe.tiamo.fishingpathsys.dao;

import edu.jxufe.tiamo.common.dao.BaseDao;
import edu.jxufe.tiamo.fishingpathsys.domain.DynamicStateLike;

import java.util.List;

public interface DynamicStateLikeDao extends BaseDao<DynamicStateLike> {

    List<DynamicStateLike> findDynamicStateLikeByUserIdAndDynamicStateId(Short userId, Short dynamicStateId);
}
