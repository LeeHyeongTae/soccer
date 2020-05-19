import Vue from 'vue'
import App from './App.vue'
import vuetify from './plugins/vuetify'
import router from './router'
import {store} from './store'
import Vuex from 'vuex'
import Axios from "axios"

Vue.config.productionTip = false
Vue.prototype.$http = Axios //vue안에 prototype(바닐라JS)가 있고, 그 통신방식이 HTTP인데 그걸 axios로 사용하겠다.
Vue.use(Vuex)
new Vue({
  vuetify,
  router,
  Vuex,
  store,
  Axios,
  render: h => h(App)
}).$mount('#app')
//model