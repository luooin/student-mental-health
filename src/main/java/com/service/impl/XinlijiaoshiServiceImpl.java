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


import com.dao.XinlijiaoshiDao;
import com.entity.XinlijiaoshiEntity;
import com.service.XinlijiaoshiService;
import com.entity.vo.XinlijiaoshiVO;
import com.entity.view.XinlijiaoshiView;

@Service("xinlijiaoshiService")
public class XinlijiaoshiServiceImpl extends ServiceImpl<XinlijiaoshiDao, XinlijiaoshiEntity> implements XinlijiaoshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinlijiaoshiEntity> page = this.selectPage(
                new Query<XinlijiaoshiEntity>(params).getPage(),
                new EntityWrapper<XinlijiaoshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinlijiaoshiEntity> wrapper) {
		  Page<XinlijiaoshiView> page =new Query<XinlijiaoshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinlijiaoshiVO> selectListVO(Wrapper<XinlijiaoshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinlijiaoshiVO selectVO(Wrapper<XinlijiaoshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinlijiaoshiView> selectListView(Wrapper<XinlijiaoshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinlijiaoshiView selectView(Wrapper<XinlijiaoshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
