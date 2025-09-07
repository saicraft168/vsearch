# ビルドステージ
# ベースイメージの指定
FROM gradle:8.9-jdk17 AS build
WORKDIR /app

# ビルド定義を先にコピー
COPY gradlew ./
COPY gradle ./gradle
COPY build.gradle settings.gradle ./

# 権限と依存解決
RUN chmod +x gradlew
RUN ./gradlew --no-daemon dependencies || true

# ソースをコピーして本ビルド
COPY src ./src
RUN ./gradlew --no-daemon clean build -x test


# 実行ステージ
FROM eclipse-temurin:17-jre
WORKDIR /app

# healthcheck用にcurlを入れる
RUN apt-get update && apt-get install -y --no-install-recommends curl \
  && rm -rf /var/lib/apt/lists/*

# 非rootユーザーを作成
RUN groupadd --system appgroup \
  && useradd --system --gid appgroup --home-dir /app --shell /usr/sbin/nologin appuser


# jar だけ持ち込む
COPY --from=build /app/build/libs/*.jar app.jar

# 所有権を新しいユーザーに変更
RUN chown appuser:appgroup /app/app.jar

USER appuser
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
