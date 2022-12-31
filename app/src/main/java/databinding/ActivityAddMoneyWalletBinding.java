package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.ViewBindings;
import androidx.viewbinding.ViewBinding;
import com.example.prunedeliveryapplication.R;

public final class ActivityAddMoneyWalletBinding implements ViewBinding {
    public final Button addMoney;
    public final TextView addmoneywallet;
    public final EditText balanceBox;
    private final LinearLayout rootView;

    private ActivityAddMoneyWalletBinding(LinearLayout rootView2, Button addMoney2, TextView addmoneywallet2, EditText balanceBox2) {
        this.rootView = rootView2;
        this.addMoney = addMoney2;
        this.addmoneywallet = addmoneywallet2;
        this.balanceBox = balanceBox2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAddMoneyWalletBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityAddMoneyWalletBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_add_money_wallet, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityAddMoneyWalletBinding bind(View rootView2) {
        int id = R.id.add_money;
        Button addMoney2 = (Button) ViewBindings.findChildViewById(rootView2, R.id.add_money);
        if (addMoney2 != null) {
            id = R.id.addmoneywallet;
            TextView addmoneywallet2 = (TextView) ViewBindings.findChildViewById(rootView2, R.id.addmoneywallet);
            if (addmoneywallet2 != null) {
                id = R.id.balance_box;
                EditText balanceBox2 = (EditText) ViewBindings.findChildViewById(rootView2, R.id.balance_box);
                if (balanceBox2 != null) {
                    return new ActivityAddMoneyWalletBinding((LinearLayout) rootView2, addMoney2, addmoneywallet2, balanceBox2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
