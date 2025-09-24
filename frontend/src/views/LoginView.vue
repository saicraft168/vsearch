
<template>
    <div class="d-flex justify-content-center align-items-center vh-100 bg-white">
        <div class="w-75 h-75 bg-gray-200 d-flex flex-row">
            <!-- ログイン -->
            <div class="d-flex flex-column justify-content-center align-items-center w-50 h-100">
                <h5 class="text-dark mb-5">ログイン</h5>
                <form class="column w-75 text-dark">
                    <!-- メールアドレス -->
                    <div class="w-100 mb-4">
                        <label for="searchInputVName" class="form-label">メールアドレス</label>
                        <input
                            type="email"
                            class="form-control"
                            id="searchInputVName"
                            tabindex="10"
                        >
                    </div>
                    <!-- パスワード -->
                    <div class="w-100 mb-5">
                        <label for="searchInputVName" class="form-label">パスワード</label>
                        <input
                            type="text"
                            class="form-control"
                            id="searchInputVName"
                            tabindex="10"
                        >
                    </div>
                    <!-- ボタン-ログイン -->
                    <button
                        type="submit"
                        class="btn btn-dark w-100 mb-4"
                        tabindex="100"
                    >
                        ログイン
                    </button>
                    <div class="text-center">
                        <RouterLink
                            v-bind:to="{name: 'home'}"
                            class="link-dark link-opacity-50-hover"
                        >
                            パスワードをお忘れの方はこちら
                        </RouterLink>
                    </div>
                </form>
            </div>

            <!-- 新規会員登録へ -->
            <div class="d-flex flex-column justify-content-center align-items-center w-50 h-100">
                <div class="column w-75 text-dark text-center">
                    <h5 class="mb-5">はじめてご利用の方</h5>
                    <RouterLink
                        v-bind:to="{name: 'home'}"
                        class="btn btn-dark w-100"
                    >
                        新規会員登録
                    </RouterLink>
                </div>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">
import { ref } from "vue";

</script>

<style scoped>
</style>