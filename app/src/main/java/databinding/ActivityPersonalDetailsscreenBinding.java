package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.ViewBindings;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;

import com.example.prunedeliveryapplication.R;

public final class ActivityPersonalDetailsscreenBinding implements ViewBinding {
    public final TextView createAccount;
    public final Spinner languageListMenu;
    private final LinearLayout rootView;
    public final Button secSubSubmit;
    public final CardView subVerify1;
    public final CardView subVerify2;
    public final CardView subVerify3;
    public final CardView subVerify4;
    public final ImageView subbuttFirst;
    public final ImageView subbuttThird;
    public final TextView subheadFourth;
    public final TextView subsecondHead;
    public final TextView subtextFirst;
    public final TextView subthirdHead;
    public final ImageView subuttFour;
    public final ImageView subuttSec;
    public final TextView textSub;

    private ActivityPersonalDetailsscreenBinding(LinearLayout rootView2, TextView createAccount2, Spinner languageListMenu2, Button secSubSubmit2, CardView subVerify12, CardView subVerify22, CardView subVerify32, CardView subVerify42, ImageView subbuttFirst2, ImageView subbuttThird2, TextView subheadFourth2, TextView subsecondHead2, TextView subtextFirst2, TextView subthirdHead2, ImageView subuttFour2, ImageView subuttSec2, TextView textSub2) {
        this.rootView = rootView2;
        this.createAccount = createAccount2;
        this.languageListMenu = languageListMenu2;
        this.secSubSubmit = secSubSubmit2;
        this.subVerify1 = subVerify12;
        this.subVerify2 = subVerify22;
        this.subVerify3 = subVerify32;
        this.subVerify4 = subVerify42;
        this.subbuttFirst = subbuttFirst2;
        this.subbuttThird = subbuttThird2;
        this.subheadFourth = subheadFourth2;
        this.subsecondHead = subsecondHead2;
        this.subtextFirst = subtextFirst2;
        this.subthirdHead = subthirdHead2;
        this.subuttFour = subuttFour2;
        this.subuttSec = subuttSec2;
        this.textSub = textSub2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPersonalDetailsscreenBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityPersonalDetailsscreenBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_personal_details_screen, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityPersonalDetailsscreenBinding bind(View rootView2) {
        View view = rootView2;
        int id = R.id.create_account;
        TextView createAccount2 = (TextView) ViewBindings.findChildViewById(view, R.id.create_account);
        if (createAccount2 != null) {
            id = R.id.language_list_menu;
            Spinner languageListMenu2 = (Spinner) ViewBindings.findChildViewById(view,R.id.language_list_menu);
                if (languageListMenu2 != null) {
                    id = R.id.sec_sub_submit;
                    Button secSubSubmit2 = (Button) ViewBindings.findChildViewById(view, R.id.sec_sub_submit);
                    if (secSubSubmit2 != null) {
                        id = R.id.sub_verify1;
                        CardView subVerify12 = (CardView) ViewBindings.findChildViewById(view, R.id.sub_verify1);
                        if (subVerify12 != null) {
                            id = R.id.sub_verify2;
                            CardView subVerify22 = (CardView) ViewBindings.findChildViewById(view, R.id.sub_verify2);
                            if (subVerify22 != null) {
                                id = R.id.sub_verify3;
                                CardView subVerify32 = (CardView) ViewBindings.findChildViewById(view,R.id.sub_verify3);
                                if (subVerify32 != null) {
                                    id = R.id.sub_verify4;
                                    CardView subVerify42 = (CardView) ViewBindings.findChildViewById(view,R.id.sub_verify4);
                                    if (subVerify42 != null) {
                                        id = R.id.subbutt_first;
                                        ImageView subbuttFirst2 = (ImageView) ViewBindings.findChildViewById(view, R.id.subbutt_first);
                                        if (subbuttFirst2 != null) {
                                            id = R.id.subbutt_third;
                                            ImageView subbuttThird2 = (ImageView) ViewBindings.findChildViewById(view, R.id.subbutt_third);
                                            if (subbuttThird2 != null) {
                                                id = R.id.subhead_fourth;
                                                TextView subheadFourth2 = (TextView) ViewBindings.findChildViewById(view, R.id.subhead_fourth);
                                                if (subheadFourth2 != null) {
                                                    id = R.id.subsecond_head;
                                                    TextView subsecondHead2 = (TextView) ViewBindings.findChildViewById(view, R.id.subsecond_head);
                                                    if (subsecondHead2 != null) {
                                                        id = R.id.subtext_first;
                                                        TextView subtextFirst2 = (TextView) ViewBindings.findChildViewById(view, R.id.subtext_first);
                                                        if (subtextFirst2 != null) {
                                                            id = R.id.subthird_head;
                                                            TextView subthirdHead2 = (TextView) ViewBindings.findChildViewById(view, R.id.subthird_head);
                                                            if (subthirdHead2 != null) {
                                                                id = R.id.subutt_four;
                                                                ImageView subuttFour2 = (ImageView) ViewBindings.findChildViewById(view, R.id.subutt_four);
                                                                if (subuttFour2 != null) {
                                                                    id = R.id.subutt_sec;
                                                                    ImageView subuttSec2 = (ImageView) ViewBindings.findChildViewById(view, R.id.subutt_sec);
                                                                    if (subuttSec2 != null) {
                                                                        id = R.id.text_sub;
                                                                        TextView textSub2 = (TextView) ViewBindings.findChildViewById(view, R.id.text_sub);
                                                                        if (textSub2 != null) {
                                                                            return new ActivityPersonalDetailsscreenBinding((LinearLayout) view, createAccount2, languageListMenu2, secSubSubmit2, subVerify12, subVerify22, subVerify32, subVerify42, subbuttFirst2, subbuttThird2, subheadFourth2, subsecondHead2, subtextFirst2, subthirdHead2, subuttFour2, subuttSec2, textSub2);
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
                        }
                    }
                }
            }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
