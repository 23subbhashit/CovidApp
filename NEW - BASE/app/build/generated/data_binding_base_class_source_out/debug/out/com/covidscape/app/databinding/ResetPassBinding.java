// Generated by view binder compiler. Do not edit!
package com.covidscape.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.covidscape.app.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ResetPassBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final TextInputEditText email;

  @NonNull
  public final TextInputLayout emailF;

  @NonNull
  public final Button submit;

  private ResetPassBinding(@NonNull LinearLayoutCompat rootView, @NonNull TextInputEditText email,
      @NonNull TextInputLayout emailF, @NonNull Button submit) {
    this.rootView = rootView;
    this.email = email;
    this.emailF = emailF;
    this.submit = submit;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ResetPassBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ResetPassBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.reset_pass, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ResetPassBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.email;
      TextInputEditText email = rootView.findViewById(id);
      if (email == null) {
        break missingId;
      }

      id = R.id.email_f;
      TextInputLayout emailF = rootView.findViewById(id);
      if (emailF == null) {
        break missingId;
      }

      id = R.id.submit;
      Button submit = rootView.findViewById(id);
      if (submit == null) {
        break missingId;
      }

      return new ResetPassBinding((LinearLayoutCompat) rootView, email, emailF, submit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
