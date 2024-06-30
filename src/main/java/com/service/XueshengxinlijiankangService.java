package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengxinlijiankangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengxinlijiankangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengxinlijiankangView;


/**
 * 学生心理健康
 *
 * @author 
 * @email 
 * @date 2024-04-13 19:10:05
 */
public interface XueshengxinlijiankangService extends IService<XueshengxinlijiankangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengxinlijiankangVO> selectListVO(Wrapper<XueshengxinlijiankangEntity> wrapper);
   	
   	XueshengxinlijiankangVO selectVO(@Param("ew") Wrapper<XueshengxinlijiankangEntity> wrapper);
   	
   	List<XueshengxinlijiankangView> selectListView(Wrapper<XueshengxinlijiankangEntity> wrapper);
   	
   	XueshengxinlijiankangView selectView(@Param("ew") Wrapper<XueshengxinlijiankangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengxinlijiankangEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XueshengxinlijiankangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XueshengxinlijiankangEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XueshengxinlijiankangEntity> wrapper);
}

