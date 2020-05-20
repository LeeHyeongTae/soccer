<template>
    <div>
        <div class="display">카운터:{{count}}</div>
    <button @click="increment" class="btn">플러스</button>
        <br>
    <button @click="decrement" class="btn">마이너스</button>
        <br>
    <button @click="incrementIfOdd" class="btn">Increment If Odd</button>
        <br>
    <button @click="incrementAsync" class="btn">Increment Async</button>
        <div class="display">최근 5개 값의 로그: {{recentHistory}}</div>
    </div>
</template>

<script>
    import {mapGetters, mapActions} from 'vuex'
    export default {
        computed: mapGetters([
            'count',
            'recentHistory'
        ]),
        methods: mapActions([//dispath
            'increment',
            'decrement',
            'incrementIfOdd',
            'incrementAsync'
        ])
    }
</script>

<style scoped>
    .display {
        grid-column: 1 / 5;
        background-color: #333;
        color: white;
    }
    .btn {
        background-color: #F2F2F2;
        border: 1px solid #999;
    }
    .operator {
        background-color: orange;
        color: white;
    }
</style>