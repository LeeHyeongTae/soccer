import Vue from 'vue';
import VueRouter from 'vue-router';
import Join from "../components/member/Join";
import Login from "../components/member/Login";

Vue.use(VueRouter)
export default new VueRouter({
    mode: 'history',
    routes: [
        {path: '/join', component: Join},
        {path: '/login', component: Login}
    ]
})
