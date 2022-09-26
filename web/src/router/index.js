import { createRouter, createWebHistory } from 'vue-router'
import PKIndexView from '@/views/pk/PKIndexView'
import RecordIndexView from '@/views/record/RecordIndexView'
import RankListIndexView from '@/views/ranklist/RankListIndexView'
import UserBotsIndexView from '@/views/user/bots/UserBotsIndexView'
import NotFound from '@/views/error/NotFound'
import UserAccountLoginView from '@/views/user/account/UserAccountLoginView'
import UserAccountRegisterView from '@/views/user/account/UserAccountRegisterView'

const routes = [ 
  {
    path: "/",
    name: "home",
    redirect: "/pk/",
  },
  {
    path: "/pk/",
    name: "pk_index",
    component: PKIndexView,
  },
  {
    path: "/record/",
    name: "record_index",
    component: RecordIndexView,
  },
  {
    path: "/ranklist/",
    name: "ranklist_index",
    component: RankListIndexView,
  },
  {
    path: "/user/bots/",
    name: "user_bots_index",
    component: UserBotsIndexView,
  },
  {
    path: "/user/account/login/",
    name: "user_account_login",
    component: UserAccountLoginView,
  },
  {
    path: "/user/account/register/",
    name: "user_account_register",
    component: UserAccountRegisterView,
  },
  {
    path: "/404/",
    name: "404",
    component: NotFound,
  },
  {
    path: "/:catchAll(.*)",
    redirect: "/404/",
  },
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
