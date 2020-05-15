import Vue from 'vue';
import VueRouter from 'vue-router';
import Join from "../components/member/Join";
import Login from "../components/member/Login";
import Calculator from "../components/common/Calculator";

Vue.use(VueRouter)
export default new VueRouter({
    mode: 'history',
    routes: [
        {path: '/join', component: Join},
        {path: '/login', component: Login},
        {path: '/calculator', component: Calculator},
    ]
})
/*
* methods:{
* clear(){this.current = ''},
* setPrevious(){
* this.previous = this.current
* this.operatorClicked = true},
* append(number){
* if(this.operatorClicked){
* this.current = ''
* this.operatorClicked = false
* }
* this.current = `${this.current}${number}`
* },
* add(){
* this.operator = (a, b) => a + b
* this.setPrevious()
* },
* minus(){
* this.operator = (a, b) => a - b
* this.setPrevious()
* },
* times(){
* this.oprator = (a, b) => a * b
* this.setPrevious()
* },
* divide(){
* this.operator =(a, b) => a / b
* this.setPrevious()
* },
* equal(){
* this.current = `${this.operator((ParseFloat(this.previous),parseFloat(this.current)))}`
* this.previous = null
* ㅇㅇㅇ}
*/