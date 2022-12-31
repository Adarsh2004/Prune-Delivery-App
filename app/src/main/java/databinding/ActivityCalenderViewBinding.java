package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.LinearLayout;

import androidx.ViewBindings;
import androidx.viewbinding.ViewBinding;

import com.example.prunedeliveryapplication.R;

public final class ActivityCalenderViewBinding implements ViewBinding {
    public final CalendarView calenderView;
    private final LinearLayout rootView;

    private ActivityCalenderViewBinding(LinearLayout rootView2, CalendarView calenderView2) {
        this.rootView = rootView2;
        this.calenderView = calenderView2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCalenderViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityCalenderViewBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_calender_view, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityCalenderViewBinding bind(View rootView2) {
        CalendarView calenderView2 = (CalendarView) ViewBindings.findChildViewById(rootView2, R.id.calender_view);
        if (calenderView2 != null) {
            return new ActivityCalenderViewBinding((LinearLayout) rootView2, calenderView2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(R.id.calender_view)));
    }
}
