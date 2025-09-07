FROM node:20
WORKDIR /app

# 依存解決のキャッシュ最適化
COPY package.json package-lock.json* ./

# npm install相当 clean install
RUN npm ci

# ソースはボリュームでマウントする想定
# 必要ならビルド時にもCOPYするが、開発では不要
EXPOSE 5173

# Viteを外部からアクセス可能に
ENV HOST=0.0.0.0

# npm run dev相当
CMD ["npm","run","dev","--","--host"]
