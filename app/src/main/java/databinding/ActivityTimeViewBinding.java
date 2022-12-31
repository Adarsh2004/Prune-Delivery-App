package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.ViewBindings;
import androidx.viewbinding.ViewBinding;
import com.example.prunedeliveryapplication.R;

public final class ActivityTimeViewBinding implements ViewBinding {
    public final Button button1;
    private final RelativeLayout rootView;
    public final TextView textView1;
    public final TimePicker timePicker;

    private ActivityTimeViewBinding(RelativeLayout rootView2, Button button12, TextView textView12, TimePicker timePicker2) {
        this.rootView = rootView2;
        this.button1 = button12;
        this.textView1 = textView12;
        this.timePicker = timePicker2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTimeViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityTimeViewBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_time_view, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityTimeViewBinding bind(View rootView2) {
        int id = R.id.button1;
        Button button12 = (Button) ViewBindings.findChildViewById(rootView2, R.id.button1);
        if (button12 != null) {
            id = R.id.textView1;
            TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView2, R.id.textView1);
            if (textView12 != null) {
                id = R.id.timePicker;
                TimePicker timePicker2 = (TimePicker) ViewBindings.findChildViewById(rootView2, R.id.timePicker);
                if (timePicker2 != null) {
                    return new ActivityTimeViewBinding((RelativeLayout) rootView2, button12, textView12, timePicker2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
