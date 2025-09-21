/* Bootstrap カスタムSCSS */
import "@/assets/bootstrap-custom.scss";
import 'bootstrap-icons/font/bootstrap-icons.css'
import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'
import App from './App.vue'
import router from './router'

import "bootstrap/dist/js/bootstrap.bundle";

const app = createApp(App)

app.use(createPinia())
app.use(router)
app.mount('#app')
