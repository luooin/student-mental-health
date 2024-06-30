package com.dao;

import com.entity.JianyadabenyingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianyadabenyingVO;
import com.entity.view.JianyadabenyingView;


/**
 * 减压大本营
 * 
 * @author 
 * @email 
 * @date 2024-04-13 19:10:05
 */
public interface JianyadabenyingDao extends BaseMapper<JianyadabenyingEntity> {
	
	List<JianyadabenyingVO> selectListVO(@Param("ew") Wrapper<JianyadabenyingEntity> wrapper);
	
	JianyadabenyingVO selectVO(@Param("ew") Wrapper<JianyadabenyingEntity> wrapper);
	
	List<JianyadabenyingView> selectListView(@Param("ew") Wrapper<JianyadabenyingEntity> wrapper);

	List<JianyadabenyingView> selectListView(Pagination page,@Param("ew") Wrapper<JianyadabenyingEntity> wrapper);
	
	JianyadabenyingView selectView(@Param("ew") Wrapper<JianyadabenyingEntity> wrapper);
	

}
