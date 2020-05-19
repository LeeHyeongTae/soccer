export const increment = ({commit}) => {commit('increment')}
export const decrement = ({commit}) => {commit('decrement')}
export const incrementIfOdd = ({commit, state}) => {
    if((state.count + 1) % 2 === 0)
    commit('increment')
}
export const incrementAsync = ({commit}) => {
    setTimeout(()=>{
        commit('increment')
    }, 1000)
}
export const login_button = ({commit}) => {commit('login_button')}
export const register_button = ({commit}) => {commit('register_button')}