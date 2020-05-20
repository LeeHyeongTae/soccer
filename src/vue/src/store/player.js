import axios from 'axios'

const state = {
    context: 'http://localhost:3000/',
    player : {},
    fail : false,
    auth : false
}

const actions = {
   async login_button({commit}) {
       const url = state.context+`/access`
       const headers = {
           'Content-Type': 'application/json',
           'authorization' : 'JWT fefege..',
           'Accept' : 'application/json'
       }
        axios.post(url, state.player, headers)
            .then(({data})=>{
                alert('자바 다녀옴')
                commit('LOGIN_COMMIT', data)
            })
            .catch(()=>{
                alert('전송 실패')
                state.fail = true
            })
    },
}
const mutations = {
    LOGIN_COMMIT(state, data){
        state.auth = true
        state.player = data.player
        localStorage.setItem('token', data.token)
        localStorage.setItem('playerId', data.player.playerId)
        if(data.player.auth === 'USER'){
            alert('일반사용자')
            //일반사용자 router.push('/')
        }else{
            alert('관리자')
            //관리 router.push('/')
        }
    }
}
const getters = {

}
export default {
    name: 'player',
    namespaced : true,
    state,
    actions,
    mutations,
    getters,
}