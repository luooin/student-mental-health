package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XueshengxinlijiankangEntity;
import com.entity.view.XueshengxinlijiankangView;

import com.service.XueshengxinlijiankangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 学生心理健康
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 19:10:05
 */
@RestController
@RequestMapping("/xueshengxinlijiankang")
public class XueshengxinlijiankangController {
    @Autowired
    private XueshengxinlijiankangService xueshengxinlijiankangService;
    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,
                  XueshengxinlijiankangEntity xueshengxinlijiankang,
		HttpServletRequest request){
		String tableName = request.getSession().
                getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xueshengxinlijiankang.setXuehao((String)request.getSession()
                    .getAttribute("username"));
		}
        EntityWrapper<XueshengxinlijiankangEntity> ew = new EntityWrapper<XueshengxinlijiankangEntity>();
		PageUtils page = xueshengxinlijiankangService.queryPage
                (params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq
                        (ew, xueshengxinlijiankang), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshengxinlijiankangEntity xueshengxinlijiankang, 
		HttpServletRequest request){
        EntityWrapper<XueshengxinlijiankangEntity> ew = new EntityWrapper<XueshengxinlijiankangEntity>();
		PageUtils page = xueshengxinlijiankangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengxinlijiankang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshengxinlijiankangEntity xueshengxinlijiankang){
       	EntityWrapper<XueshengxinlijiankangEntity> ew = new EntityWrapper<XueshengxinlijiankangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshengxinlijiankang, "xueshengxinlijiankang")); 
        return R.ok().put("data", xueshengxinlijiankangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshengxinlijiankangEntity xueshengxinlijiankang){
        EntityWrapper< XueshengxinlijiankangEntity> ew = new EntityWrapper< XueshengxinlijiankangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshengxinlijiankang, "xueshengxinlijiankang")); 
		XueshengxinlijiankangView xueshengxinlijiankangView =  xueshengxinlijiankangService.selectView(ew);
		return R.ok("查询学生心理健康成功").put("data", xueshengxinlijiankangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshengxinlijiankangEntity xueshengxinlijiankang = xueshengxinlijiankangService.selectById(id);
        return R.ok().put("data", xueshengxinlijiankang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshengxinlijiankangEntity xueshengxinlijiankang = xueshengxinlijiankangService.selectById(id);
        return R.ok().put("data", xueshengxinlijiankang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengxinlijiankangEntity xueshengxinlijiankang, HttpServletRequest request){
    	xueshengxinlijiankang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengxinlijiankang);
        xueshengxinlijiankangService.insert(xueshengxinlijiankang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengxinlijiankangEntity xueshengxinlijiankang, HttpServletRequest request){
    	xueshengxinlijiankang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengxinlijiankang);
        xueshengxinlijiankangService.insert(xueshengxinlijiankang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XueshengxinlijiankangEntity xueshengxinlijiankang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshengxinlijiankang);
        xueshengxinlijiankangService.updateById(xueshengxinlijiankang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshengxinlijiankangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XueshengxinlijiankangEntity> wrapper = new EntityWrapper<XueshengxinlijiankangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = xueshengxinlijiankangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	






    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<XueshengxinlijiankangEntity> ew = new EntityWrapper<XueshengxinlijiankangEntity>();
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
            ew.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
        List<Map<String, Object>> result = xueshengxinlijiankangService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<XueshengxinlijiankangEntity> ew = new EntityWrapper<XueshengxinlijiankangEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("xuesheng")) {
            ew.eq("xuehao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = xueshengxinlijiankangService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<XueshengxinlijiankangEntity> ew = new EntityWrapper<XueshengxinlijiankangEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("xuesheng")) {
            ew.eq("xuehao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = xueshengxinlijiankangService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }
}
