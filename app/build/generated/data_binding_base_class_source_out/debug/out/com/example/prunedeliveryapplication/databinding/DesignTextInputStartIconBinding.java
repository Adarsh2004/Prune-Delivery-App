// Generated by view binder compiler. Do not edit!
package com.example.prunedeliveryapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.prunedeliveryapplication.R;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.NullPointerException;
import java.lang.Override;

public final class DesignTextInputStartIconBinding implements ViewBinding {
  @NonNull
  private final CheckableImageButton rootView;

  @NonNull
  public final CheckableImageButton textInputStartIcon;

  private DesignTextInputStartIconBinding(@NonNull CheckableImageButton rootView,
      @NonNull CheckableImageButton textInputStartIcon) {
    this.rootView = rootView;
    this.textInputStartIcon = textInputStartIcon;
  }

  @Override
  @NonNull
  public CheckableImageButton getRoot() {
    return rootView;
  }

  @NonNull
  public static DesignTextInputStartIconBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DesignTextInputStartIconBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.design_text_input_start_icon, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DesignTextInputStartIconBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    CheckableImageButton textInputStartIcon = (CheckableImageButton) rootView;

    return new DesignTextInputStartIconBinding((CheckableImageButton) rootView, textInputStartIcon);
  }
}