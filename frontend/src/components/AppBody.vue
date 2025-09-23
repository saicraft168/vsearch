<template>

    <div
        class="bg-light text-dark"
        style="height: 100vh"
    >

    <!-- Search-Form -->
    <div class="mb-2">
        <button
            class="btn btn-secondary btn-sm mb-2"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#collapseExample"
            aria-expanded="false"
            aria-controls="collapseExample"
        >
            絞込み検索
            <i class="bi bi-search m-1"></i>
        </button>
        <div class="collapse" id="collapseExample">
            <div class="card card-body">
                <SearchForm />
            </div>
        </div>
    </div>

        <p>テストコンテンツ</p>
    </div>
</template>

<script setup lang="ts">
import SearchForm from '@/components/SearchForm.vue';
</script>

<style scoped>
</style>