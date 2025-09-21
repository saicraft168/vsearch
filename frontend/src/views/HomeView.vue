<template>
  <div class="d-flex flex-column vh-100">

    <!-- ヘッダー -->
    <AppHeader
      class="w-100"
      @sideBarShowOrNot="sideBarShowOrNot"
    />

    <!-- メイン領域 -->
    <div class="d-flex">

      <!-- サイドバー -->
      <AppSidebar
        class="p-3"
        :open="sideBarFlag"
      />

      <!-- ボディ -->
      <main class="flex-grow-1">
        <AppBody 
          class="p-3"
        />
      </main>

    </div>
  </div>
</template>

<script setup lang="ts">
import { ref } from "vue";
import AppHeader from '../components/AppHeader.vue'
import AppSidebar from "@/components/AppSidebar.vue";
import AppBody from "@/components/AppBody.vue";


/* サイドバーの表示/非表示の切り替え処理 */
  const sideBarFlag = ref(false)

  function sideBarShowOrNot() {
    sideBarFlag.value = !sideBarFlag.value
  }
</script>