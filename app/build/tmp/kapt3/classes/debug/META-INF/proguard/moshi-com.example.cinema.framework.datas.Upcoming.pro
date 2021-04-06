-if class com.example.cinema.framework.datas.Upcoming
-keepnames class com.example.cinema.framework.datas.Upcoming
-if class com.example.cinema.framework.datas.Upcoming
-keep class com.example.cinema.framework.datas.UpcomingJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
