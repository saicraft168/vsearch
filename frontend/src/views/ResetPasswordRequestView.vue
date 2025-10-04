<template>
    <div class="d-flex justify-content-center align-items-center vh-100 bg-white">
        <div class="w-75 h-75 bg-gray-200">
            <div class="d-flex flex-column justify-content-center align-items-center w-100 h-100 text-dark">
                <h5 class="mb-5">パスワードリセット申請</h5>
                <form class="column w-50">
                    <div class="w-100 mb-5">
                        <label for="searchInputVName" class="form-label">メールアドレス</label>
                        <input
                            type="email"
                            class="form-control"
                            id="searchInputVName"
                            tabindex="10"
                            placeholder="mail@example.com"
                        >
                        <div class="form-text">＊6文字以上でご入力ください</div>
                    </div>
                    <!-- ボタン-ログイン -->
                    <button
                        type="submit"
                        class="btn btn-dark w-100"
                        tabindex="100"
                    >
                        送信
                    </button>
                </form>
            </div>
        </div>
    </div>
</template>

<script>
</script>

<style scoped>
input::placeholder {
    color: #aaa;
    opacity: 1;
}
</style>