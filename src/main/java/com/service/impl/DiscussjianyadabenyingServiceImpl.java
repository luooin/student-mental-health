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


import com.dao.DiscussjianyadabenyingDao;
import com.entity.DiscussjianyadabenyingEntity;
import com.service.DiscussjianyadabenyingService;
import com.entity.vo.DiscussjianyadabenyingVO;
import com.entity.view.DiscussjianyadabenyingView;

@Service("discussjianyadabenyingService")
public class DiscussjianyadabenyingServiceImpl extends ServiceImpl<DiscussjianyadabenyingDao, DiscussjianyadabenyingEntity> implements DiscussjianyadabenyingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjianyadabenyingEntity> page = this.selectPage(
                new Query<DiscussjianyadabenyingEntity>(params).getPage(),
                new EntityWrapper<DiscussjianyadabenyingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjianyadabenyingEntity> wrapper) {
		  Page<DiscussjianyadabenyingView> page =new Query<DiscussjianyadabenyingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjianyadabenyingVO> selectListVO(Wrapper<DiscussjianyadabenyingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjianyadabenyingVO selectVO(Wrapper<DiscussjianyadabenyingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjianyadabenyingView> selectListView(Wrapper<DiscussjianyadabenyingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjianyadabenyingView selectView(Wrapper<DiscussjianyadabenyingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
