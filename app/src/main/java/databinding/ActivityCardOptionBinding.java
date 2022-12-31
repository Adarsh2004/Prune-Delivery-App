package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.ViewBindings;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.example.prunedeliveryapplication.R;
import com.google.android.material.textfield.TextInputLayout;

public final class ActivityCardOptionBinding implements ViewBinding {
    public final TextInputLayout balance;
    public final TextView banking;
    public final RadioButton bankingButt;
    public final CardView cardOption;
    public final TextView credit;
    public final RadioButton creditButt;
    public final Button procced;
    private final LinearLayout rootView;
    public final RadioButton thirdpartyButt;
    public final TextView thirdwallet;
    public final TextView upi;
    public final RadioButton walletButt;

    private ActivityCardOptionBinding(LinearLayout rootView2, TextInputLayout balance2, TextView banking2, RadioButton bankingButt2, CardView cardOption2, TextView credit2, RadioButton creditButt2, Button procced2, RadioButton thirdpartyButt2, TextView thirdwallet2, TextView upi2, RadioButton walletButt2) {
        this.rootView = rootView2;
        this.balance = balance2;
        this.banking = banking2;
        this.bankingButt = bankingButt2;
        this.cardOption = cardOption2;
        this.credit = credit2;
        this.creditButt = creditButt2;
        this.procced = procced2;
        this.thirdpartyButt = thirdpartyButt2;
        this.thirdwallet = thirdwallet2;
        this.upi = upi2;
        this.walletButt = walletButt2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCardOptionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityCardOptionBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_card_option, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityCardOptionBinding bind(View rootView2) {
        View view = rootView2;
        int id = R.id.balance;
        TextInputLayout balance2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.balance);
        if (balance2 != null) {
            id = R.id.banking;
            TextView banking2 = (TextView) ViewBindings.findChildViewById(view, R.id.banking);
            if (banking2 != null) {
                id = R.id.banking_butt;
                RadioButton bankingButt2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.banking_butt);
                if (bankingButt2 != null) {
                    id = R.id.card_option;
                    CardView cardOption2 = (CardView) ViewBindings.findChildViewById(view, R.id.card_option);
                    if (cardOption2 != null) {
                        id = R.id.credit;
                        TextView credit2 = (TextView) ViewBindings.findChildViewById(view, R.id.credit);
                        if (credit2 != null) {
                            id = R.id.credit_butt;
                            RadioButton creditButt2 = (RadioButton) ViewBindings.findChildViewById(view,R.id.credit_butt);
                            if (creditButt2 != null) {
                                id = R.id.procced;
                                Button procced2 = (Button) ViewBindings.findChildViewById(view, R.id.procced);
                                if (procced2 != null) {
                                    id =R.id.thirdparty_butt;
                                    RadioButton thirdpartyButt2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.thirdparty_butt);
                                    if (thirdpartyButt2 != null) {
                                        id = R.id.thirdwallet;
                                        TextView thirdwallet2 = (TextView) ViewBindings.findChildViewById(view, R.id.thirdwallet);
                                        if (thirdwallet2 != null) {
                                            id = R.id.upi;
                                            TextView upi2 = (TextView) ViewBindings.findChildViewById(view, R.id.upi);
                                            if (upi2 != null) {
                                                id = R.id.wallet_butt;
                                                RadioButton walletButt2 = (RadioButton) ViewBindings.findChildViewById(view,R.id.wallet_butt);
                                                if (walletButt2 != null) {
                                                    return new ActivityCardOptionBinding((LinearLayout) view, balance2, banking2, bankingButt2, cardOption2, credit2, creditButt2, procced2, thirdpartyButt2, thirdwallet2, upi2, walletButt2);
                                                }
                                            }
                                        }
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
