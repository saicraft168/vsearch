<template>
    <header>
        <nav class="navbar navbar-dark bg-dark d-flex flex-row justify-content-between p-2">
            <div class="d-flex justify-content-start">
                <!-- Sidebar -->
                <button type="button" class="btn border-0 bg-transparent" @click="$emit('sideBarShowOrNot')">
                    <i class="bi bi-layout-sidebar-inset me-2 link-light link-opacity-50-hover"></i>
                </button>

                <!-- タイトル -->
                <RouterLink
                    v-bind:to="{name: 'home'}"
                    class="navbar-brand"
                >
                    Vsearch
                </RouterLink>
            </div>

            <div class="d-flex justify-content-start">
                <!-- Login btn-->
                <RouterLink
                    v-bind:to="{name: 'home'}"
                >
                    <button type="button" class="btn btn-secondary btn-sm">
                        ログイン
                    </button>
                </RouterLink>
            </div>
        </nav>
    </header>
</template>

<script setup lang="ts">
</script>

<style scoped>
</style>