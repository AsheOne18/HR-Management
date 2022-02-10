import Layout from '@/module-dashboard/pages/layout'
const _import = require('@/router/import_' + process.env.NODE_ENV)

export default [
  {
    root: true,
    path: '/saas-clients',// Parent path
    component: Layout,
    redirect: 'noredirect',
    name: 'saas-clients',
    meta: {
      title: 'SaasEnterprise',
      icon: 'component'
    },
    children: [
      {
        path: 'index',// Request path 
        component: _import('saas-clients/pages/index'),
        name: 'saas-clients-index',
        meta: {title: 'SaasEnterprise ', icon: 'component', noCache: true}
      },
      {
        path: 'details/:id',// Request path
        component: _import('saas-clients/pages/detail'),
        name: 'saas-clients-detail',
        meta: {title: 'SaasDetails ', icon: 'component', noCache: true}
      }
    ]
  }
]
