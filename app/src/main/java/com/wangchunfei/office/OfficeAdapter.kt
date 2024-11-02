package com.wangchunfei.office

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.wangchunfei.office.R
import com.wangchunfei.office.data.OfficeGroupInfo

/*
 * -----------------------------------------------------------------
 * Copyright (C) 2018-2028, by Victor, All rights reserved.
 * -----------------------------------------------------------------
 * File: DocAdapter
 * Author: Victor
 * Date: 2023/10/26 10:56
 * Description: 
 * -----------------------------------------------------------------
 */

class OfficeAdapter(var context: Context, var listener: AdapterView.OnItemClickListener)
    : RecyclerView.Adapter<OfficeViewHolder>() {

    var datas = ArrayList<OfficeGroupInfo>()

    fun showDatas(docList: ArrayList<OfficeGroupInfo>) {
        datas.clear()
        datas.addAll(docList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfficeViewHolder {
        return OfficeViewHolder(inflate(R.layout.rv_doc_cell,parent))
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: OfficeViewHolder, position: Int) {
        holder.mOnItemClickListener = listener
        holder.bindData(datas[position])
    }

    fun inflate(layoutId: Int,parent: ViewGroup): View {
        var inflater = LayoutInflater.from(context)
        return inflater.inflate(layoutId,parent, false)
    }
}