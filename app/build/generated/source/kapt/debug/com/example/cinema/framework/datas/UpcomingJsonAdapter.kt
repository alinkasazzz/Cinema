// Code generated by moshi-kotlin-codegen. Do not edit.
package com.example.cinema.framework.datas

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION", "RedundantExplicitType",
    "LocalVariableName")
class UpcomingJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Upcoming>() {
  private val options: JsonReader.Options = JsonReader.Options.of("results")

  private val listOfFilmAdapter: JsonAdapter<List<Film>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, Film::class.java), emptySet(),
      "results")

  override fun toString(): String = buildString(30) {
      append("GeneratedJsonAdapter(").append("Upcoming").append(')') }

  override fun fromJson(reader: JsonReader): Upcoming {
    var results: List<Film>? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> results = listOfFilmAdapter.fromJson(reader) ?: throw Util.unexpectedNull("results",
            "results", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return Upcoming(
        results = results ?: throw Util.missingProperty("results", "results", reader)
    )
  }

  override fun toJson(writer: JsonWriter, value: Upcoming?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("results")
    listOfFilmAdapter.toJson(writer, value.results)
    writer.endObject()
  }
}