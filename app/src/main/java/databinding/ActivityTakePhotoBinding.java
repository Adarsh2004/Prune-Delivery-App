package databinding;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.ViewBindings;
import androidx.viewbinding.ViewBinding;
import com.example.prunedeliveryapplication.R;

public final class ActivityTakePhotoBinding implements ViewBinding {
    public final Button open_camera;
    public final TextureView texture;
    private final RelativeLayout rootView;

    private ActivityTakePhotoBinding(RelativeLayout rootView2, Button open_camera2, TextureView texture2) {
        this.rootView = rootView2;
        this.open_camera = open_camera2;
        this.texture = texture2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTakePhotoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityTakePhotoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_take_photo, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityTakePhotoBinding bind(View rootView2) {
        int id = R.id.open_camera;
        Button open_camera2 = (Button) ViewBindings.findChildViewById(rootView2, R.id.open_camera);
        if (open_camera2 != null) {
            id =  R.id.texture;
            TextureView texture2 = (TextureView) ViewBindings.findChildViewById(rootView2,  R.id.texture);
            if (texture2 != null) {
                    return new ActivityTakePhotoBinding((RelativeLayout) rootView2, open_camera2, texture2);
                }
            }

        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
