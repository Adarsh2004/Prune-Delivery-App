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

public final class ActivityBuySimBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView CardView;

  @NonNull
  public final CardView CardView1;

  @NonNull
  public final Button canclbtn;

  @NonNull
  public final TextView createAccount;

  @NonNull
  public final ImageView moreoperators;

  @NonNull
  public final Button paybttn;

  @NonNull
  public final Spinner quantity;

  @NonNull
  public final Spinner spinnrSim;

  private ActivityBuySimBinding(@NonNull LinearLayout rootView, @NonNull CardView CardView,
      @NonNull CardView CardView1, @NonNull Button canclbtn, @NonNull TextView createAccount,
      @NonNull ImageView moreoperators, @NonNull Button paybttn, @NonNull Spinner quantity,
      @NonNull Spinner spinnrSim) {
    this.rootView = rootView;
    this.CardView = CardView;
    this.CardView1 = CardView1;
    this.canclbtn = canclbtn;
    this.createAccount = createAccount;
    this.moreoperators = moreoperators;
    this.paybttn = paybttn;
    this.quantity = quantity;
    this.spinnrSim = spinnrSim;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBuySimBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBuySimBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_buy_sim, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBuySimBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.CardView;
      CardView CardView = ViewBindings.findChildViewById(rootView, id);
      if (CardView == null) {
        break missingId;
      }

      id = R.id.CardView1;
      CardView CardView1 = ViewBindings.findChildViewById(rootView, id);
      if (CardView1 == null) {
        break missingId;
      }

      id = R.id.canclbtn;
      Button canclbtn = ViewBindings.findChildViewById(rootView, id);
      if (canclbtn == null) {
        break missingId;
      }

      id = R.id.create_account;
      TextView createAccount = ViewBindings.findChildViewById(rootView, id);
      if (createAccount == null) {
        break missingId;
      }

      id = R.id.moreoperators;
      ImageView moreoperators = ViewBindings.findChildViewById(rootView, id);
      if (moreoperators == null) {
        break missingId;
      }

      id = R.id.paybttn;
      Button paybttn = ViewBindings.findChildViewById(rootView, id);
      if (paybttn == null) {
        break missingId;
      }

      id = R.id.quantity;
      Spinner quantity = ViewBindings.findChildViewById(rootView, id);
      if (quantity == null) {
        break missingId;
      }

      id = R.id.spinnr_sim;
      Spinner spinnrSim = ViewBindings.findChildViewById(rootView, id);
      if (spinnrSim == null) {
        break missingId;
      }

      return new ActivityBuySimBinding((LinearLayout) rootView, CardView, CardView1, canclbtn,
          createAccount, moreoperators, paybttn, quantity, spinnrSim);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}