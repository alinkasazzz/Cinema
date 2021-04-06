-if class com.example.cinema.framework.datas.NowPlaying
-keepnames class com.example.cinema.framework.datas.NowPlaying
-if class com.example.cinema.framework.datas.NowPlaying
-keep class com.example.cinema.framework.datas.NowPlayingJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
