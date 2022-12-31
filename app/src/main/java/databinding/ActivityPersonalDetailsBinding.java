package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.ViewBindings;
import androidx.viewbinding.ViewBinding;

import com.example.prunedeliveryapplication.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public final class ActivityPersonalDetailsBinding implements ViewBinding {
    public final Button butPerEdit;
    public final Button butPerSubmit;
    public final EditText dlBlank;
    public final EditText dobBlank;
    public final EditText ifscBlank;
    public final EditText nameBlank;
    public final TextView personalBankText;
    public final TextInputLayout personalDetailsText;
    private final LinearLayout rootView;
    public final TextView textAccountPersonal;
    public final TextView textBankPersonal;
    public final TextInputLayout auto_complete_text2;

    private ActivityPersonalDetailsBinding(LinearLayout rootView2, Button butPerEdit2, Button butPerSubmit2, EditText dlBlank2, EditText dobBlank2, EditText ifscBlank2, EditText nameBlank2, TextView personalBankText2, TextInputLayout personalDetailsText2, TextView textAccountPersonal2, TextView textBankPersonal2, TextInputLayout auto_complete_text2) {
        this.rootView = rootView2;
        this.butPerEdit = butPerEdit2;
        this.butPerSubmit = butPerSubmit2;
        this.dlBlank = dlBlank2;
        this.dobBlank = dobBlank2;
        this.ifscBlank = ifscBlank2;
        this.nameBlank = nameBlank2;
        this.personalBankText = personalBankText2;
        this.personalDetailsText = personalDetailsText2;
        this.textAccountPersonal = textAccountPersonal2;
        this.textBankPersonal = textBankPersonal2;
        this.auto_complete_text2 = auto_complete_text2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPersonalDetailsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityPersonalDetailsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_personal_details, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityPersonalDetailsBinding bind(View rootView2) {
        View view = rootView2;
        int id = R.id.but_per_edit;
        Button butPerEdit2 = (Button) ViewBindings.findChildViewById(view, R.id.but_per_edit);
        if (butPerEdit2 != null) {
            id = R.id.but_per_submit;
            Button butPerSubmit2 = (Button) ViewBindings.findChildViewById(view, R.id.but_per_submit);
            if (butPerSubmit2 != null) {
                id = R.id.address_blank;
               TextInputEditText address_blank = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.address_blank);
                if (address_blank != null) {
                    id = R.id.dob_blank;
                    EditText dobBlank2 = (EditText) ViewBindings.findChildViewById(view, R.id.dob_blank);
                    if (dobBlank2 != null) {
                        id = R.id.name_blank;
                        EditText nameBlank2 = (EditText) ViewBindings.findChildViewById(view, R.id.name_blank);
                        if (nameBlank2 != null) {
                            id = R.id.auto_complete_text;
                            AutoCompleteTextView panBlank2 = (AutoCompleteTextView) ViewBindings.findChildViewById(view, R.id.auto_complete_text);
                            if (panBlank2 != null) {
                                id = R.id.personal_details_text;
                                TextView personalDetailsText2 = (TextView) ViewBindings.findChildViewById(view, R.id.personal_details_text);
                                if (personalDetailsText2 != null) {
                                    id = R.id.text_address_personal;
                                    TextInputLayout text_address_personal = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.text_address_personal);
                                    if (text_address_personal != null) {
                                        id = R.id.text_dob_personal;
                                        TextView textDobPersonal2 = (TextView) ViewBindings.findChildViewById(view, R.id.text_dob_personal);
                                        if (textDobPersonal2 != null) {
                                            id = R.id.text_name_personal;
                                            TextView textNamePersonal2 = (TextView) ViewBindings.findChildViewById(view, R.id.text_name_personal);
                                            if (textNamePersonal2 != null) {
                                                id = R.id.auto_complete_text2;
                                                TextInputLayout auto_complete_text2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.auto_complete_text2);
                                                if (auto_complete_text2 != null) {
                                                    return new ActivityPersonalDetailsBinding((LinearLayout) view, butPerEdit2, butPerSubmit2, address_blank, dobBlank2, nameBlank2, panBlank2, personalDetailsText2, text_address_personal, textDobPersonal2, textNamePersonal2, auto_complete_text2);
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
