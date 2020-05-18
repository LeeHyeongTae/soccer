<template>
    <div id="app">
        <layout>
            <template #header="header">
                <router-link to="/home"><h1 id="title">{{header.title}}</h1></router-link>
                <router-link to="/join"><span id="join">{{header.join}}</span></router-link>
                <router-link to="/login"><span id="login">{{header.login}}</span></router-link>
            </template>
            <template #sidebar>
                <ul class="menu">
                    <li v-for="i of sidebars" :key="i.menu">
                        <router-link :to="{path:i.link}">{{i.menu}}</router-link>
<!--                        <a @click="side(i.menu)">{{i.menu}}</a>-->
                    </li>
                </ul>
            </template>
            <template #content>
                <router-view/>
            </template>
            <template #footer="footer">
                <h3 id="footer">{{footer.footer}}</h3>
            </template>
        </layout>
    </div>
</template>

<script>
    import Layout from "../components/common/Layout.vue"
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
    #title{width: 300px;margin: 0 auto}
    #login{margin-right: 50px; float: right}
    #join{margin-right: 50px; float: right}
    #footer{width: 300px; margin: 0 auto}
</style>