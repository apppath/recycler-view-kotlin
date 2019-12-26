package com.basic.programming.recyclerviewapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class VersionAdapters(var context: Context, var arrayList: ArrayList<Versions>) :
    RecyclerView.Adapter<VersionAdapters.HolderView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderView {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.version_card_view_item, parent, false)
        return HolderView(view)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: HolderView, position: Int) {

        var versions: Versions = arrayList.get(position)

        holder.codeName.text = versions.codeName
        holder.versionNumber.text = versions.codeNumbers
        holder.codeName.setOnClickListener(View.OnClickListener {
            Toast.makeText(context, versions.codeName, Toast.LENGTH_LONG).show()
        })
    }

    class HolderView(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var codeName = itemView.findViewById<TextView>(R.id.version_name_text_view)
        var versionNumber = itemView.findViewById<TextView>(R.id.version_code_text_view)

    }


}