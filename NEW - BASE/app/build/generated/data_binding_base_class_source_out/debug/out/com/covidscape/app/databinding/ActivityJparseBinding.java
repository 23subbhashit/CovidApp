// Generated by view binder compiler. Do not edit!
package com.covidscape.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.covidscape.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityJparseBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RecyclerView parseDisplay;

  private ActivityJparseBinding(@NonNull RelativeLayout rootView,
      @NonNull RecyclerView parseDisplay) {
    this.rootView = rootView;
    this.parseDisplay = parseDisplay;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityJparseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityJparseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_jparse, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityJparseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.parseDisplay;
      RecyclerView parseDisplay = rootView.findViewById(id);
      if (parseDisplay == null) {
        break missingId;
      }

      return new ActivityJparseBinding((RelativeLayout) rootView, parseDisplay);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
