package com.example.prunedeliveryapplication


import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class SelectAddressBottomSheet : BottomSheetDialogFragment(),
    AddressSelectionAdapter.GoalSelectedInterface {
    private lateinit var img_cancel: ImageView


    lateinit var recyclerView: RecyclerView
    lateinit var arrayList: ArrayList<String>


    private var lastGoalSettingPosition = 0


    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme)
    }

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = layoutInflater.inflate(R.layout.layout_address_select, null)
        initAllViews(view)
        return view
    }

    private fun initAllViews(view: View) {
        recyclerView = view.findViewById(R.id.recyclerView)
        img_cancel = view.findViewById(R.id.img_cancel)

        img_cancel.setOnClickListener { dismiss() }
        setAdapter()

    }


    private fun setAdapter() {

        arrayList = ArrayList()
        arrayList.add("Noida Sector 37")
        arrayList.add("Noida Sector 18")
        arrayList.add("Noida Sector 16")
        arrayList.add("Noida Sector 15")
        arrayList.add("Noida Sector 8")
        arrayList.add("Noida Sector 63")
        arrayList.add("Delhi")
        arrayList.add("Pune")
        arrayList.add("Bulandshahr")
        arrayList.add("mumbai")
        arrayList.add("Goa")
        arrayList.add("Chandigarh")


        val goalSettingsAdapter =
            AddressSelectionAdapter(arrayList!!, requireActivity(), this, lastGoalSettingPosition)
        val layoutManager_service: RecyclerView.LayoutManager = LinearLayoutManager(
            activity,
            RecyclerView.VERTICAL, false
        )
        recyclerView!!.layoutManager = layoutManager_service
        recyclerView!!.adapter = goalSettingsAdapter

    }

    override fun onStart() {
        super.onStart()
    }


    override fun onFitnessLevelSelection(position: Int, title: String) {
        BottomSheet_CloseCallBack.getInstance()
            .notifyon_BottomSheetItemSelected(position, title, "Address_BottomSheet")

        dismiss()
    }


}