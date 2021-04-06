package com.example.cinema.ui.movie;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavArgs;
import com.example.cinema.framework.datas.CurrentFilm;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MovieFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private MovieFragmentArgs() {
  }

  private MovieFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MovieFragmentArgs fromBundle(@NonNull Bundle bundle) {
    MovieFragmentArgs __result = new MovieFragmentArgs();
    bundle.setClassLoader(MovieFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("Film")) {
      CurrentFilm Film;
      if (Parcelable.class.isAssignableFrom(CurrentFilm.class) || Serializable.class.isAssignableFrom(CurrentFilm.class)) {
        Film = (CurrentFilm) bundle.get("Film");
      } else {
        throw new UnsupportedOperationException(CurrentFilm.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      __result.arguments.put("Film", Film);
    } else {
      throw new IllegalArgumentException("Required argument \"Film\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public CurrentFilm getFilm() {
    return (CurrentFilm) arguments.get("Film");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("Film")) {
      CurrentFilm Film = (CurrentFilm) arguments.get("Film");
      if (Parcelable.class.isAssignableFrom(CurrentFilm.class) || Film == null) {
        __result.putParcelable("Film", Parcelable.class.cast(Film));
      } else if (Serializable.class.isAssignableFrom(CurrentFilm.class)) {
        __result.putSerializable("Film", Serializable.class.cast(Film));
      } else {
        throw new UnsupportedOperationException(CurrentFilm.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    MovieFragmentArgs that = (MovieFragmentArgs) object;
    if (arguments.containsKey("Film") != that.arguments.containsKey("Film")) {
      return false;
    }
    if (getFilm() != null ? !getFilm().equals(that.getFilm()) : that.getFilm() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getFilm() != null ? getFilm().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "MovieFragmentArgs{"
        + "Film=" + getFilm()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(MovieFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@Nullable CurrentFilm Film) {
      this.arguments.put("Film", Film);
    }

    @NonNull
    public MovieFragmentArgs build() {
      MovieFragmentArgs result = new MovieFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setFilm(@Nullable CurrentFilm Film) {
      this.arguments.put("Film", Film);
      return this;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public CurrentFilm getFilm() {
      return (CurrentFilm) arguments.get("Film");
    }
  }
}
