package com.machado.lightsky.core.presentation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder(parent: ViewGroup, layoutId: Int) : RecyclerView.ViewHolder(parent.inflateView(layoutId))

private fun ViewGroup.inflateView(layoutId: Int) = LayoutInflater.from(context).inflate(layoutId, this, false)