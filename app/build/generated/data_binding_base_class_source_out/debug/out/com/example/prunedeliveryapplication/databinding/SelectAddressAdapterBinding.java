// Generated by view binder compiler. Do not edit!
package com.example.prunedeliveryapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prunedeliveryapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SelectAddressAdapterBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout layoutParent;

  @NonNull
  public final RelativeLayout parentLayoutItems;

  @NonNull
  public final TextView title;

  private SelectAddressAdapterBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout layoutParent, @NonNull RelativeLayout parentLayoutItems,
      @NonNull TextView title) {
    this.rootView = rootView;
    this.layoutParent = layoutParent;
    this.parentLayoutItems = parentLayoutItems;
    this.title = title;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SelectAddressAdapterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SelectAddressAdapterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.select_address_adapter, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SelectAddressAdapterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout layoutParent = (RelativeLayout) rootView;

      id = R.id.parent_layout_items;
      RelativeLayout parentLayoutItems = ViewBindings.findChildViewById(rootView, id);
      if (parentLayoutItems == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new SelectAddressAdapterBinding((RelativeLayout) rootView, layoutParent,
          parentLayoutItems, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}