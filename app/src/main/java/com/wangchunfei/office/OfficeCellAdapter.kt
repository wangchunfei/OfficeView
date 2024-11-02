package com.wangchunfei.office

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.wangchunfei.office.R
import com.wangchunfei.office.data.OfficeInfo

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

class OfficeCellAdapter(var context: Context,
                        var listener: AdapterView.OnItemClickListener?,
                        var parentPosition: Int)
    : RecyclerView.Adapter<OfficeCellViewHolder>() {

    var datas = ArrayList<OfficeInfo>()

    fun showDatas(docList: ArrayList<OfficeInfo>?) {
        datas.clear()
        docList?.let { datas.addAll(it) }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfficeCellViewHolder {
        return OfficeCellViewHolder(inflate(R.layout.rv_doc_item_cell,parent),parentPosition)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: OfficeCellViewHolder, position: Int) {
        holder.mOnItemClickListener = listener
        holder.bindData(datas[position])
    }

    fun inflate(layoutId: Int,parent: ViewGroup): View {
        var inflater = LayoutInflater.from(context)
        return inflater.inflate(layoutId,parent, false)
    }
}