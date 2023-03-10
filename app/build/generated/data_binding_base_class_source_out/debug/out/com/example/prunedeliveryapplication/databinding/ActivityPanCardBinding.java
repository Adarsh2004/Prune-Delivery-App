// Generated by view binder compiler. Do not edit!
package com.example.prunedeliveryapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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

public final class ActivityPanCardBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView FatherLabel;

  @NonNull
  public final ImageView Imageview;

  @NonNull
  public final Button Reset;

  @NonNull
  public final CardView cv;

  @NonNull
  public final EditText dobEdit;

  @NonNull
  public final TextView dobName;

  @NonNull
  public final EditText fathername;

  @NonNull
  public final Button ocr1;

  @NonNull
  public final TextView panName;

  @NonNull
  public final EditText panNameEdittext;

  @NonNull
  public final EditText panNumberEdittext;

  @NonNull
  public final TextView pannumber;

  private ActivityPanCardBinding(@NonNull RelativeLayout rootView, @NonNull TextView FatherLabel,
      @NonNull ImageView Imageview, @NonNull Button Reset, @NonNull CardView cv,
      @NonNull EditText dobEdit, @NonNull TextView dobName, @NonNull EditText fathername,
      @NonNull Button ocr1, @NonNull TextView panName, @NonNull EditText panNameEdittext,
      @NonNull EditText panNumberEdittext, @NonNull TextView pannumber) {
    this.rootView = rootView;
    this.FatherLabel = FatherLabel;
    this.Imageview = Imageview;
    this.Reset = Reset;
    this.cv = cv;
    this.dobEdit = dobEdit;
    this.dobName = dobName;
    this.fathername = fathername;
    this.ocr1 = ocr1;
    this.panName = panName;
    this.panNameEdittext = panNameEdittext;
    this.panNumberEdittext = panNumberEdittext;
    this.pannumber = pannumber;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPanCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPanCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_pan_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPanCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Father_label;
      TextView FatherLabel = ViewBindings.findChildViewById(rootView, id);
      if (FatherLabel == null) {
        break missingId;
      }

      id = R.id.Imageview;
      ImageView Imageview = ViewBindings.findChildViewById(rootView, id);
      if (Imageview == null) {
        break missingId;
      }

      id = R.id.Reset;
      Button Reset = ViewBindings.findChildViewById(rootView, id);
      if (Reset == null) {
        break missingId;
      }

      id = R.id.cv;
      CardView cv = ViewBindings.findChildViewById(rootView, id);
      if (cv == null) {
        break missingId;
      }

      id = R.id.dob_edit;
      EditText dobEdit = ViewBindings.findChildViewById(rootView, id);
      if (dobEdit == null) {
        break missingId;
      }

      id = R.id.dob_name;
      TextView dobName = ViewBindings.findChildViewById(rootView, id);
      if (dobName == null) {
        break missingId;
      }

      id = R.id.fathername;
      EditText fathername = ViewBindings.findChildViewById(rootView, id);
      if (fathername == null) {
        break missingId;
      }

      id = R.id.ocr1;
      Button ocr1 = ViewBindings.findChildViewById(rootView, id);
      if (ocr1 == null) {
        break missingId;
      }

      id = R.id.pan_name;
      TextView panName = ViewBindings.findChildViewById(rootView, id);
      if (panName == null) {
        break missingId;
      }

      id = R.id.pan_name_edittext;
      EditText panNameEdittext = ViewBindings.findChildViewById(rootView, id);
      if (panNameEdittext == null) {
        break missingId;
      }

      id = R.id.pan_number_edittext;
      EditText panNumberEdittext = ViewBindings.findChildViewById(rootView, id);
      if (panNumberEdittext == null) {
        break missingId;
      }

      id = R.id.pannumber;
      TextView pannumber = ViewBindings.findChildViewById(rootView, id);
      if (pannumber == null) {
        break missingId;
      }

      return new ActivityPanCardBinding((RelativeLayout) rootView, FatherLabel, Imageview, Reset,
          cv, dobEdit, dobName, fathername, ocr1, panName, panNameEdittext, panNumberEdittext,
          pannumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
