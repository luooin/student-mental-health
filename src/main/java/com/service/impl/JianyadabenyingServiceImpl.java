package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JianyadabenyingDao;
import com.entity.JianyadabenyingEntity;
import com.service.JianyadabenyingService;
import com.entity.vo.JianyadabenyingVO;
import com.entity.view.JianyadabenyingView;

@Service("jianyadabenyingService")
public class JianyadabenyingServiceImpl extends ServiceImpl<JianyadabenyingDao, JianyadabenyingEntity> implements JianyadabenyingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianyadabenyingEntity> page = this.selectPage(
                new Query<JianyadabenyingEntity>(params).getPage(),
                new EntityWrapper<JianyadabenyingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianyadabenyingEntity> wrapper) {
		  Page<JianyadabenyingView> page =new Query<JianyadabenyingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianyadabenyingVO> selectListVO(Wrapper<JianyadabenyingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianyadabenyingVO selectVO(Wrapper<JianyadabenyingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianyadabenyingView> selectListView(Wrapper<JianyadabenyingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianyadabenyingView selectView(Wrapper<JianyadabenyingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
