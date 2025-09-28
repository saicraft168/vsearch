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
            <Multiselect
              id="affiliationGroup"
              v-model="affiliation"
              :options="affiliationOptions"
              label="label"
              track-by="id"
              :searchable="true"
              :close-on-select="true"
              :show-labels="false"
              placeholder="選択してください"
              :tabindex="20"
              class="multiselect"
            />
        </div>
        <!-- 活動期間 -->
        <div class="col-3">
            <label for="activePeriod" class="form-label">活動期間</label>
            <Multiselect
              id="activePeriod"
              v-model="activePeriod"
              :options="activePeriodOptions"
              label="label"
              track-by="id"
              :searchable="true"
              :close-on-select="true"
              :show-labels="false"
              placeholder="選択してください"
              :tabindex="30"
            />
        </div>
        <!-- ボタン -->
        <div class="col-12 d-flex justify-content-end">
            <div class="mt-3 ms-2">
                <button
                    type="submit"
                    class="btn btn-primary btn-sm"
                    tabindex="100"
                >
                    検索
                </button>
            </div>
            <div class="mt-3 ms-2">
                <button
                    type="reset"
                    class="btn btn-secondary btn-sm"
                    tabindex="110"
                >
                    クリア
                </button>
            </div>
        </div>
    </form>
</template>

<script setup lang="ts">
import { ref } from 'vue'
import Multiselect from 'vue-multiselect'

// 選択値（v-model）
const affiliation = ref<{ id: number | string; label: string } | null>(null)
const activePeriod = ref<{ id: number | string; label: string } | null>(null)

// 選択肢オプション（サンプル）
// 実運用ではバックエンドから取得した配列をここへセットしてください。
const affiliationOptions = ref<Array<{ id: number | string; label: string }>>([
  { id: 1, label: 'にじさんじ' },
  { id: 2, label: 'ホロライブ' },
  { id: 3, label: '個人勢' }
])

const activePeriodOptions = ref<Array<{ id: number | string; label: string }>>([
  { id: 'current', label: '活動中' },
  { id: 'retired', label: '引退' }
])
</script>

<style scoped>
</style>