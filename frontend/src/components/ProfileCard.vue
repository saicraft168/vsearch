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
</template>

<script setup lang="ts">
</script>

<style scoped>
.card-img-fixed {
    width: 100%;
    height: 200px;
    object-fit: cover;
}
</style>