/* Bootstrap カスタムSCSS */
import "@/assets/custom-bootstrap.scss";
import 'bootstrap-icons/font/bootstrap-icons.css'
import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'
import App from './App.vue'
import router from './router'

// vue-multiselect を import
import VueMultiselect from "vue-multiselect";
import 'vue-multiselect/dist/vue-multiselect.css'
import '@/assets/custom-multiselect.scss'

import "bootstrap/dist/js/bootstrap.bundle";

import axios from "axios";
axios.defaults.baseURL = import.meta.env.VITE_API_BASE_URL;

const app = createApp(App)

app.config.globalProperties.$axios = axios;

app.use(createPinia())
app.use(router)
app.component('VueMultiselect', VueMultiselect)
app.mount('#app')
