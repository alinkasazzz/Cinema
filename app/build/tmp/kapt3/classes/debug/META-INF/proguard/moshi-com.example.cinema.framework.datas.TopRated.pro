-if class com.example.cinema.framework.datas.TopRated
-keepnames class com.example.cinema.framework.datas.TopRated
-if class com.example.cinema.framework.datas.TopRated
-keep class com.example.cinema.framework.datas.TopRatedJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
