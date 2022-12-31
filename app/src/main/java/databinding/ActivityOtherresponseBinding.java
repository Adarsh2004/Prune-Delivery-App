package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import androidx.ViewBindings;
import androidx.viewbinding.ViewBinding;

import com.example.prunedeliveryapplication.R;

public final class ActivityOtherresponseBinding implements ViewBinding {
    public final RadioButton lineBusyBut;
    public final RadioButton notDelioverableAreaBut;
    public final RadioButton notInterestedBut;
    public final RadioButton refuseBut;
    private final LinearLayout rootView;
    public final Button saveResponse;
    public final RadioButton switchOffBut;

    private ActivityOtherresponseBinding(LinearLayout rootView2, RadioButton lineBusyBut2, RadioButton notDelioverableAreaBut2, RadioButton notInterestedBut2, RadioButton refuseBut2, Button saveResponse2, RadioButton switchOffBut2) {
        this.rootView = rootView2;
        this.lineBusyBut = lineBusyBut2;
        this.notDelioverableAreaBut = notDelioverableAreaBut2;
        this.notInterestedBut = notInterestedBut2;
        this.refuseBut = refuseBut2;
        this.saveResponse = saveResponse2;
        this.switchOffBut = switchOffBut2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityOtherresponseBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityOtherresponseBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_otherresponse, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityOtherresponseBinding bind(View rootView2) {
        View view = rootView2;
        int id = R.id.line_busy_but;
        RadioButton lineBusyBut2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.line_busy_but);
        if (lineBusyBut2 != null) {
            id = R.id.not_delioverable_area_but;
            RadioButton notDelioverableAreaBut2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.not_delioverable_area_but);
            if (notDelioverableAreaBut2 != null) {
                id = R.id.not_interested_but;
                RadioButton notInterestedBut2 = (RadioButton) ViewBindings.findChildViewById(view,R.id.not_interested_but);
                if (notInterestedBut2 != null) {
                    id = R.id.refuse_but;
                    RadioButton refuseBut2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.refuse_but);
                    if (refuseBut2 != null) {
                        id = R.id.save_response;
                        Button saveResponse2 = (Button) ViewBindings.findChildViewById(view, R.id.save_response);
                        if (saveResponse2 != null) {
                            id = R.id.switch_off_but;
                            RadioButton switchOffBut2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.switch_off_but);
                            if (switchOffBut2 != null) {
                                return new ActivityOtherresponseBinding((LinearLayout) view, lineBusyBut2, notDelioverableAreaBut2, notInterestedBut2, refuseBut2, saveResponse2, switchOffBut2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
