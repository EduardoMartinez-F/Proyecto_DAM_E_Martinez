package com.emartinez.app_domotica.api

import com.google.gson.annotations.SerializedName

data class EntityId(
    @SerializedName("entity_id") val entityId: String,
)
