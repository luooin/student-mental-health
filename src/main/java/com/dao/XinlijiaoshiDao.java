package com.dao;

import com.entity.XinlijiaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinlijiaoshiVO;
import com.entity.view.XinlijiaoshiView;


/**
 * 心理教师
 * 
 * @author 
 * @email 
 * @date 2024-04-13 19:10:05
 */
public interface XinlijiaoshiDao extends BaseMapper<XinlijiaoshiEntity> {
	
	List<XinlijiaoshiVO> selectListVO(@Param("ew") Wrapper<XinlijiaoshiEntity> wrapper);
	
	XinlijiaoshiVO selectVO(@Param("ew") Wrapper<XinlijiaoshiEntity> wrapper);
	
	List<XinlijiaoshiView> selectListView(@Param("ew") Wrapper<XinlijiaoshiEntity> wrapper);

	List<XinlijiaoshiView> selectListView(Pagination page,@Param("ew") Wrapper<XinlijiaoshiEntity> wrapper);
	
	XinlijiaoshiView selectView(@Param("ew") Wrapper<XinlijiaoshiEntity> wrapper);
	

}
