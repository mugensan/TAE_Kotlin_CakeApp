package com.example.tae_kotlin_cakeapp.model

import com.google.gson.annotations.SerializedName


data class CakeBaseModel (

	@SerializedName("title") val title : String,
	@SerializedName("desc") val desc : String,
	@SerializedName("image") val image : String
)