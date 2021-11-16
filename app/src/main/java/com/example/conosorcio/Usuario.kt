package com.example.conosorcio

import android.os.Parcel
import android.os.Parcelable


data class Usuario (var nombre :String = "", var apellido : String = "") : Parcelable {// Esta es una clase de tipo data class.
                                                                                       //es data class y tiene implementado los metodos
                                                                                        //parcelables
                                                                     //contiene 2 propiedades que son nombre y apellido tipo String
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(apellido)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Usuario> {
        override fun createFromParcel(parcel: Parcel): Usuario {
            return Usuario(parcel)
        }

        override fun newArray(size: Int): Array<Usuario?> {
            return arrayOfNulls(size)
        }
    }
}