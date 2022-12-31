package com.example.prunedeliveryapplication;

public class BottomSheet_CloseCallBack {
    private static BottomSheet_CloseCallBack onSelect_callBAck;

    private BottomSheet_CloseCallBack.interface_BottomSheetCloseCallBack interface_BottomSheetCloseCallBack;

    public static BottomSheet_CloseCallBack getInstance() {
        if (onSelect_callBAck == null) {
            onSelect_callBAck = new BottomSheet_CloseCallBack();
        }

        return onSelect_callBAck;
    }

    private BottomSheet_CloseCallBack() {

    }

    public interface interface_BottomSheetCloseCallBack {


        void on_BottomSheetItemSelected(int itemPosition, String itemName, String callingFrom);


    }

    public void init_interface_ItemSelected(BottomSheet_CloseCallBack.interface_BottomSheetCloseCallBack
                                                    interface_BottomSheetCloseCallBack) {
        this.interface_BottomSheetCloseCallBack = interface_BottomSheetCloseCallBack;

    }

    public void notifyon_BottomSheetItemSelected(int itemPosition, String itemName, String callingFrom) {
        if (interface_BottomSheetCloseCallBack != null) {
            interface_BottomSheetCloseCallBack.on_BottomSheetItemSelected(itemPosition, itemName, callingFrom);
        }
    }


    public void releaseCallback() {
        interface_BottomSheetCloseCallBack = null;
        onSelect_callBAck = null;

    }


}
