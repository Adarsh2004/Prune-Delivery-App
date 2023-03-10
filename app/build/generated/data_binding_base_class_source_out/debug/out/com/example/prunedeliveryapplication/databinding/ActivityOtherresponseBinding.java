// Generated by view binder compiler. Do not edit!
package com.example.prunedeliveryapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prunedeliveryapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOtherresponseBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView CD;

  @NonNull
  public final RadioGroup ORradiogrp;

  @NonNull
  public final RadioButton lineBusyBut;

  @NonNull
  public final RadioButton notDelioverableAreaBut;

  @NonNull
  public final RadioButton notInterestedBut;

  @NonNull
  public final LinearLayout otherresponseslinearLayout;

  @NonNull
  public final RadioButton refuseBut;

  @NonNull
  public final Button saveResponse;

  @NonNull
  public final RadioButton switchOffBut;

  private ActivityOtherresponseBinding(@NonNull LinearLayout rootView, @NonNull TextView CD,
      @NonNull RadioGroup ORradiogrp, @NonNull RadioButton lineBusyBut,
      @NonNull RadioButton notDelioverableAreaBut, @NonNull RadioButton notInterestedBut,
      @NonNull LinearLayout otherresponseslinearLayout, @NonNull RadioButton refuseBut,
      @NonNull Button saveResponse, @NonNull RadioButton switchOffBut) {
    this.rootView = rootView;
    this.CD = CD;
    this.ORradiogrp = ORradiogrp;
    this.lineBusyBut = lineBusyBut;
    this.notDelioverableAreaBut = notDelioverableAreaBut;
    this.notInterestedBut = notInterestedBut;
    this.otherresponseslinearLayout = otherresponseslinearLayout;
    this.refuseBut = refuseBut;
    this.saveResponse = saveResponse;
    this.switchOffBut = switchOffBut;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOtherresponseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOtherresponseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_otherresponse, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOtherresponseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.CD;
      TextView CD = ViewBindings.findChildViewById(rootView, id);
      if (CD == null) {
        break missingId;
      }

      id = R.id.ORradiogrp;
      RadioGroup ORradiogrp = ViewBindings.findChildViewById(rootView, id);
      if (ORradiogrp == null) {
        break missingId;
      }

      id = R.id.line_busy_but;
      RadioButton lineBusyBut = ViewBindings.findChildViewById(rootView, id);
      if (lineBusyBut == null) {
        break missingId;
      }

      id = R.id.not_delioverable_area_but;
      RadioButton notDelioverableAreaBut = ViewBindings.findChildViewById(rootView, id);
      if (notDelioverableAreaBut == null) {
        break missingId;
      }

      id = R.id.not_interested_but;
      RadioButton notInterestedBut = ViewBindings.findChildViewById(rootView, id);
      if (notInterestedBut == null) {
        break missingId;
      }

      id = R.id.otherresponseslinearLayout;
      LinearLayout otherresponseslinearLayout = ViewBindings.findChildViewById(rootView, id);
      if (otherresponseslinearLayout == null) {
        break missingId;
      }

      id = R.id.refuse_but;
      RadioButton refuseBut = ViewBindings.findChildViewById(rootView, id);
      if (refuseBut == null) {
        break missingId;
      }

      id = R.id.save_response;
      Button saveResponse = ViewBindings.findChildViewById(rootView, id);
      if (saveResponse == null) {
        break missingId;
      }

      id = R.id.switch_off_but;
      RadioButton switchOffBut = ViewBindings.findChildViewById(rootView, id);
      if (switchOffBut == null) {
        break missingId;
      }

      return new ActivityOtherresponseBinding((LinearLayout) rootView, CD, ORradiogrp, lineBusyBut,
          notDelioverableAreaBut, notInterestedBut, otherresponseslinearLayout, refuseBut,
          saveResponse, switchOffBut);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
