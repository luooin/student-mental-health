
var projectName = '大学生心理健康测试系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '考试记录',
	url: '../examrecord/list.html'
}, 
{
	name: '错题本',
	url: '../examrecord/wrong.html'
},
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '减压大本营',
	url: './pages/jianyadabenying/list.html'
}, 
{
	name: '音乐信息',
	url: './pages/yinlexinxi/list.html'
}, 

{
	name: '调查问卷',
	url: './pages/exampaper/list.html'
}, 
]

var adminurl =  "http://localhost:8080/springboot9701n/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除"],"menu":"心理教师","menuJump":"列表","tableName":"xinlijiaoshi"}],"menu":"心理教师管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"类型","menuJump":"列表","tableName":"leixing"}],"menu":"类型管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除","查看评论"],"menu":"减压大本营","menuJump":"列表","tableName":"jianyadabenying"}],"menu":"减压大本营管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["新增","查看","修改","删除"],"menu":"音乐类型","menuJump":"列表","tableName":"yinleleixing"}],"menu":"音乐类型管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除","查看评论"],"menu":"音乐信息","menuJump":"列表","tableName":"yinlexinxi"}],"menu":"音乐信息管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除","报表"],"menu":"学生心理健康","menuJump":"列表","tableName":"xueshengxinlijiankang"}],"menu":"学生心理健康管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除"],"menu":"调查问卷管理","tableName":"exampaper"}],"menu":"调查问卷管理"},{"child":[{"appFrontIcon":"cuIcon-calendar","buttons":["新增","查看","修改","删除","导出"],"menu":"心理试题管理","tableName":"examquestion"}],"menu":"心理试题管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","删除","导出"],"menu":"考试记录","tableName":"examrecord"},{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","删除"],"menu":"错题本","tableName":"examfailrecord"},{"appFrontIcon":"cuIcon-baby","buttons":["新增","查看","修改","删除"],"menu":"调查问卷列表","tableName":"exampaperlist"}],"menu":"考试管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看"],"menu":"减压大本营列表","menuJump":"列表","tableName":"jianyadabenying"}],"menu":"减压大本营模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"音乐信息列表","menuJump":"列表","tableName":"yinlexinxi"}],"menu":"音乐信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看"],"menu":"减压大本营列表","menuJump":"列表","tableName":"jianyadabenying"}],"menu":"减压大本营模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"音乐信息列表","menuJump":"列表","tableName":"yinlexinxi"}],"menu":"音乐信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除","报表"],"menu":"学生心理健康","menuJump":"列表","tableName":"xueshengxinlijiankang"}],"menu":"学生心理健康管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除"],"menu":"调查问卷管理","tableName":"exampaper"}],"menu":"调查问卷管理"},{"child":[{"appFrontIcon":"cuIcon-calendar","buttons":["新增","查看","修改","删除","导出"],"menu":"心理试题管理","tableName":"examquestion"}],"menu":"心理试题管理"},{"child":[{"appFrontIcon":"cuIcon-service","buttons":["新增","查看","修改","删除"],"menu":"在线咨询","tableName":"chat"}],"menu":"系统管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","删除","导出"],"menu":"考试记录","tableName":"examrecord"},{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","删除"],"menu":"错题本","tableName":"examfailrecord"},{"appFrontIcon":"cuIcon-baby","buttons":["新增","查看","修改","删除"],"menu":"调查问卷列表","tableName":"exampaperlist"}],"menu":"考试管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看"],"menu":"减压大本营列表","menuJump":"列表","tableName":"jianyadabenying"}],"menu":"减压大本营模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"音乐信息列表","menuJump":"列表","tableName":"yinlexinxi"}],"menu":"音乐信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"心理教师","tableName":"xinlijiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
