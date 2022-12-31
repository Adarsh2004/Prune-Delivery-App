package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.ViewBindings;
import androidx.viewbinding.ViewBinding;

import com.example.prunedeliveryapplication.R;

public final class ActivityCardDetailBinding implements ViewBinding {
    public final EditText amount;
    public final EditText cardNameBox;
    public final TextView cardNumber;
    public final EditText cardNumberBox;
    public final EditText cvvFill;
    public final TextView cvvText;
    public final EditText expiryFill;
    public final TextView expiryText;
    public final TextView headingpayment;
    public final TextView nameOnCard;
    private final LinearLayout rootView;

    private ActivityCardDetailBinding(LinearLayout rootView2, EditText amount2, EditText cardNameBox2, TextView cardNumber2, EditText cardNumberBox2, EditText cvvFill2, TextView cvvText2, EditText expiryFill2, TextView expiryText2, TextView headingpayment2, TextView nameOnCard2) {
        this.rootView = rootView2;
        this.amount = amount2;
        this.cardNameBox = cardNameBox2;
        this.cardNumber = cardNumber2;
        this.cardNumberBox = cardNumberBox2;
        this.cvvFill = cvvFill2;
        this.cvvText = cvvText2;
        this.expiryFill = expiryFill2;
        this.expiryText = expiryText2;
        this.headingpayment = headingpayment2;
        this.nameOnCard = nameOnCard2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCardDetailBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityCardDetailBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_card_detail, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityCardDetailBinding bind(View rootView2) {
        View view = rootView2;
            int id = R.id.amount;
        EditText amount2 = (EditText) ViewBindings.findChildViewById(view,  R.id.amount);
        if (amount2 != null) {
            id =  R.id.card_name_box;
            EditText cardNameBox2 = (EditText) ViewBindings.findChildViewById(view, R.id.card_name_box);
            if (cardNameBox2 != null) {
                id =  R.id.card_number;
                TextView cardNumber2 = (TextView) ViewBindings.findChildViewById(view, R.id.card_number);
                if (cardNumber2 != null) {
                    id = R.id.card_number_box;
                    EditText cardNumberBox2 = (EditText) ViewBindings.findChildViewById(view,  R.id.card_number_box);
                    if (cardNumberBox2 != null) {
                        id =  R.id.cvv_fill;
                        EditText cvvFill2 = (EditText) ViewBindings.findChildViewById(view,  R.id.cvv_fill);
                        if (cvvFill2 != null) {
                            id =  R.id.cvv_text;
                            TextView cvvText2 = (TextView) ViewBindings.findChildViewById(view, R.id.cvv_text);
                            if (cvvText2 != null) {
                                id =  R.id.expiry_fill;
                                EditText expiryFill2 = (EditText) ViewBindings.findChildViewById(view,  R.id.expiry_fill);
                                if (expiryFill2 != null) {
                                    id =  R.id.expiry_text;
                                    TextView expiryText2 = (TextView) ViewBindings.findChildViewById(view,  R.id.expiry_text);
                                    if (expiryText2 != null) {
                                        id =  R.id.headingpayment;
                                        TextView headingpayment2 = (TextView) ViewBindings.findChildViewById(view,  R.id.headingpayment);
                                        if (headingpayment2 != null) {
                                            id =  R.id.name_on_card;
                                            TextView nameOnCard2 = (TextView) ViewBindings.findChildViewById(view,  R.id.name_on_card);
                                            if (nameOnCard2 != null) {
                                                return new ActivityCardDetailBinding((LinearLayout) view, amount2, cardNameBox2, cardNumber2, cardNumberBox2, cvvFill2, cvvText2, expiryFill2, expiryText2, headingpayment2, nameOnCard2);
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
