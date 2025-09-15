<template>
    <aside
        v-show="open"
        class="bg-gray-200 text-dark"
        style="width: 270px; height: 100vh;"
    >
        サイドバーの中身
    </aside>
</template>

<script setup lang="ts">
    defineProps<{ open: boolean }> ()
</script>