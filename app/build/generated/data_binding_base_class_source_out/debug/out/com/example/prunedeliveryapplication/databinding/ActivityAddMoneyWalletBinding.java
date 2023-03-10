// Generated by view binder compiler. Do not edit!
package com.example.prunedeliveryapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prunedeliveryapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddMoneyWalletBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button addMoney;

  @NonNull
  public final TextView addmoneywallet;

  @NonNull
  public final EditText balanceBox;

  private ActivityAddMoneyWalletBinding(@NonNull LinearLayout rootView, @NonNull Button addMoney,
      @NonNull TextView addmoneywallet, @NonNull EditText balanceBox) {
    this.rootView = rootView;
    this.addMoney = addMoney;
    this.addmoneywallet = addmoneywallet;
    this.balanceBox = balanceBox;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddMoneyWalletBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddMoneyWalletBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_money_wallet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddMoneyWalletBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_money;
      Button addMoney = ViewBindings.findChildViewById(rootView, id);
      if (addMoney == null) {
        break missingId;
      }

      id = R.id.addmoneywallet;
      TextView addmoneywallet = ViewBindings.findChildViewById(rootView, id);
      if (addmoneywallet == null) {
        break missingId;
      }

      id = R.id.balance_box;
      EditText balanceBox = ViewBindings.findChildViewById(rootView, id);
      if (balanceBox == null) {
        break missingId;
      }

      return new ActivityAddMoneyWalletBinding((LinearLayout) rootView, addMoney, addmoneywallet,
          balanceBox);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
