import axios from 'axios'

const state = {
    player : {},
    fail : false,
    auth : false
}

const actions = {
   async login_button({commit}) {
       const headers = {
           'Content-Type': 'text/plain'
       }
        axios.post('', player, header)
            .then(({data})=>{
                commit('LOGIN_COMMIT', data)
            })
            .catch(()=>{
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
            //관리 router.push('/')
        }
    }
}
const getters = {

}
export default {
    name: 'player',
    namespace : true,
    state,
    actions,
    mutations,
    getters,
}