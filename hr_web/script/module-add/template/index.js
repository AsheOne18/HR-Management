// vue-router
import {asyncRouterMap} from '@/router'
import routerMaps from './router'
// vuex
import app from './store/app'

export default {
  install(module, store) {
    // Register router
    asyncRouterMap.push(routerMaps[0])
    // Register state
    if (store !== undefined) {
      // store.registerModule('app', app)
    }
  }
}
