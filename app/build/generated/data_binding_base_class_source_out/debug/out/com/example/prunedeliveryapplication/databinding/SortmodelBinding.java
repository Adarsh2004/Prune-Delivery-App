// Generated by view binder compiler. Do not edit!
package com.example.prunedeliveryapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prunedeliveryapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SortmodelBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView Amount;

  @NonNull
  public final ImageView Black;

  @NonNull
  public final TextView Completed;

  @NonNull
  public final TextView Date;

  @NonNull
  public final TextView Id;

  @NonNull
  public final TextView Type;

  private SortmodelBinding(@NonNull CardView rootView, @NonNull TextView Amount,
      @NonNull ImageView Black, @NonNull TextView Completed, @NonNull TextView Date,
      @NonNull TextView Id, @NonNull TextView Type) {
    this.rootView = rootView;
    this.Amount = Amount;
    this.Black = Black;
    this.Completed = Completed;
    this.Date = Date;
    this.Id = Id;
    this.Type = Type;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static SortmodelBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SortmodelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.sortmodel, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SortmodelBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Amount;
      TextView Amount = ViewBindings.findChildViewById(rootView, id);
      if (Amount == null) {
        break missingId;
      }

      id = R.id.Black;
      ImageView Black = ViewBindings.findChildViewById(rootView, id);
      if (Black == null) {
        break missingId;
      }

      id = R.id.Completed;
      TextView Completed = ViewBindings.findChildViewById(rootView, id);
      if (Completed == null) {
        break missingId;
      }

      id = R.id.Date;
      TextView Date = ViewBindings.findChildViewById(rootView, id);
      if (Date == null) {
        break missingId;
      }

      id = R.id.Id;
      TextView Id = ViewBindings.findChildViewById(rootView, id);
      if (Id == null) {
        break missingId;
      }

      id = R.id.Type;
      TextView Type = ViewBindings.findChildViewById(rootView, id);
      if (Type == null) {
        break missingId;
      }

      return new SortmodelBinding((CardView) rootView, Amount, Black, Completed, Date, Id, Type);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
