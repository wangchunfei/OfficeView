package com.wangchunfei.office

import android.view.View
import android.view.View.OnClickListener
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.RecyclerView
import com.wangchunfei.office.data.OfficeGroupInfo
import kotlinx.android.synthetic.main.rv_doc_cell.view.*

/*
 * -----------------------------------------------------------------
 * Copyright (C) 2018-2028, by Victor, All rights reserved.
 * -----------------------------------------------------------------
 * File: OfficeViewHolder
 * Author: Victor
 * Date: 2023/10/26 10:57
 * Description: 
 * -----------------------------------------------------------------
 */

class OfficeViewHolder : RecyclerView.ViewHolder,OnClickListener {
    var mOnItemClickListener: OnItemClickListener? = null
    constructor(itemView: View) : super(itemView) {
        itemView.setOnClickListener(this)
    }

    fun bindData(data: OfficeGroupInfo?) {
        itemView.mTvTypeName.text = data?.typeName

//        itemView.mRvDocCell.onFlingListener = null
//        LinearSnapHelper().attachToRecyclerView(itemView.mRvDocCell)

        var cellAdapter = OfficeCellAdapter(itemView.context,mOnItemClickListener,
            adapterPosition)
        cellAdapter.showDatas(data?.docList)

        itemView.mRvDocCell.adapter = cellAdapter
    }

    override fun onClick(v: View?) {
        mOnItemClickListener?.onItemClick(null,v,adapterPosition,0)
    }

}