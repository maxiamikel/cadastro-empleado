import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path:'/postulants',
    name:'postulants',
    component: () => import("@/views/PostulantView.vue")
  },
  {
    path: '/add-empleado/:id',
    name: 'add-empleado',
    component: () => import("@/views/CadastrarEmpleadoView.vue")
  },
  {
    path: '/empleados',
    name: 'empleados',
    component: () => import("@/views/EmpleadoView.vue")
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
