// Generated by view binder compiler. Do not edit!
package com.example.prunedeliveryapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

public final class ActivityBankDetailsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText accountNo;

  @NonNull
  public final EditText bankName;

  @NonNull
  public final Button cancelBut;

  @NonNull
  public final TextView chequeUpload;

  @NonNull
  public final EditText confirmAccountNumber;

  @NonNull
  public final EditText ifscCode;

  @NonNull
  public final Button saveBut;

  @NonNull
  public final ImageView uploadCheque;

  private ActivityBankDetailsBinding(@NonNull LinearLayout rootView, @NonNull EditText accountNo,
      @NonNull EditText bankName, @NonNull Button cancelBut, @NonNull TextView chequeUpload,
      @NonNull EditText confirmAccountNumber, @NonNull EditText ifscCode, @NonNull Button saveBut,
      @NonNull ImageView uploadCheque) {
    this.rootView = rootView;
    this.accountNo = accountNo;
    this.bankName = bankName;
    this.cancelBut = cancelBut;
    this.chequeUpload = chequeUpload;
    this.confirmAccountNumber = confirmAccountNumber;
    this.ifscCode = ifscCode;
    this.saveBut = saveBut;
    this.uploadCheque = uploadCheque;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBankDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBankDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_bank_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBankDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.account_no;
      EditText accountNo = ViewBindings.findChildViewById(rootView, id);
      if (accountNo == null) {
        break missingId;
      }

      id = R.id.bank_name;
      EditText bankName = ViewBindings.findChildViewById(rootView, id);
      if (bankName == null) {
        break missingId;
      }

      id = R.id.cancel_but;
      Button cancelBut = ViewBindings.findChildViewById(rootView, id);
      if (cancelBut == null) {
        break missingId;
      }

      id = R.id.cheque_upload;
      TextView chequeUpload = ViewBindings.findChildViewById(rootView, id);
      if (chequeUpload == null) {
        break missingId;
      }

      id = R.id.confirm_account_number;
      EditText confirmAccountNumber = ViewBindings.findChildViewById(rootView, id);
      if (confirmAccountNumber == null) {
        break missingId;
      }

      id = R.id.ifsc_code;
      EditText ifscCode = ViewBindings.findChildViewById(rootView, id);
      if (ifscCode == null) {
        break missingId;
      }

      id = R.id.save_but;
      Button saveBut = ViewBindings.findChildViewById(rootView, id);
      if (saveBut == null) {
        break missingId;
      }

      id = R.id.upload_cheque;
      ImageView uploadCheque = ViewBindings.findChildViewById(rootView, id);
      if (uploadCheque == null) {
        break missingId;
      }

      return new ActivityBankDetailsBinding((LinearLayout) rootView, accountNo, bankName, cancelBut,
          chequeUpload, confirmAccountNumber, ifscCode, saveBut, uploadCheque);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}