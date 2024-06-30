package com.dao;

import com.entity.XueshengxinlijiankangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengxinlijiankangVO;
import com.entity.view.XueshengxinlijiankangView;


/**
 * 学生心理健康
 * 
 * @author 
 * @email 
 * @date 2024-04-13 19:10:05
 */
public interface XueshengxinlijiankangDao extends BaseMapper<XueshengxinlijiankangEntity> {
	
	List<XueshengxinlijiankangVO> selectListVO(@Param("ew") Wrapper<XueshengxinlijiankangEntity> wrapper);
	
	XueshengxinlijiankangVO selectVO(@Param("ew") Wrapper<XueshengxinlijiankangEntity> wrapper);
	
	List<XueshengxinlijiankangView> selectListView(@Param("ew") Wrapper<XueshengxinlijiankangEntity> wrapper);

	List<XueshengxinlijiankangView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengxinlijiankangEntity> wrapper);
	
	XueshengxinlijiankangView selectView(@Param("ew") Wrapper<XueshengxinlijiankangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueshengxinlijiankangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueshengxinlijiankangEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueshengxinlijiankangEntity> wrapper);
}
