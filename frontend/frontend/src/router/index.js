import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/components/Login'
import Register from '@/components/Register'
import DocumentTable from '@/components/DocumentTable'
import GenerateDocument from '@/components/GenerateDocument'
import EditForm from '@/components/EditForm'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Login',
      component: Login
    },
    {
      path: '/register',
      name: 'Register',
      component: Register
    },
    {
      path: '/document',
      name: 'DocumentTable',
      component: DocumentTable
    },
    {
      path: '/generate-document',
      name: 'GenerateDocument',
      component: GenerateDocument
    },
    {
      path: '/test',
      name: 'EditForm',
      component: EditForm
    }
  ]
})
