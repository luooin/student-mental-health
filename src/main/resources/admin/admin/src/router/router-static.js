import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/exampaperlist/exam'
    import leixing from '@/views/modules/leixing/list'
    import yinleleixing from '@/views/modules/yinleleixing/list'
    import examfailrecord from '@/views/modules/examfailrecord/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import xinlijiaoshi from '@/views/modules/xinlijiaoshi/list'
    import examquestion from '@/views/modules/examquestion/list'
    import yinlexinxi from '@/views/modules/yinlexinxi/list'
    import jianyadabenying from '@/views/modules/jianyadabenying/list'
    import exampaper from '@/views/modules/exampaper/list'
    import chat from '@/views/modules/chat/list'
    import discussyinlexinxi from '@/views/modules/discussyinlexinxi/list'
    import discussjianyadabenying from '@/views/modules/discussjianyadabenying/list'
    import exampaperlist from '@/views/modules/exampaperlist/list'
    import xueshengxinlijiankang from '@/views/modules/xueshengxinlijiankang/list'
    import config from '@/views/modules/config/list'
    import examrecord from '@/views/modules/examrecord/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/leixing',
        name: '类型',
        component: leixing
      }
      ,{
	path: '/yinleleixing',
        name: '音乐类型',
        component: yinleleixing
      }
      ,{
	path: '/examfailrecord',
        name: '错题本',
        component: examfailrecord
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/xinlijiaoshi',
        name: '心理教师',
        component: xinlijiaoshi
      }
      ,{
	path: '/examquestion',
        name: '心理试题管理',
        component: examquestion
      }
      ,{
	path: '/yinlexinxi',
        name: '音乐信息',
        component: yinlexinxi
      }
      ,{
	path: '/jianyadabenying',
        name: '减压大本营',
        component: jianyadabenying
      }
      ,{
	path: '/exampaper',
        name: '调查问卷管理',
        component: exampaper
      }
      ,{
	path: '/chat',
        name: '在线咨询',
        component: chat
      }
      ,{
	path: '/discussyinlexinxi',
        name: '音乐信息评论',
        component: discussyinlexinxi
      }
      ,{
	path: '/discussjianyadabenying',
        name: '减压大本营评论',
        component: discussjianyadabenying
      }
      ,{
	path: '/exampaperlist',
        name: '调查问卷列表',
        component: exampaperlist
      }
      ,{
	path: '/xueshengxinlijiankang',
        name: '学生心理健康',
        component: xueshengxinlijiankang
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/examrecord',
        name: '考试记录',
        component: examrecord
      }
    ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
