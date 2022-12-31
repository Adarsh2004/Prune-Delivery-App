package databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.ViewBindings;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;

import com.example.prunedeliveryapplication.R;

public final class ActivityComplVerifyBinding implements ViewBinding {
    public final ImageView buttFive;
    public final ImageView buttFour;
    public final ImageView buttSec;
    public final ImageView buttThird;
    public final TextView contentFive;
    public final TextView contentFour;
    public final TextView contentSec;
    public final TextView contentThird;
    public final TextView createAccount;
    public final Button createAccountBut;
    public final TextView headFive;
    public final TextView headFourth;
    public AutoCompleteTextView autoCompleteTextView;
    private final LinearLayout rootView;
    public final TextView secondHead;
    public final TextView textOffer;
    public final TextView thirdHead;
    public final CardView verifyCard1;
    public final CardView verifyCard2;
    public final CardView verifyCard3;
    public final CardView verifyCard4;

    private ActivityComplVerifyBinding(LinearLayout rootView2, ImageView buttFive2, ImageView buttFour2, ImageView buttSec2, ImageView buttThird2, TextView contentFive2, TextView contentFour2, TextView contentSec2, TextView contentThird2, TextView createAccount2, Button createAccountBut2, TextView headFive2, TextView headFourth2, AutoCompleteTextView autoCompleteTextView, TextView secondHead2, TextView textOffer2, TextView thirdHead2, CardView verifyCard12, CardView verifyCard22, CardView verifyCard32, CardView verifyCard42) {
        this.rootView = rootView2;
        this.buttFive = buttFive2;
        this.buttFour = buttFour2;
        this.buttSec = buttSec2;
        this.buttThird = buttThird2;
        this.contentFive = contentFive2;
        this.contentFour = contentFour2;
        this.contentSec = contentSec2;
        this.contentThird = contentThird2;
        this.createAccount = createAccount2;
        this.createAccountBut = createAccountBut2;
        this.autoCompleteTextView = autoCompleteTextView;
        this.headFive = headFive2;
        this.headFourth = headFourth2;
        this.secondHead = secondHead2;
        this.textOffer = textOffer2;
        this.thirdHead = thirdHead2;
        this.verifyCard1 = verifyCard12;
        this.verifyCard2 = verifyCard22;
        this.verifyCard3 = verifyCard32;
        this.verifyCard4 = verifyCard42;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityComplVerifyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityComplVerifyBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_compl_verify, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityComplVerifyBinding bind(View rootView2) {
        View view = rootView2;
        int id = R.id.butt_five;
        ImageView buttFive2 = (ImageView) ViewBindings.findChildViewById(view, R.id.butt_five);
        if (buttFive2 != null) {
            id = R.id.butt_four;
            ImageView buttFour2 = (ImageView) ViewBindings.findChildViewById(view,R.id.butt_four);
            if (buttFour2 != null) {
                id = R.id.butt_sec;
                ImageView buttSec2 = (ImageView) ViewBindings.findChildViewById(view, R.id.butt_sec);
                if (buttSec2 != null) {
                    id = R.id.butt_third;
                    ImageView buttThird2 = (ImageView) ViewBindings.findChildViewById(view, R.id.butt_third);
                    if (buttThird2 != null) {
                        id = R.id.content_five;
                        TextView contentFive2 = (TextView) ViewBindings.findChildViewById(view, R.id.content_five);
                        if (contentFive2 != null) {
                            id = R.id.content_four;
                            TextView contentFour2 = (TextView) ViewBindings.findChildViewById(view,R.id.content_four);
                            if (contentFour2 != null) {
                                id = R.id.content_sec;
                                TextView contentSec2 = (TextView) ViewBindings.findChildViewById(view, R.id.content_sec);
                                if (contentSec2 != null) {
                                    id =R.id.content_third;
                                    TextView contentThird2 = (TextView) ViewBindings.findChildViewById(view, R.id.content_third);
                                    if (contentThird2 != null) {
                                        id = R.id.create_account;
                                        TextView createAccount2 = (TextView) ViewBindings.findChildViewById(view, R.id.create_account);
                                        if (createAccount2 != null) {
                                            id =R.id.create_account_but;
                                            Button createAccountBut2 = (Button) ViewBindings.findChildViewById(view, R.id.create_account_but);
                                            if (createAccountBut2 != null) {
                                                id = R.id.head_five;
                                                TextView headFive2 = (TextView) ViewBindings.findChildViewById(view, R.id.head_five);
                                                if (headFive2 != null) {
                                                    id = R.id.head_fourth;
                                                    TextView headFourth2 = (TextView) ViewBindings.findChildViewById(view,R.id.head_fourth);
                                                        if (headFourth2 != null) {
                                                            id = R.id.rg_language;
                                                            AutoCompleteTextView autoCompleteTextView =  ViewBindings.findChildViewById(view,R.id.rg_language);
                                                                if (autoCompleteTextView != null) {
                                                                    id = R.id.second_head;
                                                                    TextView secondHead2 = (TextView) ViewBindings.findChildViewById(view, R.id.second_head);
                                                                    if (secondHead2 != null) {
                                                                        id = R.id.text_offer;
                                                                        TextView textOffer2 = (TextView) ViewBindings.findChildViewById(view, R.id.text_offer);
                                                                        if (textOffer2 != null) {
                                                                            id = R.id.third_head;
                                                                            TextView thirdHead2 = (TextView) ViewBindings.findChildViewById(view, R.id.third_head);
                                                                            if (thirdHead2 != null) {
                                                                                id = R.id.verify_card1;
                                                                                CardView verifyCard12 = (CardView) ViewBindings.findChildViewById(view,R.id.verify_card1);
                                                                                if (verifyCard12 != null) {
                                                                                    id = R.id.verify_card2;
                                                                                    CardView verifyCard22 = (CardView) ViewBindings.findChildViewById(view, R.id.verify_card2);
                                                                                    if (verifyCard22 != null) {
                                                                                        id = R.id.verify_card3;
                                                                                        CardView verifyCard32 = (CardView) ViewBindings.findChildViewById(view, R.id.verify_card3);
                                                                                        if (verifyCard32 != null) {
                                                                                            id = R.id.verify_card4;
                                                                                            CardView verifyCard42 = (CardView) ViewBindings.findChildViewById(view, R.id.verify_card4);
                                                                                            if (verifyCard42 != null) {
                                                                                                return new ActivityComplVerifyBinding((LinearLayout) view, buttFive2, buttFour2, buttSec2, buttThird2, contentFive2, contentFour2, contentSec2, contentThird2, createAccount2, createAccountBut2, headFive2, headFourth2,autoCompleteTextView, secondHead2, textOffer2, thirdHead2, verifyCard12, verifyCard22, verifyCard32, verifyCard42);
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
                            }
                        }
                    }
                }


        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
