// Generated by view binder compiler. Do not edit!
package com.example.prunedeliveryapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
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

public final class ActivityPersonalDetailsScreenBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView attendance;

  @NonNull
  public final Spinner languageListMenu;

  @NonNull
  public final Button secSubSubmit;

  @NonNull
  public final CardView subVerify1;

  @NonNull
  public final CardView subVerify2;

  @NonNull
  public final CardView subVerify3;

  @NonNull
  public final CardView subVerify4;

  @NonNull
  public final ImageView subbuttFirst;

  @NonNull
  public final ImageView subbuttThird;

  @NonNull
  public final TextView subheadFourth;

  @NonNull
  public final TextView subsecondHead;

  @NonNull
  public final TextView subtextFirst;

  @NonNull
  public final TextView subthirdHead;

  @NonNull
  public final ImageView subuttFour;

  @NonNull
  public final ImageView subuttSec;

  @NonNull
  public final TextView textSub;

  private ActivityPersonalDetailsScreenBinding(@NonNull LinearLayout rootView,
      @NonNull TextView attendance, @NonNull Spinner languageListMenu, @NonNull Button secSubSubmit,
      @NonNull CardView subVerify1, @NonNull CardView subVerify2, @NonNull CardView subVerify3,
      @NonNull CardView subVerify4, @NonNull ImageView subbuttFirst,
      @NonNull ImageView subbuttThird, @NonNull TextView subheadFourth,
      @NonNull TextView subsecondHead, @NonNull TextView subtextFirst,
      @NonNull TextView subthirdHead, @NonNull ImageView subuttFour, @NonNull ImageView subuttSec,
      @NonNull TextView textSub) {
    this.rootView = rootView;
    this.attendance = attendance;
    this.languageListMenu = languageListMenu;
    this.secSubSubmit = secSubSubmit;
    this.subVerify1 = subVerify1;
    this.subVerify2 = subVerify2;
    this.subVerify3 = subVerify3;
    this.subVerify4 = subVerify4;
    this.subbuttFirst = subbuttFirst;
    this.subbuttThird = subbuttThird;
    this.subheadFourth = subheadFourth;
    this.subsecondHead = subsecondHead;
    this.subtextFirst = subtextFirst;
    this.subthirdHead = subthirdHead;
    this.subuttFour = subuttFour;
    this.subuttSec = subuttSec;
    this.textSub = textSub;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPersonalDetailsScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPersonalDetailsScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_personal_details_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPersonalDetailsScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.attendance;
      TextView attendance = ViewBindings.findChildViewById(rootView, id);
      if (attendance == null) {
        break missingId;
      }

      id = R.id.language_list_menu;
      Spinner languageListMenu = ViewBindings.findChildViewById(rootView, id);
      if (languageListMenu == null) {
        break missingId;
      }

      id = R.id.sec_sub_submit;
      Button secSubSubmit = ViewBindings.findChildViewById(rootView, id);
      if (secSubSubmit == null) {
        break missingId;
      }

      id = R.id.sub_verify1;
      CardView subVerify1 = ViewBindings.findChildViewById(rootView, id);
      if (subVerify1 == null) {
        break missingId;
      }

      id = R.id.sub_verify2;
      CardView subVerify2 = ViewBindings.findChildViewById(rootView, id);
      if (subVerify2 == null) {
        break missingId;
      }

      id = R.id.sub_verify3;
      CardView subVerify3 = ViewBindings.findChildViewById(rootView, id);
      if (subVerify3 == null) {
        break missingId;
      }

      id = R.id.sub_verify4;
      CardView subVerify4 = ViewBindings.findChildViewById(rootView, id);
      if (subVerify4 == null) {
        break missingId;
      }

      id = R.id.subbutt_first;
      ImageView subbuttFirst = ViewBindings.findChildViewById(rootView, id);
      if (subbuttFirst == null) {
        break missingId;
      }

      id = R.id.subbutt_third;
      ImageView subbuttThird = ViewBindings.findChildViewById(rootView, id);
      if (subbuttThird == null) {
        break missingId;
      }

      id = R.id.subhead_fourth;
      TextView subheadFourth = ViewBindings.findChildViewById(rootView, id);
      if (subheadFourth == null) {
        break missingId;
      }

      id = R.id.subsecond_head;
      TextView subsecondHead = ViewBindings.findChildViewById(rootView, id);
      if (subsecondHead == null) {
        break missingId;
      }

      id = R.id.subtext_first;
      TextView subtextFirst = ViewBindings.findChildViewById(rootView, id);
      if (subtextFirst == null) {
        break missingId;
      }

      id = R.id.subthird_head;
      TextView subthirdHead = ViewBindings.findChildViewById(rootView, id);
      if (subthirdHead == null) {
        break missingId;
      }

      id = R.id.subutt_four;
      ImageView subuttFour = ViewBindings.findChildViewById(rootView, id);
      if (subuttFour == null) {
        break missingId;
      }

      id = R.id.subutt_sec;
      ImageView subuttSec = ViewBindings.findChildViewById(rootView, id);
      if (subuttSec == null) {
        break missingId;
      }

      id = R.id.text_sub;
      TextView textSub = ViewBindings.findChildViewById(rootView, id);
      if (textSub == null) {
        break missingId;
      }

      return new ActivityPersonalDetailsScreenBinding((LinearLayout) rootView, attendance,
          languageListMenu, secSubSubmit, subVerify1, subVerify2, subVerify3, subVerify4,
          subbuttFirst, subbuttThird, subheadFourth, subsecondHead, subtextFirst, subthirdHead,
          subuttFour, subuttSec, textSub);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
