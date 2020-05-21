<template>
    <div id="app">
        <div v-if=auth>
            <Layout>
                <template #header="header">
                    <router-link to="/home"><h1 class="title">{{header.title}}</h1></router-link>
                    <router-link to="/mypage"><span class="login">{{header.mypage}}</span></router-link>
                    <span @click="logout" class="join">{{header.logout}}</span>
                </template>
                <template #sidebar>
                    <ul class="menu">
                        <li v-for="i of sidebars" :key="i.menu">
                            <router-link :to="{path:i.link}">{{i.menu}}</router-link>
                        </li>
                    </ul>
                </template>
                <template #content>
                    <router-view/>
                </template>
                <template #footer="footer">
                    <h3 class="footer">{{footer.footer}}</h3>
                </template>
            </layout>
        </div>
<!--            로그인성공화면-->
        <div v-else>
            <layout>
                <template #header="header">
                    <router-link to="/home"><h1 class="title">{{header.title}}</h1></router-link>
                    <router-link to="/join"><span class="join">{{header.join}}</span></router-link>
                    <router-link to="/login"><span class="login">{{header.login}}</span></router-link>
                </template>
                <template #sidebar>
                    <h3>광고판</h3>
                </template>
                <template #content>
                    <router-view/>
                </template>
            </layout>
        </div>
    </div>
</template>

<script>
    import Layout from "../components/common/Layout.vue"
    import {mapState} from 'vuex'
    export default {
        name: "Home",
        components : {Layout},
        data(){
            return {
                sidebars : [
                    {menu: '등록',link:'/register'},
                    {menu: '목록',link:'/list'},
                    {menu: '검색',link:'/search'},
                    {menu: '수정',link:'/update'},
                    {menu: '삭제',link:'/delete'},
                    {menu: '회원수', link:'/vuexCounter'}
                ]
            }
        },
        computed: {
            ...mapState(
                {
                    auth: state => state.player.auth
                }
            )
        },
        methods : {
            logout(){
                alert('로그아웃')
                this.$store.dispatch('player/logout')
            }
        }
        // methods: {
        //     side(){
        //         switch (i) {
        //             case '0': alert(); break;
        //             case '1': break;
        //             case '2': break;
        //             case '3': break;
        //             case '4': break;
        //             case '5': break;
        //         }
        //     }
        // }
    }
</script>
<style scoped>
    ul.menu{
        ;
        position: relative;
        padding: 5px;
        list-style: none;
        font-style: italic;
    }
    .title{width: 300px;margin: 0 auto}
    .login{margin-right: 50px; float: right}
    .join{margin-right: 50px; float: right}
    .footer{width: 300px; margin: 0 auto}
</style>