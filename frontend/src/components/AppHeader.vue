<template>
    <header>
        <nav class="navbar navbar-dark bg-dark">
            <div class="container-fluid justify-content-start">
                <!-- サイドバーアイコン -->
                <button type="button" class="btn border-0 bg-transparent" @click="$emit('sideBarShowOrNot')">
                    <i class="bi bi-layout-sidebar-inset me-2 text-white"></i>
                </button>

                <!-- タイトル -->
                <RouterLink to="/" class="navbar-brand">
                    Vsearch
                </RouterLink>
            </div>
        </nav>
    </header>
</template>

<script setup lang="ts">
</script>

<style scoped>
</style>