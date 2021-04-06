-if class com.example.cinema.framework.datas.Film
-keepnames class com.example.cinema.framework.datas.Film
-if class com.example.cinema.framework.datas.Film
-keep class com.example.cinema.framework.datas.FilmJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
