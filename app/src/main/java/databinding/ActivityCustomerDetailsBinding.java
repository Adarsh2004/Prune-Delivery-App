package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import androidx.ViewBindings;
import androidx.viewbinding.ViewBinding;

import com.example.prunedeliveryapplication.R;

public final class ActivityCustomerDetailsBinding implements ViewBinding {
    public final RadioButton deliverLaterBut;
    public final RadioButton deliverNowBut;
    public final RadioButton otherBut;
    private final LinearLayout rootView;

    private ActivityCustomerDetailsBinding(LinearLayout rootView2, RadioButton deliverLaterBut2, RadioButton deliverNowBut2, RadioButton otherBut2) {
        this.rootView = rootView2;
        this.deliverLaterBut = deliverLaterBut2;
        this.deliverNowBut = deliverNowBut2;
        this.otherBut = otherBut2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCustomerDetailsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityCustomerDetailsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_customer_details, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityCustomerDetailsBinding bind(View rootView2) {
        int id = R.id.deliver_later_but;
        RadioButton deliverLaterBut2 = (RadioButton) ViewBindings.findChildViewById(rootView2, R.id.deliver_later_but);
        if (deliverLaterBut2 != null) {
            id = R.id.deliver_now_but;
            RadioButton deliverNowBut2 = (RadioButton) ViewBindings.findChildViewById(rootView2, R.id.deliver_now_but);
                if (deliverNowBut2 != null) {
                    id = R.id.other_but;
                    RadioButton otherBut2 = (RadioButton) ViewBindings.findChildViewById(rootView2, R.id.other_but);
                    if (otherBut2 != null) {
                        return new ActivityCustomerDetailsBinding((LinearLayout) rootView2, deliverLaterBut2, deliverNowBut2, otherBut2);
                    }
                }
            }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
