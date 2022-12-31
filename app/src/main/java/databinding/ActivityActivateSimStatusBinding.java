package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.ViewBindings;
import androidx.viewbinding.ViewBinding;

import com.example.prunedeliveryapplication.R;

public final class ActivityActivateSimStatusBinding implements ViewBinding {
    public final Button activatebutt;
    public final EditText addressSim;
    public final EditText mobileActivate;
    public final EditText planSim;
    private final LinearLayout rootView;
    public final EditText simActivate;
    public final TextView textActivateSimHead;
    public final TextView textAddress;
    public final TextView textMobileSim;
    public final TextView textNameSim;
    public final TextView textPlan;
    public final TextView textSim;
    public final EditText usersignSim;

    private ActivityActivateSimStatusBinding(LinearLayout rootView2, Button activatebutt2, EditText addressSim2, EditText mobileActivate2, EditText planSim2, EditText simActivate2, TextView textActivateSimHead2, TextView textAddress2, TextView textMobileSim2, TextView textNameSim2, TextView textPlan2, TextView textSim2, EditText usersignSim2) {
        this.rootView = rootView2;
        this.activatebutt = activatebutt2;
        this.addressSim = addressSim2;
        this.mobileActivate = mobileActivate2;
        this.planSim = planSim2;
        this.simActivate = simActivate2;
        this.textActivateSimHead = textActivateSimHead2;
        this.textAddress = textAddress2;
        this.textMobileSim = textMobileSim2;
        this.textNameSim = textNameSim2;
        this.textPlan = textPlan2;
        this.textSim = textSim2;
        this.usersignSim = usersignSim2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityActivateSimStatusBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityActivateSimStatusBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_activate_sim_status, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityActivateSimStatusBinding bind(View rootView2) {
        View view = rootView2;
        int id = R.id.activatebutt;
        Button activatebutt2 = (Button) ViewBindings.findChildViewById(view, R.id.activatebutt);
        if (activatebutt2 != null) {
            id = R.id.address_sim;
            EditText addressSim2 = (EditText) ViewBindings.findChildViewById(view, R.id.address_sim);
            if (addressSim2 != null) {
                id = R.id.mobile_activate;
                EditText mobileActivate2 = (EditText) ViewBindings.findChildViewById(view,R.id.mobile_activate);
                if (mobileActivate2 != null) {
                    id = R.id.plan_sim;
                    EditText planSim2 = (EditText) ViewBindings.findChildViewById(view, R.id.plan_sim);
                    if (planSim2 != null) {
                        id = R.id.sim_activate;
                        EditText simActivate2 = (EditText) ViewBindings.findChildViewById(view, R.id.sim_activate);
                        if (simActivate2 != null) {
                            id = R.id.text_activate_sim_head;
                            TextView textActivateSimHead2 = (TextView) ViewBindings.findChildViewById(view, R.id.text_activate_sim_head);
                            if (textActivateSimHead2 != null) {
                                id = R.id.text_address;
                                TextView textAddress2 = (TextView) ViewBindings.findChildViewById(view, R.id.text_address);
                                if (textAddress2 != null) {
                                    id = R.id.text_mobile_sim;
                                    TextView textMobileSim2 = (TextView) ViewBindings.findChildViewById(view,R.id.text_mobile_sim);
                                    if (textMobileSim2 != null) {
                                        id = R.id.text_name_sim;
                                        TextView textNameSim2 = (TextView) ViewBindings.findChildViewById(view, R.id.text_name_sim);
                                        if (textNameSim2 != null) {
                                            id = R.id.text_plan;
                                            TextView textPlan2 = (TextView) ViewBindings.findChildViewById(view, R.id.text_plan);
                                            if (textPlan2 != null) {
                                                id = R.id.text_sim;
                                                TextView textSim2 = (TextView) ViewBindings.findChildViewById(view, R.id.text_sim);
                                                if (textSim2 != null) {
                                                    id = R.id.usersign_sim;
                                                    EditText usersignSim2 = (EditText) ViewBindings.findChildViewById(view, R.id.usersign_sim);
                                                    if (usersignSim2 != null) {
                                                        return new ActivityActivateSimStatusBinding((LinearLayout) view, activatebutt2, addressSim2, mobileActivate2, planSim2, simActivate2, textActivateSimHead2, textAddress2, textMobileSim2, textNameSim2, textPlan2, textSim2, usersignSim2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
