//import axios from 'axios'

const state = {
    userid : '',
    passwd : ''
}

const actions = {
    login_button({commit}) {
        commit('login_button')
    }
}
const mutations = {

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