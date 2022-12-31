package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.prunedeliveryapplication.R;

public final class ActivityDirectSellBinding implements ViewBinding {
    private final ConstraintLayout rootView;

    private ActivityDirectSellBinding(ConstraintLayout rootView2) {
        this.rootView = rootView2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDirectSellBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityDirectSellBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_direct_sell, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityDirectSellBinding bind(View rootView2) {
        if (rootView2 != null) {
            return new ActivityDirectSellBinding((ConstraintLayout) rootView2);
        }
        throw new NullPointerException("rootView");
    }
}
