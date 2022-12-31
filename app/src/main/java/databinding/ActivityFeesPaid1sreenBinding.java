package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.ViewBindings;
import androidx.viewbinding.ViewBinding;

import com.example.prunedeliveryapplication.R;

public final class ActivityFeesPaid1sreenBinding implements ViewBinding {
    public final CheckBox check1;
    public final Button feeSubmitBut;
    public final ImageView imageFees;
    public final TextView painFeeTop;
    private final LinearLayout rootView;
    public final TextView textFees2;
    public final TextView textFees3;
    public final TextView textFees4;
    public final TextView textFees5;
    public final TextView textFirstFees;

    private ActivityFeesPaid1sreenBinding(LinearLayout rootView2, CheckBox check12, Button feeSubmitBut2, ImageView imageFees2, TextView painFeeTop2, TextView textFees22, TextView textFees32, TextView textFees42, TextView textFees52, TextView textFirstFees2) {
        this.rootView = rootView2;
        this.check1 = check12;
        this.feeSubmitBut = feeSubmitBut2;
        this.imageFees = imageFees2;
        this.painFeeTop = painFeeTop2;
        this.textFees2 = textFees22;
        this.textFees3 = textFees32;
        this.textFees4 = textFees42;
        this.textFees5 = textFees52;
        this.textFirstFees = textFirstFees2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityFeesPaid1sreenBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityFeesPaid1sreenBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_fees_paid1sreen, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityFeesPaid1sreenBinding bind(View rootView2) {
        View view = rootView2;
        int id = R.id.check1;
        CheckBox check12 = (CheckBox) ViewBindings.findChildViewById(view, R.id.check1);
        if (check12 != null) {
            id =R.id.fee_submit_but;
            Button feeSubmitBut2 = (Button) ViewBindings.findChildViewById(view, R.id.fee_submit_but);
            if (feeSubmitBut2 != null) {
                id = R.id.image_fees;
                ImageView imageFees2 = (ImageView) ViewBindings.findChildViewById(view, R.id.image_fees);
                if (imageFees2 != null) {
                    id = R.id.pain_fee_top;
                    TextView painFeeTop2 = (TextView) ViewBindings.findChildViewById(view, R.id.pain_fee_top);
                    if (painFeeTop2 != null) {
                        id = R.id.text_fees_2;
                        TextView textFees22 = (TextView) ViewBindings.findChildViewById(view, R.id.text_fees_2);
                        if (textFees22 != null) {
                            id =R.id.text_fees_3;
                            TextView textFees32 = (TextView) ViewBindings.findChildViewById(view, R.id.text_fees_3);
                            if (textFees32 != null) {
                                id = R.id.text_fees_4;
                                TextView textFees42 = (TextView) ViewBindings.findChildViewById(view, R.id.text_fees_4);
                                if (textFees42 != null) {
                                    id = R.id.text_fees_5;
                                    TextView textFees52 = (TextView) ViewBindings.findChildViewById(view, R.id.text_fees_5);
                                    if (textFees52 != null) {
                                        id = R.id.text_first_fees;
                                        TextView textFirstFees2 = (TextView) ViewBindings.findChildViewById(view, R.id.text_first_fees);
                                        if (textFirstFees2 != null) {
                                            return new ActivityFeesPaid1sreenBinding((LinearLayout) view, check12, feeSubmitBut2, imageFees2, painFeeTop2, textFees22, textFees32, textFees42, textFees52, textFirstFees2);
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
