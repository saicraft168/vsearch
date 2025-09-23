<template>
    <form class="row">
        <!-- V名前 -->
        <div class="col-3">
            <label for="searchInputVName" class="form-label">名前</label>
            <input
                type="text"
                class="form-control"
                id="searchInputVName"
                tabindex="10"
            >
        </div>
        <!-- 所属グループ -->
        <div class="col-3">
            <label for="affiliationGroup" class="form-label">所属グループ</label>
            <select
                id="affiliationGroup"
                class="form-select"
                tabindex="20"
            >
                <option selected></option>
                <option></option>
            </select>
        </div>
        <!-- 活動期間 -->
        <div class="col-3">
            <label for="activePeriod" class="form-label">活動期間</label>
            <select
                id="activePeriod"
                class="form-select"
                tabindex="30"
            >
            <option selected></option>
            <option></option>
            </select>
        </div>
        <!-- 配信中 -->
        <div class="col-3">
            <label for="activePeriod" class="form-label">配信区分</label>
            <select
                id="activePeriod"
                class="form-select"
                tabindex="40"
            >
            <option selected></option>
            <option>配信中</option>
            </select>
        </div>
        <!-- ボタン -->
        <div class="col-12 d-flex justify-content-end">
            <div class="mt-3 ms-2">
                <button
                    type="submit"
                    class="btn btn-primary"
                    tabindex="100"
                >
                    検索
                </button>
            </div>
            <div class="mt-3 ms-2">
                <button
                    type="reset"
                    class="btn btn-secondary"
                    tabindex="110"
                >
                    クリア
                </button>
            </div>
        </div>
    </form>
</template>

<script setup lang="ts">
</script>

<style scoped>
</style>