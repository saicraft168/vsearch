<template>
    <div class="row row-cols-1 row-cols-md-4 g-4">
        <div class="col">
            <div class="card h-100">
                <!-- カード画像 -->
                <img
                    src="https://yt3.googleusercontent.com/b8EKl_i-e2dinoparyhUJEaRhInlSWwm-dZX0oIq-x1mUvQga530G_PIdutlSNkGKEAyX9aaBQ=s160-c-k-c0x00ffffff-no-rj"
                    alt="..."
                    class="card-img-top card-img-fixed"
                />

                <!-- カードボディ -->
                <div class="card-body">
                    <h5 class="card-title">Miko Ch. さくらみこ</h5>
                    <ul class="list-unstyled text-secondary mb-0">
                        <li>所属グループ：ホロライブ</li>
                        <li>活動期間：1年3ヶ月</li>
                        <li>登録者数：2,440,000</li>
                    </ul>
                </div>

                <!-- カードフッター -->
                <div class="card-footer">
                    <div class="d-flex flex-row justify-content-between">
                        <div>
                            <button
                                class="btn btn-outline-danger btn-sm"
                                type="button"
                            >
                                お気に入り
                                <i class="bi bi-star"></i>
                            </button>
                        </div>
                        <div>
                            <!-- Link-Youtube -->
                            <a
                                href="#"
                                target="_blank"
                                rel="noopener"
                                class="btn btn-danger rounded-circle btn-sm me-2"
                            >
                                <i class="bi bi-youtube"></i>
                            </a>
                            <!-- Link-X -->
                            <a
                                href="#"
                                target="_blank"
                                rel="noopener"
                                class="btn btn-dark rounded-circle btn-sm"
                            >
                                <i class="bi bi-twitter-x text-white"></i>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card h-100">
                <!-- カード画像 -->
                <img
                    src="https://yt3.googleusercontent.com/05rQUAr9zSFin0rbtoeazMFe5zzJsUfwOksay0tS6-ySgH-YKBlge4ZD8zQSkBv2wg8vSdgU2g=s160-c-k-c0x00ffffff-no-rj"
                    alt="..."
                    class="card-img-top card-img-fixed"
                />

                <!-- カードボディ -->
                <div class="card-body">
                    <h5 class="card-title">HACHI</h5>
                    <ul class="list-unstyled text-secondary mb-0">
                        <li>所属グループ：個人</li>
                        <li>活動期間：1年3ヶ月</li>
                        <li>登録者数：262,000</li>
                    </ul>
                </div>

                <!-- カードフッター -->
                <div class="card-footer">
                    <div class="d-flex flex-row justify-content-between">
                        <div>
                            <button
                                class="btn btn-outline-danger btn-sm"
                                type="button"
                            >
                                お気に入り
                                <i class="bi bi-star"></i>
                            </button>
                        </div>
                        <div>
                            <!-- Link-Youtube -->
                            <a
                                href="#"
                                target="_blank"
                                rel="noopener"
                                class="btn btn-danger rounded-circle btn-sm me-2"
                            >
                                <i class="bi bi-youtube"></i>
                            </a>
                            <!-- Link-X -->
                            <a
                                href="#"
                                target="_blank"
                                rel="noopener"
                                class="btn btn-dark rounded-circle btn-sm"
                            >
                                <i class="bi bi-twitter-x text-white"></i>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
  <div class="mt-4">
    <h1>ユーザー情報一覧</h1>

    <div v-if="loading" class="text-secondary">読み込み中...</div>
    <div v-else-if="error" class="text-danger">エラー: {{ error }}</div>

    <table v-else class="text-dark">
      <thead>
        <tr>
          <th>ID</th>
          <th>Email</th>
          <th>更新日時</th>
          <th>登録日時</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="u in users" :key="u.id">
          <td class="center">{{ u.id }}</td>
          <td>{{ u.email }}</td>
          <td class="center">{{ fmt(u.updatedAt) }}</td>
          <td class="center">{{ fmt(u.createdAt) }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  name: "ProfileCard",
  data() {
    return {
      users: [],
      loading: true,
      error: null,
    };
  },
  methods: {
    fmt(v) {
      if (v == null || v === "") return "—";
      const d = new Date(v);
      return isNaN(d.getTime()) ? "—" : d.toLocaleString();
    },
  },
  async mounted() {
    try {
      const res = await this.$axios.get("/users/list");
      const arr = Array.isArray(res.data) ? res.data : [];
      // snake_case/camelCase の差異を吸収
      this.users = arr.map((x) => ({
        ...x,
        createdAt: x.createdAt ?? x.created_at ?? null,
        updatedAt: x.updatedAt ?? x.updated_at ?? null,
      }));
    } catch (e) {
      this.error = e?.message || String(e);
    } finally {
      this.loading = false;
    }
  },
};
</script>

<style scoped>
.card-img-fixed {
    width: 100%;
    height: 200px;
    object-fit: cover;
}

table {
    width: 90%;
    border-collapse: collapse;
    font-size: 12px;
}

table th, table td {
    border: 1px solid #ddd;
    padding: 6px;
}

table th {
    background-color: #F2F2F2;
}

.center {
    text-align: center;
}
</style>