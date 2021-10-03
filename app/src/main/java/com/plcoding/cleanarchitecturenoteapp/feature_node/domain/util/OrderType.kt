package com.plcoding.cleanarchitecturenoteapp.feature_node.domain.util

import androidx.room.FtsOptions

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
