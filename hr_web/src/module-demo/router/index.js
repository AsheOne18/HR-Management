import Layout from '@/module-dashboard/pages/layout'
const _import = require('@/router/import_' + process.env.NODE_ENV)

export default [
  {
    root: true,
    path: '/saas-demo',
    component: Layout,
    redirect: 'noredirect',
    name: 'saas-demo',
    meta: {
      title: '#',
      icon: 'component'
    },
    children: [
      {
        path: 'index',
        component: _import('demo/pages/index'),
        name: '#',
        meta: {title: 'DemoPage', icon: 'component', noCache: true}
      }
    ]
  }
]
