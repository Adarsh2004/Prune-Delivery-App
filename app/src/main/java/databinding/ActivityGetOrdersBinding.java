package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.ViewBindings;
import androidx.viewbinding.ViewBinding;
import com.example.prunedeliveryapplication.R;

public final class ActivityGetOrdersBinding implements ViewBinding {
    public final Button orderAcceptBut;
    public final TextView orderIdTextTop;
    private final LinearLayout rootView;

    private ActivityGetOrdersBinding(LinearLayout rootView2, Button orderAcceptBut2, TextView orderIdTextTop2) {
        this.rootView = rootView2;
        this.orderAcceptBut = orderAcceptBut2;
        this.orderIdTextTop = orderIdTextTop2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityGetOrdersBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityGetOrdersBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_get_orders, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityGetOrdersBinding bind(View rootView2) {
        int id = R.id.order_accept_but;
        Button orderAcceptBut2 = (Button) ViewBindings.findChildViewById(rootView2, R.id.order_accept_but);
        if (orderAcceptBut2 != null) {
            id = R.id.order_id_text_top;
            TextView orderIdTextTop2 = (TextView) ViewBindings.findChildViewById(rootView2, R.id.order_id_text_top);
            if (orderIdTextTop2 != null) {
                return new ActivityGetOrdersBinding((LinearLayout) rootView2, orderAcceptBut2, orderIdTextTop2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
