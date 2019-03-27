import Vue from 'vue'
import Router from 'vue-router'
import login from '@/views/login'
import home from '@/views/home'
import AdminMenu from '@/views/menu/index'

Vue.use(Router);

//
export default new Router({
  routes: [
    {
      path: '/',
      name: '登录',
      component: login
    },
    {
      path: '/home',
      name: '主页',
      component: home,
      children: [
        {
          path: 'menu',
          name: '菜单管理',
          component: AdminMenu
        }
      ]
    }
  ]
})
