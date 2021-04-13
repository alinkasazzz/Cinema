// Code generated by moshi-kotlin-codegen. Do not edit.
package com.example.cinema.framework.datas

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.emptySet
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION", "RedundantExplicitType",
    "LocalVariableName")
class FilmJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Film>() {
  private val options: JsonReader.Options = JsonReader.Options.of("poster_path", "title",
      "original_title", "original_language", "release_date", "vote_average", "vote_count",
      "overview")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "poster_path")

  private val nullableDoubleAdapter: JsonAdapter<Double?> =
      moshi.adapter(Double::class.javaObjectType, emptySet(), "vote_average")

  private val nullableIntAdapter: JsonAdapter<Int?> = moshi.adapter(Int::class.javaObjectType,
      emptySet(), "vote_count")

  override fun toString(): String = buildString(26) {
      append("GeneratedJsonAdapter(").append("Film").append(')') }

  override fun fromJson(reader: JsonReader): Film {
    var poster_path: String? = null
    var title: String? = null
    var original_title: String? = null
    var original_language: String? = null
    var release_date: String? = null
    var vote_average: Double? = null
    var vote_count: Int? = null
    var overview: String? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> poster_path = nullableStringAdapter.fromJson(reader)
        1 -> title = nullableStringAdapter.fromJson(reader)
        2 -> original_title = nullableStringAdapter.fromJson(reader)
        3 -> original_language = nullableStringAdapter.fromJson(reader)
        4 -> release_date = nullableStringAdapter.fromJson(reader)
        5 -> vote_average = nullableDoubleAdapter.fromJson(reader)
        6 -> vote_count = nullableIntAdapter.fromJson(reader)
        7 -> overview = nullableStringAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return Film(
        poster_path = poster_path,
        title = title,
        original_title = original_title,
        original_language = original_language,
        release_date = release_date,
        vote_average = vote_average,
        vote_count = vote_count,
        overview = overview
    )
  }

  override fun toJson(writer: JsonWriter, value: Film?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("poster_path")
    nullableStringAdapter.toJson(writer, value.poster_path)
    writer.name("title")
    nullableStringAdapter.toJson(writer, value.title)
    writer.name("original_title")
    nullableStringAdapter.toJson(writer, value.original_title)
    writer.name("original_language")
    nullableStringAdapter.toJson(writer, value.original_language)
    writer.name("release_date")
    nullableStringAdapter.toJson(writer, value.release_date)
    writer.name("vote_average")
    nullableDoubleAdapter.toJson(writer, value.vote_average)
    writer.name("vote_count")
    nullableIntAdapter.toJson(writer, value.vote_count)
    writer.name("overview")
    nullableStringAdapter.toJson(writer, value.overview)
    writer.endObject()
  }
}
