package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.ViewBindings;
import androidx.viewbinding.ViewBinding;
import com.example.prunedeliveryapplication.R;

public final class ActivityMainBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final ImageView splashimg;
    public final TextView textsplash;

    private ActivityMainBinding(LinearLayout rootView2, ImageView splashimg2, TextView textsplash2) {
        this.rootView = rootView2;
        this.splashimg = splashimg2;
        this.textsplash = textsplash2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_main, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityMainBinding bind(View rootView2) {
        int id = R.id.splashimg;
        ImageView splashimg2 = (ImageView) ViewBindings.findChildViewById(rootView2, R.id.splashimg);
        if (splashimg2 != null) {
            id = R.id.textsplash;
            TextView textsplash2 = (TextView) ViewBindings.findChildViewById(rootView2, R.id.textsplash);
            if (textsplash2 != null) {
                return new ActivityMainBinding((LinearLayout) rootView2, splashimg2, textsplash2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
