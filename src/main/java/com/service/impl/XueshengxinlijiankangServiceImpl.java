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


import com.dao.XueshengxinlijiankangDao;
import com.entity.XueshengxinlijiankangEntity;
import com.service.XueshengxinlijiankangService;
import com.entity.vo.XueshengxinlijiankangVO;
import com.entity.view.XueshengxinlijiankangView;

@Service("xueshengxinlijiankangService")
public class XueshengxinlijiankangServiceImpl extends ServiceImpl<XueshengxinlijiankangDao, XueshengxinlijiankangEntity> implements XueshengxinlijiankangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengxinlijiankangEntity> page = this.selectPage(
                new Query<XueshengxinlijiankangEntity>(params).getPage(),
                new EntityWrapper<XueshengxinlijiankangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengxinlijiankangEntity> wrapper) {
		  Page<XueshengxinlijiankangView> page =new Query<XueshengxinlijiankangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengxinlijiankangVO> selectListVO(Wrapper<XueshengxinlijiankangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengxinlijiankangVO selectVO(Wrapper<XueshengxinlijiankangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengxinlijiankangView> selectListView(Wrapper<XueshengxinlijiankangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengxinlijiankangView selectView(Wrapper<XueshengxinlijiankangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<XueshengxinlijiankangEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<XueshengxinlijiankangEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<XueshengxinlijiankangEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
