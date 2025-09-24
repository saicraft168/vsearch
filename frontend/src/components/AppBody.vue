<template>

    <div
        class="bg-light text-dark"
        style="height: 100vh"
    >

    <!-- Search-Form -->
    <div class="">
        <button
            class="btn btn-secondary btn-sm mb-3"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#collapseExample"
            aria-expanded="false"
            aria-controls="collapseExample"
        >
            絞込み検索
            <i class="bi bi-search ms-1"></i>
        </button>
        <div class="collapse" id="collapseExample">
            <div class="card card-body mb-3">
                <SearchForm />
            </div>
        </div>
    </div>
    
    <!-- Profile-Card -->
    <div>
        <ProfileCard />
    </div>

    </div>
</template>

<script setup lang="ts">
import SearchForm from '@/components/SearchForm.vue';
import ProfileCard from './ProfileCard.vue';

</script>

<style scoped>
</style>