package com.example.cinema.ui.home;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavDirections;
import com.example.cinema.R;
import com.example.cinema.framework.datas.CurrentFilm;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static ActionNavHomeToNavMovie actionNavHomeToNavMovie(@Nullable CurrentFilm Film) {
    return new ActionNavHomeToNavMovie(Film);
  }

  public static class ActionNavHomeToNavMovie implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionNavHomeToNavMovie(@Nullable CurrentFilm Film) {
      this.arguments.put("Film", Film);
    }

    @NonNull
    public ActionNavHomeToNavMovie setFilm(@Nullable CurrentFilm Film) {
      this.arguments.put("Film", Film);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_nav_home_to_nav_movie;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public CurrentFilm getFilm() {
      return (CurrentFilm) arguments.get("Film");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionNavHomeToNavMovie that = (ActionNavHomeToNavMovie) object;
      if (arguments.containsKey("Film") != that.arguments.containsKey("Film")) {
        return false;
      }
      if (getFilm() != null ? !getFilm().equals(that.getFilm()) : that.getFilm() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getFilm() != null ? getFilm().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionNavHomeToNavMovie(actionId=" + getActionId() + "){"
          + "Film=" + getFilm()
          + "}";
    }
  }
}
