<template>
    <div class="d-flex justify-content-center align-items-center vh-100 bg-white">
        <div class="w-75 h-75 bg-gray-200">
            <div class="d-flex flex-column justify-content-center align-items-center w-100 h-100 text-dark">
                <h5 class="mb-5">パスワード再設定</h5>
                <form class="column w-50">
                    <!-- パスワード -->
                    <div class="w-100 mb-4">
                        <label for="searchInputVName" class="form-label">パスワード</label>
                        <input
                            type="password"
                            class="form-control"
                            id="searchInputVName"
                            tabindex="10"
                        >
                        <div class="form-text">＊6文字以上でご入力ください</div>
                    </div>
                    <!-- パスワード(確認) -->
                    <div class="w-100 mb-5">
                        <label for="searchInputVName" class="form-label">パスワード(確認)</label>
                        <input
                            type="password"
                            class="form-control"
                            id="searchInputVName"
                            tabindex="10"
                        >
                    </div>
                    <!-- ボタン-ログイン -->
                    <RouterLink
                        v-bind:to="{name: 'home'}"
                        class="btn btn-dark w-100 mb-4"
                        tabindex="100"
                    >
                        登録
                    </RouterLink>
                </form>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">
</script>

<style scoped>
input::placeholder {
    color: #aaa;
    opacity: 1;
}
</style>