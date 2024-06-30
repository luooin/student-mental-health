package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinlijiaoshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinlijiaoshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinlijiaoshiView;


/**
 * 心理教师
 *
 * @author 
 * @email 
 * @date 2024-04-13 19:10:05
 */
public interface XinlijiaoshiService extends IService<XinlijiaoshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinlijiaoshiVO> selectListVO(Wrapper<XinlijiaoshiEntity> wrapper);
   	
   	XinlijiaoshiVO selectVO(@Param("ew") Wrapper<XinlijiaoshiEntity> wrapper);
   	
   	List<XinlijiaoshiView> selectListView(Wrapper<XinlijiaoshiEntity> wrapper);
   	
   	XinlijiaoshiView selectView(@Param("ew") Wrapper<XinlijiaoshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinlijiaoshiEntity> wrapper);
   	

}

