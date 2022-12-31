package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.ViewBindings;
import androidx.viewbinding.ViewBinding;
import com.example.prunedeliveryapplication.R;

public final class ActivityDrivingLicenseBinding implements ViewBinding {
    public final Button butDlEdit;
    public final Button butDlSava;
    public final TextView dlExpiryText;
    public final EditText fillDlNo;
    public final EditText fillExpiryDate;
    public final TextView licenseTextNo;
    public final ImageView photoDlBack;
    public final ImageView photoDlFront;
    private final LinearLayout rootView;
    public final TextView textBackDl;
    public final TextView textFontDl;
    public final TextView textHeadDriving;

    private ActivityDrivingLicenseBinding(LinearLayout rootView2, Button butDlEdit2, Button butDlSava2, TextView dlExpiryText2, EditText fillDlNo2, EditText fillExpiryDate2, TextView licenseTextNo2, ImageView photoDlBack2, ImageView photoDlFront2, TextView textBackDl2, TextView textFontDl2, TextView textHeadDriving2) {
        this.rootView = rootView2;
        this.butDlEdit = butDlEdit2;
        this.butDlSava = butDlSava2;
        this.dlExpiryText = dlExpiryText2;
        this.fillDlNo = fillDlNo2;
        this.fillExpiryDate = fillExpiryDate2;
        this.licenseTextNo = licenseTextNo2;
        this.photoDlBack = photoDlBack2;
        this.photoDlFront = photoDlFront2;
        this.textBackDl = textBackDl2;
        this.textFontDl = textFontDl2;
        this.textHeadDriving = textHeadDriving2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDrivingLicenseBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityDrivingLicenseBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_driving_license, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityDrivingLicenseBinding bind(View rootView2) {
        View view = rootView2;
        int id = R.id.but_dl_edit;
        Button butDlEdit2 = (Button) ViewBindings.findChildViewById(view, R.id.but_dl_edit);
        if (butDlEdit2 != null) {
            id =R.id.but_dl_sava;
            Button butDlSava2 = (Button) ViewBindings.findChildViewById(view,R.id.but_dl_sava);
            if (butDlSava2 != null) {
                id = R.id.dl_expiry_text;
                TextView dlExpiryText2 = (TextView) ViewBindings.findChildViewById(view, R.id.dl_expiry_text);
                if (dlExpiryText2 != null) {
                    id = R.id.fill_dl_no;
                    EditText fillDlNo2 = (EditText) ViewBindings.findChildViewById(view,R.id.fill_dl_no);
                    if (fillDlNo2 != null) {
                        id =R.id.fill_expiry_date;
                        EditText fillExpiryDate2 = (EditText) ViewBindings.findChildViewById(view, R.id.fill_expiry_date);
                        if (fillExpiryDate2 != null) {
                            id =R.id.license_text_no;
                            TextView licenseTextNo2 = (TextView) ViewBindings.findChildViewById(view, R.id.license_text_no);
                            if (licenseTextNo2 != null) {
                                id =R.id.photo_dl_back;
                                ImageView photoDlBack2 = (ImageView) ViewBindings.findChildViewById(view, R.id.photo_dl_back);
                                if (photoDlBack2 != null) {
                                    id = R.id.photo_dl_front;
                                    ImageView photoDlFront2 = (ImageView) ViewBindings.findChildViewById(view, R.id.photo_dl_front);
                                    if (photoDlFront2 != null) {
                                        id = R.id.text_back_dl;
                                        TextView textBackDl2 = (TextView) ViewBindings.findChildViewById(view,R.id.text_back_dl);
                                        if (textBackDl2 != null) {
                                            id = R.id.text_font_dl;
                                            TextView textFontDl2 = (TextView) ViewBindings.findChildViewById(view, R.id.text_font_dl);
                                            if (textFontDl2 != null) {
                                                id =R.id.text_head_driving;
                                                TextView textHeadDriving2 = (TextView) ViewBindings.findChildViewById(view,R.id.text_head_driving);
                                                if (textHeadDriving2 != null) {
                                                    return new ActivityDrivingLicenseBinding((LinearLayout) view, butDlEdit2, butDlSava2, dlExpiryText2, fillDlNo2, fillExpiryDate2, licenseTextNo2, photoDlBack2, photoDlFront2, textBackDl2, textFontDl2, textHeadDriving2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
