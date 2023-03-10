// Generated by view binder compiler. Do not edit!
package com.example.prunedeliveryapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prunedeliveryapplication.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DirectsellBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextInputLayout ADDRESS;

  @NonNull
  public final Button OKBUTTON;

  @NonNull
  public final CardView PAYMENT;

  @NonNull
  public final TextInputLayout PHONENUMBER;

  @NonNull
  public final TextInputLayout PLAN;

  @NonNull
  public final TextInputLayout SIM;

  @NonNull
  public final Spinner SPINNERPAYMENT;

  @NonNull
  public final TextInputEditText TIET;

  @NonNull
  public final TextInputEditText TIET1;

  @NonNull
  public final TextInputEditText TIET2;

  @NonNull
  public final TextInputEditText TIET3;

  @NonNull
  public final TextInputEditText TIET4;

  @NonNull
  public final TextView profile;

  private DirectsellBinding(@NonNull LinearLayout rootView, @NonNull TextInputLayout ADDRESS,
      @NonNull Button OKBUTTON, @NonNull CardView PAYMENT, @NonNull TextInputLayout PHONENUMBER,
      @NonNull TextInputLayout PLAN, @NonNull TextInputLayout SIM, @NonNull Spinner SPINNERPAYMENT,
      @NonNull TextInputEditText TIET, @NonNull TextInputEditText TIET1,
      @NonNull TextInputEditText TIET2, @NonNull TextInputEditText TIET3,
      @NonNull TextInputEditText TIET4, @NonNull TextView profile) {
    this.rootView = rootView;
    this.ADDRESS = ADDRESS;
    this.OKBUTTON = OKBUTTON;
    this.PAYMENT = PAYMENT;
    this.PHONENUMBER = PHONENUMBER;
    this.PLAN = PLAN;
    this.SIM = SIM;
    this.SPINNERPAYMENT = SPINNERPAYMENT;
    this.TIET = TIET;
    this.TIET1 = TIET1;
    this.TIET2 = TIET2;
    this.TIET3 = TIET3;
    this.TIET4 = TIET4;
    this.profile = profile;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DirectsellBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DirectsellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.directsell, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DirectsellBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ADDRESS;
      TextInputLayout ADDRESS = ViewBindings.findChildViewById(rootView, id);
      if (ADDRESS == null) {
        break missingId;
      }

      id = R.id.OK_BUTTON;
      Button OKBUTTON = ViewBindings.findChildViewById(rootView, id);
      if (OKBUTTON == null) {
        break missingId;
      }

      id = R.id.PAYMENT;
      CardView PAYMENT = ViewBindings.findChildViewById(rootView, id);
      if (PAYMENT == null) {
        break missingId;
      }

      id = R.id.PHONE_NUMBER;
      TextInputLayout PHONENUMBER = ViewBindings.findChildViewById(rootView, id);
      if (PHONENUMBER == null) {
        break missingId;
      }

      id = R.id.PLAN;
      TextInputLayout PLAN = ViewBindings.findChildViewById(rootView, id);
      if (PLAN == null) {
        break missingId;
      }

      id = R.id.SIM;
      TextInputLayout SIM = ViewBindings.findChildViewById(rootView, id);
      if (SIM == null) {
        break missingId;
      }

      id = R.id.SPINNER_PAYMENT;
      Spinner SPINNERPAYMENT = ViewBindings.findChildViewById(rootView, id);
      if (SPINNERPAYMENT == null) {
        break missingId;
      }

      id = R.id.TI_ET;
      TextInputEditText TIET = ViewBindings.findChildViewById(rootView, id);
      if (TIET == null) {
        break missingId;
      }

      id = R.id.TI_ET1;
      TextInputEditText TIET1 = ViewBindings.findChildViewById(rootView, id);
      if (TIET1 == null) {
        break missingId;
      }

      id = R.id.TI_ET2;
      TextInputEditText TIET2 = ViewBindings.findChildViewById(rootView, id);
      if (TIET2 == null) {
        break missingId;
      }

      id = R.id.TI_ET3;
      TextInputEditText TIET3 = ViewBindings.findChildViewById(rootView, id);
      if (TIET3 == null) {
        break missingId;
      }

      id = R.id.TI_ET4;
      TextInputEditText TIET4 = ViewBindings.findChildViewById(rootView, id);
      if (TIET4 == null) {
        break missingId;
      }

      id = R.id.profile;
      TextView profile = ViewBindings.findChildViewById(rootView, id);
      if (profile == null) {
        break missingId;
      }

      return new DirectsellBinding((LinearLayout) rootView, ADDRESS, OKBUTTON, PAYMENT, PHONENUMBER,
          PLAN, SIM, SPINNERPAYMENT, TIET, TIET1, TIET2, TIET3, TIET4, profile);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
