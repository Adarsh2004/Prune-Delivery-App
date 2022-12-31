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

public final class ActivityEditProfileBinding implements ViewBinding {
    public final TextView addressEdit;
    public final ImageView imageEdit;
    public final TextView nameEdit;
    private final LinearLayout rootView;

    private ActivityEditProfileBinding(LinearLayout rootView2, TextView addressEdit2, ImageView imageEdit2, TextView nameEdit2) {
        this.rootView = rootView2;
        this.addressEdit = addressEdit2;
        this.imageEdit = imageEdit2;
        this.nameEdit = nameEdit2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityEditProfileBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityEditProfileBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_edit_profile, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityEditProfileBinding bind(View rootView2) {
        int id = R.id.address_edit;
        TextView addressEdit2 = (TextView) ViewBindings.findChildViewById(rootView2, R.id.address_edit);
        if (addressEdit2 != null) {
            id = R.id.image_edit;
            ImageView imageEdit2 = (ImageView) ViewBindings.findChildViewById(rootView2, R.id.image_edit);
            if (imageEdit2 != null) {
                id = R.id.name_edit;
                TextView nameEdit2 = (TextView) ViewBindings.findChildViewById(rootView2, R.id.name_edit);
                if (nameEdit2 != null) {
                    return new ActivityEditProfileBinding((LinearLayout) rootView2, addressEdit2, imageEdit2, nameEdit2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
