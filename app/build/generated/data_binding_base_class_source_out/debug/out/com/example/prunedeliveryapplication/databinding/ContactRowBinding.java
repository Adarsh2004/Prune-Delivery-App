// Generated by view binder compiler. Do not edit!
package com.example.prunedeliveryapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prunedeliveryapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContactRowBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView OrderType;

  @NonNull
  public final TextView OrderTypeId;

  @NonNull
  public final LinearLayout Row1;

  @NonNull
  public final LinearLayout Row2;

  @NonNull
  public final LinearLayout Row3;

  @NonNull
  public final LinearLayout Row4;

  @NonNull
  public final LinearLayout Row5;

  @NonNull
  public final LinearLayout Row6;

  @NonNull
  public final TextView TimeSlot;

  @NonNull
  public final TextView TimeSlotId;

  @NonNull
  public final Button acceptButton;

  @NonNull
  public final TextView address;

  @NonNull
  public final TextView addressId;

  @NonNull
  public final TextView area;

  @NonNull
  public final TextView areaId;

  @NonNull
  public final CardView cardView1;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final CardView cardView3;

  @NonNull
  public final CardView cardView4;

  @NonNull
  public final CardView cardView5;

  @NonNull
  public final CardView cardView6;

  @NonNull
  public final ImageView errorOutlineimg;

  @NonNull
  public final ImageView locationId;

  @NonNull
  public final TextView locationText;

  @NonNull
  public final TextView order;

  @NonNull
  public final TextView orderId;

  private ContactRowBinding(@NonNull CardView rootView, @NonNull TextView OrderType,
      @NonNull TextView OrderTypeId, @NonNull LinearLayout Row1, @NonNull LinearLayout Row2,
      @NonNull LinearLayout Row3, @NonNull LinearLayout Row4, @NonNull LinearLayout Row5,
      @NonNull LinearLayout Row6, @NonNull TextView TimeSlot, @NonNull TextView TimeSlotId,
      @NonNull Button acceptButton, @NonNull TextView address, @NonNull TextView addressId,
      @NonNull TextView area, @NonNull TextView areaId, @NonNull CardView cardView1,
      @NonNull CardView cardView2, @NonNull CardView cardView3, @NonNull CardView cardView4,
      @NonNull CardView cardView5, @NonNull CardView cardView6, @NonNull ImageView errorOutlineimg,
      @NonNull ImageView locationId, @NonNull TextView locationText, @NonNull TextView order,
      @NonNull TextView orderId) {
    this.rootView = rootView;
    this.OrderType = OrderType;
    this.OrderTypeId = OrderTypeId;
    this.Row1 = Row1;
    this.Row2 = Row2;
    this.Row3 = Row3;
    this.Row4 = Row4;
    this.Row5 = Row5;
    this.Row6 = Row6;
    this.TimeSlot = TimeSlot;
    this.TimeSlotId = TimeSlotId;
    this.acceptButton = acceptButton;
    this.address = address;
    this.addressId = addressId;
    this.area = area;
    this.areaId = areaId;
    this.cardView1 = cardView1;
    this.cardView2 = cardView2;
    this.cardView3 = cardView3;
    this.cardView4 = cardView4;
    this.cardView5 = cardView5;
    this.cardView6 = cardView6;
    this.errorOutlineimg = errorOutlineimg;
    this.locationId = locationId;
    this.locationText = locationText;
    this.order = order;
    this.orderId = orderId;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ContactRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContactRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.contact_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContactRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Order_Type;
      TextView OrderType = ViewBindings.findChildViewById(rootView, id);
      if (OrderType == null) {
        break missingId;
      }

      id = R.id.Order_Type_id;
      TextView OrderTypeId = ViewBindings.findChildViewById(rootView, id);
      if (OrderTypeId == null) {
        break missingId;
      }

      id = R.id.Row1;
      LinearLayout Row1 = ViewBindings.findChildViewById(rootView, id);
      if (Row1 == null) {
        break missingId;
      }

      id = R.id.Row2;
      LinearLayout Row2 = ViewBindings.findChildViewById(rootView, id);
      if (Row2 == null) {
        break missingId;
      }

      id = R.id.Row3;
      LinearLayout Row3 = ViewBindings.findChildViewById(rootView, id);
      if (Row3 == null) {
        break missingId;
      }

      id = R.id.Row4;
      LinearLayout Row4 = ViewBindings.findChildViewById(rootView, id);
      if (Row4 == null) {
        break missingId;
      }

      id = R.id.Row5;
      LinearLayout Row5 = ViewBindings.findChildViewById(rootView, id);
      if (Row5 == null) {
        break missingId;
      }

      id = R.id.Row6;
      LinearLayout Row6 = ViewBindings.findChildViewById(rootView, id);
      if (Row6 == null) {
        break missingId;
      }

      id = R.id.Time_Slot;
      TextView TimeSlot = ViewBindings.findChildViewById(rootView, id);
      if (TimeSlot == null) {
        break missingId;
      }

      id = R.id.Time_Slot_id;
      TextView TimeSlotId = ViewBindings.findChildViewById(rootView, id);
      if (TimeSlotId == null) {
        break missingId;
      }

      id = R.id.accept_button;
      Button acceptButton = ViewBindings.findChildViewById(rootView, id);
      if (acceptButton == null) {
        break missingId;
      }

      id = R.id.address;
      TextView address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.address_id;
      TextView addressId = ViewBindings.findChildViewById(rootView, id);
      if (addressId == null) {
        break missingId;
      }

      id = R.id.area;
      TextView area = ViewBindings.findChildViewById(rootView, id);
      if (area == null) {
        break missingId;
      }

      id = R.id.area_id;
      TextView areaId = ViewBindings.findChildViewById(rootView, id);
      if (areaId == null) {
        break missingId;
      }

      id = R.id.cardView1;
      CardView cardView1 = ViewBindings.findChildViewById(rootView, id);
      if (cardView1 == null) {
        break missingId;
      }

      id = R.id.cardView2;
      CardView cardView2 = ViewBindings.findChildViewById(rootView, id);
      if (cardView2 == null) {
        break missingId;
      }

      id = R.id.cardView3;
      CardView cardView3 = ViewBindings.findChildViewById(rootView, id);
      if (cardView3 == null) {
        break missingId;
      }

      id = R.id.cardView4;
      CardView cardView4 = ViewBindings.findChildViewById(rootView, id);
      if (cardView4 == null) {
        break missingId;
      }

      id = R.id.cardView5;
      CardView cardView5 = ViewBindings.findChildViewById(rootView, id);
      if (cardView5 == null) {
        break missingId;
      }

      id = R.id.cardView6;
      CardView cardView6 = ViewBindings.findChildViewById(rootView, id);
      if (cardView6 == null) {
        break missingId;
      }

      id = R.id.error_outlineimg;
      ImageView errorOutlineimg = ViewBindings.findChildViewById(rootView, id);
      if (errorOutlineimg == null) {
        break missingId;
      }

      id = R.id.location_id;
      ImageView locationId = ViewBindings.findChildViewById(rootView, id);
      if (locationId == null) {
        break missingId;
      }

      id = R.id.location_text;
      TextView locationText = ViewBindings.findChildViewById(rootView, id);
      if (locationText == null) {
        break missingId;
      }

      id = R.id.order;
      TextView order = ViewBindings.findChildViewById(rootView, id);
      if (order == null) {
        break missingId;
      }

      id = R.id.order_id;
      TextView orderId = ViewBindings.findChildViewById(rootView, id);
      if (orderId == null) {
        break missingId;
      }

      return new ContactRowBinding((CardView) rootView, OrderType, OrderTypeId, Row1, Row2, Row3,
          Row4, Row5, Row6, TimeSlot, TimeSlotId, acceptButton, address, addressId, area, areaId,
          cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, errorOutlineimg,
          locationId, locationText, order, orderId);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
