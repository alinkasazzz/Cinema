-if class com.example.cinema.framework.repository.MoviesResponse
-keepnames class com.example.cinema.framework.repository.MoviesResponse
-if class com.example.cinema.framework.repository.MoviesResponse
-keep class com.example.cinema.framework.repository.MoviesResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
