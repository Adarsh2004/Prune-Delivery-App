package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.ViewBindings;
import androidx.viewbinding.ViewBinding;

import com.example.prunedeliveryapplication.R;

public final class ActivityBankDetailsBinding implements ViewBinding {
    public final EditText accountNo;
    public final EditText bankName;
    public final Button cancelBut;
    public final TextView chequeUpload;
    public final EditText confirmAccountNumber;
    public final EditText ifscCode;
    private final LinearLayout rootView;
    public final Button saveBut;
    public final ImageView uploadCheque;

    private ActivityBankDetailsBinding(LinearLayout rootView2, EditText accountNo2, EditText bankName2, Button cancelBut2, TextView chequeUpload2, EditText confirmAccountNumber2, EditText ifscCode2, Button saveBut2, ImageView uploadCheque2) {
        this.rootView = rootView2;
        this.accountNo = accountNo2;
        this.bankName = bankName2;
        this.cancelBut = cancelBut2;
        this.chequeUpload = chequeUpload2;
        this.confirmAccountNumber = confirmAccountNumber2;
        this.ifscCode = ifscCode2;
        this.saveBut = saveBut2;
        this.uploadCheque = uploadCheque2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBankDetailsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityBankDetailsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_bank_details, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityBankDetailsBinding bind(View rootView2) {
        View view = rootView2;
        int id = R.id.account_no;
        EditText accountNo2 = (EditText) ViewBindings.findChildViewById(view,R.id.account_no);
        if (accountNo2 != null) {
            id = R.id.bank_name;
            EditText bankName2 = (EditText) ViewBindings.findChildViewById(view, R.id.bank_name);
            if (bankName2 != null) {
                id = R.id.cancel_but;
                Button cancelBut2 = (Button) ViewBindings.findChildViewById(view, R.id.cancel_but);
                if (cancelBut2 != null) {
                    id = R.id.cheque_upload;
                    TextView chequeUpload2 = (TextView) ViewBindings.findChildViewById(view, R.id.cheque_upload);
                    if (chequeUpload2 != null) {
                        id = R.id.confirm_account_number;
                        EditText confirmAccountNumber2 = (EditText) ViewBindings.findChildViewById(view, R.id.confirm_account_number);
                        if (confirmAccountNumber2 != null) {
                            id = R.id.ifsc_code;
                            EditText ifscCode2 = (EditText) ViewBindings.findChildViewById(view, R.id.ifsc_code);
                            if (ifscCode2 != null) {
                                id = R.id.save_but;
                                Button saveBut2 = (Button) ViewBindings.findChildViewById(view, R.id.save_but);
                                if (saveBut2 != null) {
                                    id = R.id.upload_cheque;
                                    ImageView uploadCheque2 = (ImageView) ViewBindings.findChildViewById(view, R.id.upload_cheque);
                                    if (uploadCheque2 != null) {
                                        return new ActivityBankDetailsBinding((LinearLayout) view, accountNo2, bankName2, cancelBut2, chequeUpload2, confirmAccountNumber2, ifscCode2, saveBut2, uploadCheque2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
