import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '@/views/HomeView.vue'
import LoginView from '@/views/LoginView.vue'
import UserRegisterView from '@/views/UserRegisterView.vue'
import ResetPasswordRequestView from '@/views/ResetPasswordRequestView.vue'
import ResetPasswordRegistrationView from '@/views/ResetPasswordRegistrationView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView,
    },
    {
      path: '/login',
      name: 'login',
      component: LoginView,
    },
    {
      path: '/user-register',
      name: 'userRegister',
      component: UserRegisterView,
    },
    {
      path: '/reset-password-request',
      name: 'resetPasswordRequest',
      component: ResetPasswordRequestView,
    },
    {
      path: '/reset-password-registration',
      name: 'resetPasswordRegistration',
      component: ResetPasswordRegistrationView,
    },
  ],
})

export default router
