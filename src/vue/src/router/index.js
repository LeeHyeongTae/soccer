import Vue from 'vue';
import VueRouter from 'vue-router';
import Join from "../components/member/Join";
import Login from "../components/member/Login";
import Calculator from "../components/common/Calculator";
import Counter from "../components/common/Counter";
import Register from "../components/member/Register";
import List from "../components/member/List";
import Search from "../components/member/Search";
import Update from "../components/member/Update";
import Delete from "../components/member/Delete";
import VuexCounter from "../components/common/VuexCounter";
import MyPage from "../components/member/MyPage";

Vue.use(VueRouter)
export default new VueRouter({
    mode: 'history',
    routes: [
        {path: '/join', component: Join},
        {path: '/login', component: Login},
        {path: '/calculator', component: Calculator},
        {path: '/counter', component: Counter},
        {path: '/vuexCounter', component: VuexCounter},
        {path: '/register', component: Register},
        {path: '/list', component: List},
        {path: '/search', component: Search},
        {path: '/update', component: Update},
        {path: '/delete', component: Delete},
        {path: '/mypage', component: MyPage},
    ]
})