<template>
    <aside
        v-if="open"
        class="bg-gray-200 text-dark"
        style="width: 270px; height: 100%;"
    >
        <ul class="nav flex-column">
            <li class="nav-item">
                <RouterLink
                    v-bind:to="{name: 'home'}"
                    class="nav-link link-dark link-opacity-50-hover"
                >
                    <i class="bi bi-house me-2"></i>
                    ホーム
                </RouterLink>
            </li>
            <li class="nav-item">
                <RouterLink
                    v-bind:to="{name: 'home'}"
                    class="nav-link link-dark link-opacity-50-hover"
                >
                    <i class="bi bi-star me-2"></i>
                    お気に入り一覧
                </RouterLink>
            </li>
            <li class="nav-item">
                <RouterLink
                    v-bind:to="{name: 'home'}"
                    class="nav-link link-dark link-opacity-50-hover"
                >
                    <i class="bi bi-envelope me-2"></i>
                    お問い合わせ
                </RouterLink>
            </li>
        </ul>
    </aside>
</template>

<script setup lang="ts">
import { RouterLink } from 'vue-router';

    defineProps<{ open: boolean }> ()
</script>