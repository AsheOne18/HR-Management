import Vue from 'vue'
import 'normalize.css/normalize.css'// A modern alternative to CSS resets
import Element from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import '@/styles/index.scss' // global css
import App from './App'
import router from './router'
import store from './store'
import i18n from './lang' // Internationalization
import './icons' // icon
import './errorLog'// error log
import * as filters from './filters' // global filters
// font-awesome
import 'font-awesome/css/font-awesome.css'
import './mock' // simulation data
/*
* Register - Module
*/
import dashboard from '@/module-dashboard/' // 面板
import demo from '@/module-demo/' // 
import saasClients from '@/module-saas-clients/' // 

import tools from './utils/common.js'
Vue.prototype.$tools = tools

Vue.use(tools)
Vue.use(dashboard, store)
Vue.use(demo, store)
Vue.use(saasClients, store)

/*
* Register - Component
*/

// Element-ui
Vue.use(Element, {
  size: 'medium', // set element-ui default size
  i18n: (key, value) => i18n.t(key, value)
})
// Filters
Object.keys(filters).forEach(key => {
  Vue.filter(key, filters[key])
})

Vue.config.productionTip = false

/* eslint-disable */
new Vue({
  el: '#app',
  router,
  store,
  i18n,
  template: '<App/>',
  components: { App }
})
